package kelompok.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Kelas MahasiswaHashTable untuk menyimpan dan mengelola data mahasiswa
 * menggunakan HashMap.
 *
 * Tugas Anggota 3:
 * - Implementasikan method tambah, cari, hapus mahasiswa.
 * - Tambahkan komentar pada setiap method.
 * - Buat contoh penggunaan di Main.java.
 */
public class MahasiswaHashTable {
    private HashMap<String, Mahasiswa> table;

    public MahasiswaHashTable() {
        table = new HashMap<>();
    }

    /**
     * Menambahkan data mahasiswa ke dalam Hash Table
     * 
     * @param mhs objek Mahasiswa yang akan ditambahkan
     */
    public void tambahMahasiswa(Mahasiswa mhs) {
        table.put(mhs.getNim(), mhs);
        System.out.println("Tambah: NIM " + mhs.getNim() + ", Nama: " + mhs.getNama() + ", IPK: " + mhs.getIpk());
    }

    /**
     * Mencari mahasiswa berdasarkan NIM
     * 
     * @param nim NIM mahasiswa
     */
    public void cariMahasiswa(String nim) {
        Mahasiswa mhs = table.get(nim);
        if (mhs != null) {
            System.out.println("Cari: NIM " + nim + " ditemukan - " + mhs.getNama() + ", IPK " + mhs.getIpk());
        } else {
            System.out.println("Cari: NIM " + nim + " tidak ditemukan.");
        }
    }

    /**
     * Menghapus mahasiswa berdasarkan NIM
     * 
     * @param nim NIM mahasiswa
     */
    public void hapusMahasiswa(String nim) {
        Mahasiswa removed = table.remove(nim);
        if (removed != null) {
            System.out.println("Hapus: NIM " + nim + " dihapus dari data.");
        } else {
            System.out.println("Hapus: NIM " + nim + " tidak ditemukan.");
        }
    }

    /**
     * Menampilkan semua mahasiswa
     */
    public void tampilkanSemuaMahasiswa() {
        System.out.println("Tampil: Daftar seluruh mahasiswa");
        if (table.isEmpty()) {
            System.out.println("(Data kosong)");
            return;
        }
        for (Map.Entry<String, Mahasiswa> entry : table.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

}
