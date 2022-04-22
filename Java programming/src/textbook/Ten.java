package textbook;
//《Java程序设计》P064
//4.定义并调用方法，计算半径为3.1的圆的面积和周长。（思考：如果从键盘输入半径，怎样修改代码？）
/*
 * 提示：部分代码如下。
 * public class CircleArea{
 *   static double calcArea(double r){  //定义计算圆面积方法
 *   ...
 *   }
 *   return area;
 * }
 * public class CircleGirh{
 *   static double calcGirth(double r)  {  //定义计算圆周长方法
 *     ...
 *   }
 * }
 * public static void main(string[] args){
 *   double radius,area;
 *   ...
 *   System.out.printf("\n半径为3.1的圆的面积:%.2f",area);
 *   //调用计算圆面积的方法
 *   System.out.printf("\n半径为3.1的圆的周长:%.2f",calcGirth(3.1));
 *   //调用计算圆周长的方法
 * }
 */
public class Ten {
	final static double PI=3.1415926;
	 public class CircleArea{	 
		 static double calcArea(double r) {
			 double area;
			 area=PI*r*r;
			 return area;
		 }	 
	   }  	 
	 public class circleGirth{	 
		static double calcGirth(double r) {
			double calcGirth;
		    calcGirth=2*PI*r;
		    return calcGirth;
	   }
	 }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        double radius,area;
        
        System.out.printf("\n半径为3.1的圆的面积:%.2f",area);
        System.out.printf("\n半径为3.1的圆的周长:%.2f",calcGirth(3.1));
	}
}