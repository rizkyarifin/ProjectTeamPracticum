# Project Praktikum 3 - Struktur Data (Tree, Hash Table, Graph)

## Struktur Direktori

```
src/
  kelompok/
    bst/
      BST.java
      BSTNode.java
    expressiontree/
      ExpressionTree.java
      ExpressionTreeNode.java
    hashtable/
      Mahasiswa.java
      MahasiswaHashTable.java
    graph/
      Graph.java
      Dijkstra.java
    util/
      DataGenerator.java
  Main.java
laporan/
  LaporanTemplate.docx
```

## Pembagian Tugas

1. **Anggota 1: Muhammad Rizky Arifin (Binary Search Tree/BST)**
   - Studi Kasus: Sistem indeks pencarian dalam dokumen.
   - Implementasi: Buat BST untuk menyimpan dan mencari kata kunci (keyword) beserta posisi/halaman dalam dokumen.
   - Fitur yang harus diimplementasikan:
     - insert(keyword, posisi/halaman): Menambah kata kunci beserta posisi/halaman ke dalam BST.
     - search(keyword): Mencari kata kunci dan menampilkan semua posisi/halaman kemunculannya.
     - delete(keyword): Menghapus kata kunci dari BST.
     - traversal (inorder, preorder, postorder): Menampilkan seluruh indeks dokumen secara terurut.
   - Contoh output:
     - Tambah: Kata 'algoritma' di halaman 3
     - Cari: Kata 'algoritma' ditemukan di halaman 3, 7
     - Hapus: Kata 'struktur' dihapus dari indeks
     - Traversal: Menampilkan seluruh kata kunci beserta daftar halamannya
   - File: `BST.java`, `BSTNode.java`
   - Catatan: Komentari setiap method dan buat contoh penggunaan di Main.java

2. **Anggota 2: Expression Tree**
   - Studi Kasus: Ekspresi matematika berbasis Expression Tree.
   - Implementasi: Buat Expression Tree untuk parsing, membangun tree dari ekspresi matematika, menampilkan tree, dan mengevaluasi hasil ekspresi.
   - Fitur yang harus diimplementasikan:
     - buildTree(expression): Membangun expression tree dari string ekspresi matematika (misal: (3 + 5) * 2).
     - evaluate(): Mengevaluasi hasil ekspresi dari tree yang sudah dibangun.
     - inorderTraversal(): Menampilkan ekspresi dalam bentuk infix (inorder).
     - printTree(): Menampilkan struktur tree secara visual (opsional, jika sempat).
   - Contoh output:
     - Input: (3 + 5) * 2
     - Tree:
           (*)
          /   \
        (+)    2
       /   \
      3     5
     - Hasil Evaluasi: 16
   - File: `ExpressionTree.java`, `ExpressionTreeNode.java`
   - Catatan: Komentari setiap method dan buat contoh penggunaan di Main.java

3. **Anggota 3: Hash Table (Data Mahasiswa)**
   - Studi Kasus: Sistem penyimpanan dan pencarian data mahasiswa menggunakan Hash Table.
   - Implementasi: Buat Hash Table (menggunakan HashMap) untuk menyimpan, mencari, dan menghapus data mahasiswa berdasarkan NIM.
   - Fitur yang harus diimplementasikan:
     - tambahMahasiswa(nim, nama, ipk): Menambah data mahasiswa ke dalam Hash Table.
     - cariMahasiswa(nim): Mencari mahasiswa berdasarkan NIM.
     - hapusMahasiswa(nim): Menghapus data mahasiswa berdasarkan NIM.
     - tampilkanSemuaMahasiswa(): Menampilkan seluruh data mahasiswa yang tersimpan.
   - Contoh output:
     - Tambah: NIM 12345, Nama: Andi, IPK: 3.75
     - Cari: NIM 12345 ditemukan - Andi, IPK 3.75
     - Hapus: NIM 12345 dihapus dari data
     - Tampil: Daftar seluruh mahasiswa
   - File: `Mahasiswa.java`, `MahasiswaHashTable.java`
   - Catatan: Komentari setiap method dan buat contoh penggunaan di Main.java

4. **Anggota 4: Graph & Dijkstra**
   - Studi Kasus: Simulasi jalur terpendek menggunakan algoritma Dijkstra dalam sistem navigasi.
   - Implementasi: Buat Graph berbasis adjacency list untuk merepresentasikan peta (lokasi dan jalan), serta algoritma Dijkstra untuk mencari jalur terpendek antar lokasi.
   - Fitur yang harus diimplementasikan:
     - tambahSimpul(label): Menambah simpul/lokasi ke dalam graph.
     - tambahEdge(dari, ke, bobot): Menambah edge/jalan dengan bobot jarak.
     - BFS(start): Menelusuri graph dengan Breadth-First Search.
     - DFS(start): Menelusuri graph dengan Depth-First Search.
     - dijkstra(start, tujuan): Mencari jalur terpendek dari satu lokasi ke lokasi lain.
   - Contoh output:
     - Input: Titik awal A, tujuan E
     - Output: Jalur terpendek ditemukan: A → B → C → E, Jarak total: 12 km
   - File: `Graph.java`, `Dijkstra.java`
   - Catatan: Komentari setiap method dan buat contoh penggunaan di Main.java

