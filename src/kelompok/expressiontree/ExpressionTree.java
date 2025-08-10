package kelompok.expressiontree;

import java.util.*;

/**
 * Kelas ExpressionTree untuk membangun dan mengevaluasi expression tree
 * dari ekspresi matematika (infix).
 *
 * Tugas Anggota 2:
 * - Implementasi parsing ekspresi, membangun tree, evaluasi ekspresi, dan traversal inorder.
 * - Tambahkan komentar pada setiap method.
 * - Buat contoh penggunaan di Main.java.
 */
public class ExpressionTree {
    private ExpressionTreeNode root; // root dari expression tree

    public ExpressionTree() {
        root = null;
    }

    /**
     * Membangun expression tree dari string ekspresi matematika.
     * @param expression ekspresi dalam format infix, contoh: (3 + 5) * 2
     */
    public void buildTree(String expression) {
        List<String> tokens = tokenize(expression); // ubah string jadi list token
        List<String> postfix = infixToPostfix(tokens); // konversi ke postfix
        root = buildFromPostfix(postfix); // bangun tree dari postfix
    }

    /**
     * Mengevaluasi expression tree dan mengembalikan hasilnya.
     * @return hasil evaluasi (double)
     */
    public double evaluate() {
        return evaluateNode(root);
    }

    /**
     * Traversal inorder (mengembalikan string struktur infix).
     * @return string hasil traversal inorder
     */
    public String inorderTraversal() {
        return inorder(root);
    }

    // ==================== Helper Methods ====================

    private List<String> tokenize(String expr) {
        List<String> tokens = new ArrayList<>();
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (Character.isWhitespace(c)) continue;
            if (Character.isDigit(c) || c == '.') {
                num.append(c);
            } else {
                if (num.length() > 0) {
                    tokens.add(num.toString());
                    num.setLength(0);
                }
                tokens.add(Character.toString(c));
            }
        }
        if (num.length() > 0) tokens.add(num.toString());
        return tokens;
    }

    private int precedence(String op) {
        switch (op) {
            case "^": return 4;
            case "*": case "/": return 3;
            case "+": case "-": return 2;
            default: return 0;
        }
    }

    private boolean isRightAssociative(String op) {
        return "^".equals(op);
    }

    private boolean isOperator(String t) {
        return "+-*/^".contains(t);
    }

    private List<String> infixToPostfix(List<String> tokens) {
        List<String> out = new ArrayList<>();
        Deque<String> ops = new ArrayDeque<>();
        for (String t : tokens) {
            if (t.isEmpty()) continue;
            if (Character.isDigit(t.charAt(0))) {
                out.add(t);
            } else if (isOperator(t)) {
                while (!ops.isEmpty() && isOperator(ops.peek())) {
                    String top = ops.peek();
                    int pTop = precedence(top);
                    int pT = precedence(t);
                    if ((isRightAssociative(t) && pT < pTop) || (!isRightAssociative(t) && pT <= pTop)) {
                        out.add(ops.pop());
                    } else break;
                }
                ops.push(t);
            } else if ("(".equals(t)) {
                ops.push(t);
            } else if (")".equals(t)) {
                while (!ops.isEmpty() && !"(".equals(ops.peek())) out.add(ops.pop());
                if (!ops.isEmpty() && "(".equals(ops.peek())) ops.pop();
            }
        }
        while (!ops.isEmpty()) out.add(ops.pop());
        return out;
    }

    private ExpressionTreeNode buildFromPostfix(List<String> postfix) {
        Deque<ExpressionTreeNode> stack = new ArrayDeque<>();
        for (String tok : postfix) {
            if (isOperator(tok)) {
                ExpressionTreeNode right = stack.pop();
                ExpressionTreeNode left = stack.pop();
                ExpressionTreeNode node = new ExpressionTreeNode(tok);
                node.setLeft(left);
                node.setRight(right);
                stack.push(node);
            } else {
                stack.push(new ExpressionTreeNode(tok));
            }
        }
        return stack.isEmpty() ? null : stack.pop();
    }

    private double evaluateNode(ExpressionTreeNode node) {
        if (node == null) return 0;
        if (!isOperator(node.getValue())) {
            return Double.parseDouble(node.getValue());
        }
        double l = evaluateNode(node.getLeft());
        double r = evaluateNode(node.getRight());
        switch (node.getValue()) {
            case "+": return l + r;
            case "-": return l - r;
            case "*": return l * r;
            case "/": return l / r;
            case "^": return Math.pow(l, r);
            default: throw new RuntimeException("Unknown operator: " + node.getValue());
        }
    }

    private String inorder(ExpressionTreeNode node) {
        if (node == null) return "";
        if (!isOperator(node.getValue())) return node.getValue();
        return "(" + inorder(node.getLeft()) + " " + node.getValue() + " " + inorder(node.getRight()) + ")";
    }
}
