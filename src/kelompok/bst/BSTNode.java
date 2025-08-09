package kelompok.bst;

import java.util.ArrayList;
import java.util.List;

/**
 * Node untuk Binary Search Tree (BST) indeks dokumen.
 * Setiap node menyimpan kata kunci dan daftar posisi/halaman kemunculan.
 */
public class BSTNode {
    public String keyword;
    public List<Integer> positions;
    public BSTNode left, right;

    public BSTNode(String keyword, int position) {
        this.keyword = keyword;
        this.positions = new ArrayList<>();
        this.positions.add(position);
        this.left = null;
        this.right = null;
    }
}
