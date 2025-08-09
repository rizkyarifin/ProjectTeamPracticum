package kelompok.graph;

import java.util.*;

/**
 * Kelas Graph untuk representasi graf berbasis adjacency list.
 * Mendukung penambahan simpul, edge, BFS, DFS, dan Dijkstra.
 *
 * Tugas Anggota 4:
 * - Implementasikan method tambah simpul/edge, BFS, DFS, Dijkstra.
 * - Tambahkan komentar pada setiap method.
 * - Buat contoh penggunaan di Main.java.
 */
public class Graph {
    private Map<String, List<Edge>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // TODO: Implementasi method tambahSimpul(String label)
    // TODO: Implementasi method tambahEdge(String dari, String ke, int bobot)
    // TODO: Implementasi method BFS(String start)
    // TODO: Implementasi method DFS(String start)
    // TODO: Implementasi method dijkstra(String start, String tujuan)

    // Tambahkan method lain jika diperlukan

    /**
     * Kelas Edge untuk representasi edge berbobot.
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

