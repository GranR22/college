package Number;
//《Java从入门到精通》P43 例3.11 图3.6
//在项目中创建类Part，在类体中创建变量age与常量PI。在主方法中分别将变量与常量赋值，通过输出信息可测试变量与常量的有效范围。
public class Part {  //新建类Part
  //声明常量PI，此时如不对PI进行赋值，则会出现错误提示
	static final double PI = 3.14;
	static int age = 23;  //声明int型变量age并进行赋值
	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		final int number;  //声明int型常量number
		number = 1235;  //对常量进行赋值
		age = 22;  //再次对变量进行赋值
		//number = 1236  //错误的代码，因为number为常量，只能进行一次赋值
		System.out.println("常量PI的值为："+PI);  //将PI的值输出
		System.out.println("赋值后number的值为："+number);  //将number的值输出
		System.out.println("int型变量age的值为："+ age);  //将age的值输出

	}

}
