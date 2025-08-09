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

1. **Anggota 1: Binary Search Tree (BST)**
   - Implementasi BST (insert, search, delete, traversal)
   - File: `BST.java`, `BSTNode.java`
2. **Anggota 2: Expression Tree**
   - Parsing ekspresi, membangun tree, evaluasi ekspresi
   - File: `ExpressionTree.java`, `ExpressionTreeNode.java`
3. **Anggota 3: Hash Table (Data Mahasiswa)**
   - Tambah, cari, hapus mahasiswa menggunakan HashMap
   - File: `Mahasiswa.java`, `MahasiswaHashTable.java`
4. **Anggota 4: Graph & Dijkstra**
   - Tambah simpul/edge, BFS, DFS, Dijkstra
   - File: `Graph.java`, `Dijkstra.java`
5. **Anggota 5: Integrasi, Data Generator, & Laporan**
   - Integrasi semua fitur di `Main.java`, data uji di `DataGenerator.java`, template laporan

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

## Catatan
- Komentar harus jelas di setiap class dan method.
- Gunakan minimal 10-20 data uji.
- Laporan dikumpulkan dalam folder `laporan/`.

---

Selamat mengerjakan! Jika ada pertanyaan teknis, diskusikan di grup sebelum menggabungkan hasil akhir.
