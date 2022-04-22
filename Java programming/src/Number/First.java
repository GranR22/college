package Number;  //package Number 为声明该类所在的包，package为包的关键字
//《Java从入门到精通》P35 例3.1 图3.1 在控制台上输出字符串
//在eclipse下依次创建项目、包Number和类Frist。在类体中输入以下代码，实现在控制台上输出"你好 Java"。
public class First {
	static String s1 = "你好";  //s1是成员变量
	public static void main(String[]args) {
		String s2 = "Java";  //s2是局部变量
		System.out.println(s1);
		System.out.println(s2);
	}

}
//成员变量和局部变量的区别大体有3点：一是成员变量直接定义在类中；局部变量定义在方法中、参数上、语句中。二是成员变量在这个类中有效；局部变量只在自己所属的大括号内有效，大括号结束，局部变量失去作用域。三是成员变量存在于堆内存中，随着对象的产生而存在，消失而消失；局部变量存在于栈内存中，随着所属区域的运行而存在，结束而释放。