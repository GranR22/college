package Number;
//《Java从入门到精通》P84 例5.13 图5.9
//在项目中创建类Subs，在主方法中创建String对象，实现使用substring()方法对字符串进行截取，并将截取后形成的新串输出
public class Subs {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
    String str = "Hello World";  //定义的字符串
    String substr = str.substring(0,3);  //对字符串进行截取
    System.out.println(substr);  //输出截取后的字符串
	}

}
