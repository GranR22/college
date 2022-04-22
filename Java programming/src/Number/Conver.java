package Number;
//《Java从入门到精通》P53 例3.21 图3.18
//在项目中创建类Conver，在主方法中创建不同数值型的变量，实现将各变量隐式转换。
public class Conver {  //创建类

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		byte mybyte = 127;  //定义byte型变量mybyte，并把byte型变量允许的最大值赋给mybyte
		int myint = 150;  //定义int型变量myint，并赋值150
		float myfloat = 452.12f;  //定义float型变量myfloat，并赋值
		char mychar = 10;  //定义char型变量mychar，并赋值
		double mydouble = 45.46546;  //定义double型变量mydouble，并赋值
		/*将运算结果输出*/
		System.out.println("byte型与float型数据进行运算结果为："+(mybyte+myfloat));
		System.out.println("byte型与int型数据进行运算结果为："+mybyte*myint);
		System.out.println("byte型与char型数据进行运算结果为："+mybyte/mychar);
		System.out.println("double型与char型数据进行运算结果为："+(mydouble+mychar));

	}

}
