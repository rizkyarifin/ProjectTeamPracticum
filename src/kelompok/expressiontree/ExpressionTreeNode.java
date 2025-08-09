package kelompok.expressiontree;

/**
 * Node untuk Expression Tree.
 * Menyimpan data (operator/operand) dan referensi ke anak kiri dan kanan.
 */
public class ExpressionTreeNode {
    public String value;
    public ExpressionTreeNode left, right;

    public ExpressionTreeNode(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

