package Number;
//《Java从入门到精通》P82 例5.10 图5.6 
//在项目中创建类Text，在主方法中创建String对象，使用lastIndexOf()方法查看字符串str中空字符串的位置，然后输出字符串的长度，看他们是否相同。
public class Text {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		String str = "We are students";  //定义字符串str
		//将空字符串在str中的索引位置赋值给变量size
		int size = str.lastIndexOf("");
		//将变量size输出
		System.out.println("空字符在字符串str中的索引位置是："+size);
		//将字符串str的长度输出
		System.out.println("字符串str的长度 是："+str.length());

	}

}
//如果lastIndexOf()方法中的参数是空字符串""(注意没有空格)，则返回的结果与调用该字符串length()方法的返回结果相同。