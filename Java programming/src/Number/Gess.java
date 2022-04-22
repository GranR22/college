package Number;
//《Java从入门到精通》P39 例3.6 图3.4
//在项目中创建类Gess，编写如下代码，实现将Unicode表中某些位置上的字符以及一些字符在Unicode表中的位置在控制台上输出。
public class Gess {  //定义类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		char word = 'd',word2 = '@';  //定义char型变量
		int p =23045,p2 = 45213;  //定义int型变量
		System.out.println("d在unicode表中的顺序位置是："+(int)word);
		System.out.println("@在unicode表中的顺序位置是："+(int)word2);
		System.out.println("unicode表中的第23045位是："+(char)p);
		System.out.println("unicode表中的第45213位是："+(char)p2);

	}

}