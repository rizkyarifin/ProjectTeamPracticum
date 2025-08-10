import kelompok.bst.BST;
import java.util.List;
import java.util.Scanner;
import kelompok.expressiontree.ExpressionTree;
import kelompok.hashtable.Mahasiswa;
import kelompok.hashtable.MahasiswaHashTable;
import kelompok.graph.Graph;
import kelompok.graph.Dijkstra;
import kelompok.util.DataGenerator;

/**
 * Main class untuk integrasi dan pengujian semua fitur.
 *
 * Contoh penggunaan fitur BST (Anggota 1):
 * - Tambah kata kunci dan posisi/halaman
 * - Cari kata kunci
 * - Hapus kata kunci
 * - Traversal (inorder)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST bst = new BST();
        while (true) {
            System.out.println("\n=== MENU UTAMA APLIKASI ===");
            System.out.println("1. Indeks Dokumen (BST)");
            System.out.println("2. Ekspresi Matematika (Expression Tree)");
            System.out.println("3. Data Mahasiswa (Hash Table)");
            System.out.println("4. Simulasi Navigasi (Graph & Dijkstra)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu utama: ");
            int mainMenu = scanner.nextInt();
            scanner.nextLine();
            if (mainMenu == 1) {
                // === SUBMENU BST ===
                while (true) {
                    System.out.println("\n=== MENU BST INDEKS DOKUMEN ===");
                    System.out.println("1. Tambah kata kunci");
                    System.out.println("2. Cari kata kunci");
                    System.out.println("3. Hapus kata kunci");
                    System.out.println("4. Tampilkan seluruh indeks (inorder)");
                    System.out.println("5. Kembali ke menu utama");
                    System.out.print("Pilih menu: ");
                    int pilih = scanner.nextInt();
                    scanner.nextLine();
                    if (pilih == 1) {
                        System.out.print("Masukkan kata kunci: ");
                        String keyword = scanner.nextLine();
                        System.out.print("Masukkan posisi/halaman: ");
                        int pos = scanner.nextInt();
                        scanner.nextLine();
                        bst.insert(keyword, pos);
                        System.out.println("Kata '" + keyword + "' di halaman " + pos + " berhasil ditambah.");
                    } else if (pilih == 2) {
                        System.out.print("Masukkan kata kunci yang dicari: ");
                        String keyword = scanner.nextLine();
                        List<Integer> hasil = bst.search(keyword);
                        if (hasil != null) {
                            System.out.println("Kata '" + keyword + "' ditemukan di halaman: " + hasil);
                        } else {
                            System.out.println("Kata '" + keyword + "' tidak ditemukan.");
                        }
                    } else if (pilih == 3) {
                        System.out.print("Masukkan kata kunci yang dihapus: ");
                        String keyword = scanner.nextLine();
                        bst.delete(keyword);
                        System.out.println("Kata '" + keyword + "' dihapus dari indeks.");
                    } else if (pilih == 4) {
                        System.out.println("Seluruh indeks dokumen (inorder):");
                        bst.inorder();
                    } else if (pilih == 5) {
                        break;
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                }
            } else if (mainMenu == 2) {
                // TODO: Tambahkan submenu Expression Tree di sini
                System.out.println("[Menu Expression Tree belum diimplementasikan]");
            } else if (mainMenu == 3) {
                MahasiswaHashTable mhsTable = new MahasiswaHashTable();
                while (true) {
                    System.out.println("\n=== MENU HASH TABLE MAHASISWA ===");
                    System.out.println("1. Tambah Mahasiswa");
                    System.out.println("2. Cari Mahasiswa");
                    System.out.println("3. Hapus Mahasiswa");
                    System.out.println("4. Tampilkan Semua Mahasiswa");
                    System.out.println("5. Kembali ke menu utama");
                    System.out.print("Pilih menu: ");
                    int pilih = scanner.nextInt();
                    scanner.nextLine();

                    if (pilih == 1) {
                        System.out.print("Masukkan NIM: ");
                        String nim = scanner.nextLine();
                        System.out.print("Masukkan Nama: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan IPK: ");
                        double ipk = scanner.nextDouble();
                        scanner.nextLine();
                        mhsTable.tambahMahasiswa(new Mahasiswa(nim, nama, ipk));
                    } else if (pilih == 2) {
                        System.out.print("Masukkan NIM yang dicari: ");
                        String nim = scanner.nextLine();
                        mhsTable.cariMahasiswa(nim);
                    } else if (pilih == 3) {
                        System.out.print("Masukkan NIM yang dihapus: ");
                        String nim = scanner.nextLine();
                        mhsTable.hapusMahasiswa(nim);
                    } else if (pilih == 4) {
                        mhsTable.tampilkanSemuaMahasiswa();
                    } else if (pilih == 5) {
                        break;
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                }
            } else if (mainMenu == 4) {
                // TODO: Tambahkan submenu Graph & Dijkstra di sini
                System.out.println("[Menu Graph & Dijkstra belum diimplementasikan]");
            } else if (mainMenu == 5) {
                System.out.println("Keluar.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}
