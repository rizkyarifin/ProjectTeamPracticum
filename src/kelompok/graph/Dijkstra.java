package kelompok.graph;

import java.util.*;

/**
 * Kelas Dijkstra untuk menjalankan algoritma Dijkstra pada Graph.
 * Digunakan untuk mencari jalur terpendek antar lokasi.
 * 
 * Tugas Anggota 4:
 * - Implementasikan method untuk mencari jalur terpendek dari satu node ke node lain.
 * - Tambahkan komentar pada setiap method.
 * - Buat contoh penggunaan di Main.java.
 */
public class Dijkstra {

    // TODO: Implementasi method static dijkstra(Graph graph, String start, String tujuan)
    // Method ini mengembalikan hasil jalur terpendek dan total bobot */

    /**
     * Mencari jalur terpendek dari simpul start ke simpul tujuan.
     * @param graph  graph yang digunakan
     * @param start  simpul awal
     * @param tujuan simpul tujuan
     * @return string berisi jalur terpendek dan jarak total
     */
    public static String dijkstra(Graph graph, String start, String tujuan) {
        Map<String, Integer> jarak = new HashMap<>();
        Map<String, String> prev = new HashMap<>();
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparingInt(jarak::get));

        // Inisialisasi jarak semua simpul
        for (String vertex : graph.getVertices()) {
            jarak.put(vertex, Integer.MAX_VALUE);
            prev.put(vertex, null);
        }
        jarak.put(start, 0);
        queue.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (current.equals(tujuan)) break;

            for (Map.Entry<String, Integer> neighbor : graph.getNeighbors(current).entrySet()) {
                String tetangga = neighbor.getKey();
                int bobot = neighbor.getValue();
                int newDist = jarak.get(current) + bobot;

                if (newDist < jarak.get(tetangga)) {
                    jarak.put(tetangga, newDist);
                    prev.put(tetangga, current);
                    queue.add(tetangga);
                }
            }
        }

        if (jarak.get(tujuan) == Integer.MAX_VALUE) {
            return "Tidak ada jalur dari " + start + " ke " + tujuan;
        }

        // Rekonstruksi jalur
        List<String> path = new ArrayList<>();
        for (String at = tujuan; at != null; at = prev.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);

        return "Jalur terpendek ditemukan: " + String.join(" → ", path) +
               ", Jarak total: " + jarak.get(tujuan) + " km";
    }
}
