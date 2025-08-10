package kelompok.graph;

import java.util.*;

/**
 * Kelas Graph untuk representasi graf berbasis adjacency list.
 * Menyediakan operasi tambah simpul, tambah edge, BFS, DFS,
 * dan fungsi pendukung untuk algoritma Dijkstra.
 */

/** Tugas Anggota 4:
 * - Implementasikan method tambah simpul/edge, BFS, DFS, Dijkstra.
 * - Tambahkan komentar pada setiap method.
 * - Buat contoh penggunaan di Main.java.
 */
public class Graph {
    // adjacency list: setiap simpul menyimpan daftar edge
    private Map<String, List<Edge>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    /**
     * Menambah simpul/lokasi ke dalam graph.
     * @param label nama simpul
     */
    public void tambahSimpul(String label) {
        adjList.putIfAbsent(label, new ArrayList<>());
    }

    /**
     * Menambah edge/jalan berbobot antar simpul.
     * @param dari simpul asal
     * @param ke simpul tujuan
     * @param bobot jarak (misal km)
     */
    public void tambahEdge(String dari, String ke, int bobot) {
        tambahSimpul(dari);
        tambahSimpul(ke);
        adjList.get(dari).add(new Edge(ke, bobot));
        adjList.get(ke).add(new Edge(dari, bobot)); // graph tak berarah
    }

    /**
     * Menelusuri graph menggunakan BFS (Breadth-First Search).
     * @param start simpul awal
     * @return daftar simpul dalam urutan kunjungan
     */
    public List<String> BFS(String start) {
        List<String> hasil = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            hasil.add(current);

            for (Edge edge : adjList.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(edge.tujuan)) {
                    visited.add(edge.tujuan);
                    queue.add(edge.tujuan);
                }
            }
        }
        return hasil;
    }

    /**
     * Menelusuri graph menggunakan DFS (Depth-First Search).
     * @param start simpul awal
     * @return daftar simpul dalam urutan kunjungan
     */
    public List<String> DFS(String start) {
        List<String> hasil = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        DFSRekursif(start, visited, hasil);
        return hasil;
    }

    // Helper rekursif untuk DFS
    private void DFSRekursif(String current, Set<String> visited, List<String> hasil) {
        visited.add(current);
        hasil.add(current);

        for (Edge edge : adjList.getOrDefault(current, new ArrayList<>())) {
            if (!visited.contains(edge.tujuan)) {
                DFSRekursif(edge.tujuan, visited, hasil);
            }
        }
    }

    /**
     * Mengambil semua simpul di graph.
     * @return set berisi label simpul
     */
    public Set<String> getVertices() {
        return adjList.keySet();
    }

    /**
     * Mengambil tetangga suatu simpul beserta bobotnya.
     * @param vertex simpul
     * @return map <tujuan, bobot>
     */
    public Map<String, Integer> getNeighbors(String vertex) {
        Map<String, Integer> neighbors = new HashMap<>();
        if (adjList.containsKey(vertex)) {
            for (Edge edge : adjList.get(vertex)) {
                neighbors.put(edge.tujuan, edge.bobot);
            }
        }
        return neighbors;
    }

    /**
     * Kelas Edge untuk merepresentasikan jalan/edge berbobot.
     */
    public static class Edge {
        public String tujuan;
        public int bobot;

        public Edge(String tujuan, int bobot) {
            this.tujuan = tujuan;
            this.bobot = bobot;
        }
    }
}
