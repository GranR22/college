package Number;  //比较运算符
//《Java从入门到精通》P47 例3.17 图3.11
//在项目中创建类Compare,在主方法中创建整型变量，使用比较运算符对变量进行比较运算，并将运算后的结果输出。
public class Compare {  //创建类

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int number1 = 4;  //声明int型变量number1
		int number2 = 5;  //声明int型变量number2
		/*依次将变量number1与变量number2的比较结果输出*/
		System.out.println("number1>number2的返回值为："+(number1>number2));
		System.out.println("number1<number2的返回值为："+(number1<number2));
		System.out.println("number1==number2的返回值为："+(number1==number2));
		System.out.println("number1!=number2的返回值为："+(number1!=number2));
		System.out.println("number1>=number2的返回值为："+(number1>=number2));
		System.out.println("number1<=number2的返回值为："+(number1<=number2));

	}

}
