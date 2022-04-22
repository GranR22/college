package Number;
//《Java从入门到精通》P85 例5.14 图5.10
//在项目中创建类Blak，在主方法中创建String对象，将字符变量原来的长度与去掉前导和尾部空格后的长度输出
public class Blak {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		String str = "  Java  class   ";  //定义字符串str
		System.out.println("字符串原来的长度："+str.length());  //将str原来的长度输出
		//将str去掉前导和尾部的空格后的结果输出
		System.out.println("去掉空格后的长度："+str.trim().length());

	}

}
