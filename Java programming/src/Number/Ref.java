package Number;
//《Java从入门到精通》P83 例5.11
//在项目中创建类Ref，在主方法中创建String对象，使用charAt（）方法查看字符串str中索引位置是6的字符。
public class Ref {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		String str = "hello world";  //定义字符串str
        char mychar = str.charAt(6);  //将字符串str中索引位置是6的字符返回
        System.out.println("字符串str中索引位置是6的字符为"+mychar);  //输出信息
	}

}
