package Number;
//《Java从入门到精通》P49 例3.18 图3.12
//在项目中创建类Calculation，在主方法中创建整型变量，使用逻辑运算符对变量进行运算，并将运算结果输出。
public class Calculation {  //创建类

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a = 2;  //声明int型变量a
		int b = 5;  //声明int型变量b
		//声明boolean型变量，用于保存应用逻辑运算符"&&"后的返回值
		boolean result = ((a>b)&&(a!=b));
		//声明boolean型变量，用于保存应用逻辑运算符"||"后的返回值
		boolean result2 = ((a>b)||(a!=b));
		System.out.println(result);  //将变量result输出
		System.out.println(result2);  //将变量result2输出

	}

}
