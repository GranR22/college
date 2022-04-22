package Number;
//《Java从入门到精通》P37 例3.3 图3.3不同数值型变量相加的和
//在项目中创建类Number，在主方法中创建不同数值型变量，并将这些变量相加，将和输出。
public class Number {  //创建类
	public static void main(String[]args) {  //主方法
		byte mybyte = 124;  //声明byte型变量并赋值
		short myshort = 32564;  //声明short型变量并赋值
		int myint = 45784612;  //声明int型变量并赋值
		long mylong = 46789451;  //声明long型变量并赋值
		long result = mybyte+myshort+myint+mylong;  //获得各数相加后的结果
		System.out.println("结果为："+result);  //将以上变量相加的结果输出
	}

}