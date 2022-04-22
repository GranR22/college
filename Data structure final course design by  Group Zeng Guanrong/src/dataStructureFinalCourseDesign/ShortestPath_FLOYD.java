package dataStructureFinalCourseDesign;

//Floyd算法

public class ShortestPath_FLOYD {
	// 顶点v和w之间的最短路径P[v][w],若P[v][w][u]为true,则u是从v到w最短路径上的顶点
		private boolean[][][] P;
		// 顶点v和w之间的最短路径上的带权长度D[v][w]
		private int[][] D;
		public final static int INFINITY = Integer.MAX_VALUE;// 最大

		public void FLOYD(MGraph G) {
			int vexNum = G.getVexNum();
			P = new boolean[vexNum][vexNum][vexNum];
			D = new int[vexNum][vexNum];
			for (int v = 0; v < vexNum; v++) {
				for (int w = 0; w < vexNum; w++) {
					D[v][w] = G.getArcs()[v][w];
					for (int u = 0; u < vexNum; u++) {
						P[v][w][u] = false;
					}
					if (D[v][w] < INFINITY) {
						P[v][w][v] = true;
						P[v][w][w] = true;
					}
				}
			}
			// 核心代码
			for (int u = 0; u < vexNum; u++) {
				for (int v = 0; v < vexNum; v++) {
					for (int w = 0; w < vexNum; w++) {
						if (D[v][u] < INFINITY && D[u][w] < INFINITY && D[v][u] + D[u][w] < D[v][w]) {
							D[v][w] = D[v][u] + D[u][w];
							for (int i = 0; i < vexNum; i++) {
								P[v][w][i] = P[v][u][i] || P[u][w][i];
							}
						}
					}
				}
			}
		}

		public int[][] getD() {
			return D;
		}

		public boolean[][][] getP() {
			return P;
		}
}