5. **Anggota 5: Integrasi, Data Generator, & Laporan**
   - Studi Kasus: Integrasi seluruh fitur, pembuatan data uji otomatis, dan penyusunan laporan.
   - Implementasi: Integrasikan seluruh fitur ke dalam Main.java, buat DataGenerator untuk generate data uji (10-20 data), dan siapkan template laporan.
   - Fitur yang harus diimplementasikan:
     - Integrasi menu CLI sederhana di Main.java untuk mengakses semua fitur.
     - DataGenerator: generateDataBST, generateDataMahasiswa, generateDataGraph.
     - Laporan: Template laporan di folder laporan/.
   - Contoh output:
     - Menu utama aplikasi, pengujian semua fitur, dan hasil data uji.
   - File: `Main.java`, `DataGenerator.java`, `laporan/LaporanTemplate.docx`
   - Catatan: Komentari setiap bagian integrasi dan dokumentasi

## Studi Kasus yang Dikerjakan

- **Anggota 1: Binary Search Tree (BST)**
  - Studi Kasus: Sistem indeks pencarian dalam dokumen.
  - Implementasi: BST digunakan untuk menyimpan dan mencari kata kunci (keyword) beserta posisi/halaman dalam dokumen.
  - File: `BST.java`, `BSTNode.java`

- **Anggota 2: Expression Tree**
  - Studi Kasus: Ekspresi matematika berbasis Expression Tree.
  - Implementasi: Expression Tree digunakan untuk parsing, membangun tree dari ekspresi matematika, menampilkan tree, dan mengevaluasi hasil ekspresi.
  - File: `ExpressionTree.java`, `ExpressionTreeNode.java`

- **Anggota 3: Hash Table (Data Mahasiswa)**
  - Studi Kasus: Sistem penyimpanan dan pencarian data mahasiswa menggunakan Hash Table.
  - Implementasi: Hash Table digunakan untuk tambah, cari, dan hapus data mahasiswa berdasarkan NIM.
  - File: `Mahasiswa.java`, `MahasiswaHashTable.java`

- **Anggota 4: Graph & Dijkstra**
  - Studi Kasus: Simulasi jalur terpendek menggunakan algoritma Dijkstra dalam sistem navigasi.
  - Implementasi: Graph digunakan untuk merepresentasikan peta (lokasi dan jalan), serta mencari jalur terpendek antar lokasi.
  - File: `Graph.java`, `Dijkstra.java`

- **Anggota 5: Integrasi, Data Generator, & Laporan**
  - Integrasi semua fitur di `Main.java`, data uji di `DataGenerator.java`, template laporan

## Penyesuaian Struktur Project

- Setiap package sudah disesuaikan untuk mendukung studi kasus di atas.
- Setiap anggota dapat langsung mengerjakan studi kasus sesuai file dan package yang sudah disiapkan.
- Contoh input/output dan data uji dapat disesuaikan dengan studi kasus pada soal.

## Petunjuk Pengerjaan

- Setiap anggota hanya mengedit file sesuai tugasnya.
- Gunakan package sesuai struktur di atas.
- Komit kode dengan komentar yang jelas.
- Setelah selesai, gabungkan semua file, uji program, dan lengkapi laporan.
- Laporan wajib berisi: penjelasan metode, analisis hasil eksperimen, kesimpulan kelebihan & kekurangan struktur data.

## Kompilasi & Menjalankan Program

1. Pastikan semua file Java berada di dalam folder `src/kelompok/` sesuai struktur.
2. Jalankan `Main.java` untuk menguji seluruh fitur.
3. Gunakan IDE (IntelliJ IDEA, Eclipse, dsb) atau terminal:
   ```
   javac -d out src/kelompok/**/*.java src/Main.java
   java -cp out Main
   ```

## Petunjuk Penggunaan Program BST (Indeks Dokumen)

1. Jalankan aplikasi dengan mengikuti petunjuk kompilasi dan eksekusi di bawah.
2. Pilih menu "Indeks Dokumen (BST)" pada menu utama.
3. Gunakan submenu berikut:
   - Tambah kata kunci: Masukkan kata kunci dan posisi/halaman untuk menambah indeks.
   - Cari kata kunci: Masukkan kata kunci untuk melihat di halaman mana saja kata tersebut muncul.
   - Hapus kata kunci: Masukkan kata kunci yang ingin dihapus dari indeks.
   - Tampilkan seluruh indeks (inorder): Menampilkan seluruh kata kunci beserta daftar halamannya secara terurut.
4. Kembali ke menu utama dengan memilih opsi "Kembali ke menu utama".
5. Pilih "Keluar" untuk menutup aplikasi.

## Catatan
- Komentar harus jelas di setiap class dan method.
- Gunakan minimal 10-20 data uji.
- Laporan dikumpulkan dalam folder `laporan/`.

---

Selamat mengerjakan! Jika ada pertanyaan teknis, diskusikan di grup sebelum menggabungkan hasil akhir.
