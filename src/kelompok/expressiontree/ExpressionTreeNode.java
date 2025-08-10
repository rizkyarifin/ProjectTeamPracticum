package kelompok.expressiontree;

/**
 * Kelas Node untuk Expression Tree.
 * Menyimpan nilai (angka/operator) dan referensi ke anak kiri & kanan.
 */
public class ExpressionTreeNode {
    private String value;
    private ExpressionTreeNode left;
    private ExpressionTreeNode right;

    public ExpressionTreeNode(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public String getValue() {
        return value;
    }

    public ExpressionTreeNode getLeft() {
        return left;
    }

    public ExpressionTreeNode getRight() {
        return right;
    }

    public void setLeft(ExpressionTreeNode left) {
        this.left = left;
    }

    public void setRight(ExpressionTreeNode right) {
        this.right = right;
    }
}
