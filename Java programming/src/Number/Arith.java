package Number;  //算数运算符
//《Java从入门到精通》P46 例3.16
//在项目中创建类Arith，在主方法中定义变量，使用算术运算符将变量的计算结果输出。
public class Arith {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		float number1 = 45.56f;  //声明float型变量并赋值
		int number2 = 152;  //声明int型变量并赋值
		System.out.println("和为："+(number1+number2));  //将变量相加之和输出
		System.out.println("差为："+(number2-number1));  //将变量相减之差输出
		System.out.println("积为:"+number1*number2);  //将变量相乘之积输出
		System.out.println("商为："+number1/number2);  //将变量相除的商输出

	}

}
