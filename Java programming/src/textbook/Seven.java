package textbook;
//《Java程序设计》P063
//1.使用if语句编写飞机行李托运收费程序：乘坐飞机时，每位顾客可以免费托运20kg以内的行李，超过部分按每公斤1.2元收费。
/*
 * 提示：部分代码如下。
 * import java.util.Scanner;
 * ...
 * double w,fee;
 * Scanner reader=new Scanner(System.in);
 * System.out.print("行李重量为：");
 * ...
 * if{   ...
 * System.out.print("费用为："+fee+"元整（人民币）");
 * }
 * else
 * {   fee=0;
 * System.out.print("不超重，费用为0元");
 * }
 * ...
 */
import java.util.Scanner;
public class Seven {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double w,fee;
	    Scanner reader=new Scanner(System.in);
		w=reader.nextDouble();
		reader.close();
	    System.out.print("行李重量为："+w+"公斤。");	    
		if(w>20){
			fee=(w-20)*1.2;
		    System.out.print("费用为："+fee+"元整（人民币）");
		 }else{
			 fee=0;
		     System.out.print("不超重，费用为0元");
		 }			
	}
}
		