package dataStructureFinalCourseDesign;

public class MGraph {
	public final static int INFINITY = Integer.MAX_VALUE;

	private int vexNum, arcNum;// 图的当前顶点数和边数

	private Object[] vexs;// 顶点（A B C ...）

	private int[][] arcs;// 邻接矩阵

//	public MGraph() {
//		this(0, null, null);
//	}

	public MGraph(int vexNum, Object[] vexs, int[][] arcs) {
		this.vexNum = vexNum;
		this.vexs = vexs;
		this.arcs = arcs;
	}

	public int getVexNum() {
		return vexNum;
	}

	public void setVexNum(int vexNum) {
		this.vexNum = vexNum;
	}

	public int getArcNum() {
		return arcNum;
	}

	public void setArcNum(int arcNum) {
		this.arcNum = arcNum;
	}

	public Object[] getVexs() {
		return vexs;
	}

	public void setVexs(Object[] vexs) {
		this.vexs = vexs;
	}

	public int[][] getArcs() {
		return arcs;
	}

	public void setArcs(int[][] arcs) {
		this.arcs = arcs;
	}
}
