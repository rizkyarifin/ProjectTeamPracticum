package kelompok.bst;

/**
 * Kelas node untuk Binary Search Tree (BST).
 * Setiap node menyimpan data bertipe integer dan referensi ke anak kiri dan kanan.
 */
public class BSTNode {
    public int data;
    public BSTNode left, right;

    public BSTNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

