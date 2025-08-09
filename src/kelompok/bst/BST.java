package kelompok.bst;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Search Tree (BST) untuk sistem indeks pencarian dalam dokumen.
 *
 * Studi Kasus:
 *   Sistem ini digunakan untuk menyimpan dan mencari kata kunci (keyword) beserta daftar posisi/halaman kemunculannya dalam dokumen.
 *   Cocok untuk aplikasi seperti indeks buku, pencarian kata dalam dokumen, atau sistem pencarian sederhana.
 *
 * Fitur Utama:
 *   - insert(keyword, posisi): Menambah kata kunci dan posisi/halaman ke dalam BST.
 *   - search(keyword): Mencari kata kunci dan menampilkan semua posisi/halaman kemunculannya.
 *   - delete(keyword): Menghapus kata kunci dari BST.
 *   - traversal (inorder, preorder, postorder): Menampilkan seluruh indeks dokumen secara terurut.
 *
 * Contoh Penggunaan:
 *   BST bst = new BST();
 *   bst.insert("algoritma", 3); // Tambah kata 'algoritma' di halaman 3
 *   bst.insert("algoritma", 7); // Tambah kata 'algoritma' di halaman 7
 *   bst.insert("struktur", 2);  // Tambah kata 'struktur' di halaman 2
 *   List<Integer> hasil = bst.search("algoritma"); // [3, 7]
 *   bst.delete("struktur"); // Hapus kata 'struktur'
 *   bst.inorder(); // Tampilkan seluruh indeks secara terurut
 *
 * Setiap node BST menyimpan:
 *   - keyword: kata kunci (String)
 *   - positions: daftar posisi/halaman kemunculan (List<Integer>)
 *
 * @author Anggota 1
 */
public class BST {
    private BSTNode root;

    public BST() {
        root = null;
    }

    /**
     * Menambah kata kunci dan posisi/halaman ke dalam BST.
     */
    public void insert(String keyword, int position) {
        root = insertRec(root, keyword, position);
    }

    private BSTNode insertRec(BSTNode node, String keyword, int position) {
        if (node == null) {
            return new BSTNode(keyword, position);
        }
        int cmp = keyword.compareToIgnoreCase(node.keyword);
        if (cmp < 0) {
            node.left = insertRec(node.left, keyword, position);
        } else if (cmp > 0) {
            node.right = insertRec(node.right, keyword, position);
        } else {
            // Jika keyword sudah ada, tambahkan posisi jika belum ada
            if (!node.positions.contains(position)) {
                node.positions.add(position);
            }
        }
        return node;
    }

    /**
     * Mencari kata kunci dan mengembalikan daftar posisi/halaman.
     */
    public List<Integer> search(String keyword) {
        BSTNode node = searchRec(root, keyword);
        if (node != null) {
            return node.positions;
        }
        return null;
    }

    private BSTNode searchRec(BSTNode node, String keyword) {
        if (node == null) return null;
        int cmp = keyword.compareToIgnoreCase(node.keyword);
        if (cmp < 0) return searchRec(node.left, keyword);
        else if (cmp > 0) return searchRec(node.right, keyword);
        else return node;
    }

    /**
     * Menghapus kata kunci dari BST.
     */
    public void delete(String keyword) {
        root = deleteRec(root, keyword);
    }

    private BSTNode deleteRec(BSTNode node, String keyword) {
        if (node == null) return null;
        int cmp = keyword.compareToIgnoreCase(node.keyword);
        if (cmp < 0) {
            node.left = deleteRec(node.left, keyword);
        } else if (cmp > 0) {
            node.right = deleteRec(node.right, keyword);
        } else {
            // Node ditemukan
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            // Dua anak: cari pengganti terkecil di kanan
            BSTNode min = minValueNode(node.right);
            node.keyword = min.keyword;
            node.positions = min.positions;
            node.right = deleteRec(node.right, min.keyword);
        }
        return node;
    }

    private BSTNode minValueNode(BSTNode node) {
        BSTNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    /**
     * Traversal inorder: menampilkan seluruh indeks dokumen secara terurut.
     */
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(BSTNode node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.println(node.keyword + " -> " + node.positions);
            inorderRec(node.right);
        }
    }

    /**
     * Traversal preorder.
     */
    public void preorder() {
        preorderRec(root);
    }

    private void preorderRec(BSTNode node) {
        if (node != null) {
            System.out.println(node.keyword + " -> " + node.positions);
            preorderRec(node.left);
            preorderRec(node.right);
        }
    }

    /**
     * Traversal postorder.
     */
    public void postorder() {
        postorderRec(root);
    }

    private void postorderRec(BSTNode node) {
        if (node != null) {
            postorderRec(node.left);
            postorderRec(node.right);
            System.out.println(node.keyword + " -> " + node.positions);
        }
    }
}
