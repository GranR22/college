package textbook;
//《Java程序设计》P063
//2.编写计算1~n的累加程序，要求程序运行时输入正整数n。运行界面如图3-10所示。
/*
 * 提示：部分代码如下。
 * ...
 * int n,sum=0;
 * Scanner scan=new Scanner(System.in);
 * System.out.println("====计算1到n的累加====");
 * System.out.println("请输入正整数n：");
 * n=scan.nextInt();
 * for(int 1=1;   ...){
 * sum+=...;
 * System.out.printf("1到%d的累加结果：%d\n",i,...);
 */
import java.util.Scanner;
public class Eight {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n,sum=0;
		Scanner scan=new Scanner(System.in);
	    n=scan.nextInt();
	    scan.close();
		System.out.println("====计算1到n的累加====");
		System.out.println("请输入正整数n：");
		for(int i=1;i<=n;i++){
			sum+=i;
			if(i==n) {
				continue;
			}
		System.out.printf("1到%d的累加结果：%d\n",i,sum);
	}		
  }
}
