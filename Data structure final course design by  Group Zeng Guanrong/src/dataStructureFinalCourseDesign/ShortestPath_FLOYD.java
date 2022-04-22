package dataStructureFinalCourseDesign;

//Floyd�㷨

public class ShortestPath_FLOYD {
	// ����v��w֮������·��P[v][w],��P[v][w][u]Ϊtrue,��u�Ǵ�v��w���·���ϵĶ���
		private boolean[][][] P;
		// ����v��w֮������·���ϵĴ�Ȩ����D[v][w]
		private int[][] D;
		public final static int INFINITY = Integer.MAX_VALUE;// ���

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
			// ���Ĵ���
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
