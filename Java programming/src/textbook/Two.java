package textbook;  //包
//《Java程序设计》P019
//2.在屏幕上打印以下图形
public class Two {   //类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		
        for(int i=0;i<=29;i++){  //应用for循环，for（初始化变量；条件表达式；改变循环变量）
        	System.out.print('*');  //循环体
        	if(i==29) {  //循环体中嵌套一个条件选择结构以达到一定条件时跳出该循环
        		continue;  //该语句跳出本层循环
        	}
        }
        System.out.println();  //换行，下一行
        for(int j=0;j<=5;j++) {  //因为j++，所以原本条件表达式“j<=6”改为“j<=5”,后面打印的结果有6个“*”
        	System.out.print("*");
        	if(j==5) {
        		continue;
        	}
        }
        System.out.print("  Java程序设计  ");  //print没有ln后缀就接着上次的打印结果输出，没有换行
        for(int k=0;k<=5;k++) {
        	System.out.print('*');
        	if(k==5) {
        		continue;
        	}
        }
        System.out.println();
        for(int l=0;l<=29;l++) {
        	System.out.print('*');
        	if(l==29) {
        		continue;
        	}
        }
	}

}
