package dataStructureFinalCourseDesign;

import java.util.Scanner;

public class Test {
	public final static int INFINITY = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// A 3#����¥ B �˶��㳡 C 2#����¥ D ʳ�� E ���� F 1#����¥ G ��ͤ H ���й㳡
		Object vexs[] = { "A", "B", "C", "D", "E", "F", "G", "H" };
		int[][] arcs = { { 0, INFINITY, 250, 300, INFINITY, INFINITY, INFINITY, INFINITY }, { INFINITY, 0, 50, INFINITY, 50, INFINITY, INFINITY, INFINITY },
			    { 250, 50, 0, INFINITY,50, 250, INFINITY,INFINITY }, { 300,INFINITY , INFINITY , 0,INFINITY , INFINITY , INFINITY, 350 },
			    {INFINITY , 50, 50 , INFINITY , 0, INFINITY , 50, INFINITY  }, { INFINITY , INFINITY,250, INFINITY, INFINITY, 0, INFINITY, 250 },
			    { INFINITY, INFINITY, INFINITY, INFINITY, 50, INFINITY, 0, INFINITY },
			    { INFINITY, INFINITY, INFINITY, 350, INFINITY, 250, INFINITY, 0 } };
		MGraph G = new MGraph(8, vexs, arcs);
		System.out.println("��ʾ���ص㼰�������ص��·������");
		display1(arcs);
		System.out.println();
		ShortestPath_FLOYD floyd = new ShortestPath_FLOYD();
		floyd.FLOYD(G);
		System.out.println("��ʾ���ص㼰�������ص�����·������");
		display2(floyd.getD());
		System.out.println("����һ���ص㣬��ʾ�����·��");
		Object o = sc.next();
		display3(floyd.getD(), vexs, o);
		sc.close();
	}

	// ��ʾ��ͼ�������·��
	private static void display1(int[][] D) {
		for (int v = 0; v < D.length; v++) {
			for (int w = 0; w < D.length; w++) {
				System.out.print(D[v][w] + "\t");
			}
			System.out.println();
		}
	}

	// ����һ���ص㣬��ʾ�����·��
	private static void display2(int[][] D) {
		for (int v = 0; v < D.length; v++) {
			for (int w = 0; w < D.length; w++) {
				System.out.print(D[v][w] + "\t");
			}
			System.out.println();
		}
	}

	// ����һ���ص㣬��ʾ�����·��
	private static void display3(int[][] D, Object[] V, Object x) {
		int[][] arr = D;
		Object[] arr2 = V;
		for (int i = 0; i < 8; i++) {
			if (x.equals(arr2[i])) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}
	// D ABC
	// A C A AC ABCD D A ABCD
}
