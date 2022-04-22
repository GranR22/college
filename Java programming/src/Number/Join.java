package Number;
//《Java从入门到精通》P79 例5.6
//在项目中创建类Join，在主方法中创建String型变量，并将字符变量连接的结果输出
public class Join {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		String s1 = new String("hello");  //声明String对象s1
		String s2 = new String("world");  //声明String对象s2
		String s = s1+" "+s2;  //将对象s1和s2连接后的结果赋值给s
		System.out.println(s);  //将s输出

	}

}
