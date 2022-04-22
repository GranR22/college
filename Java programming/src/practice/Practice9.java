package practice;
//《Java从入门到精通》P101 5.9实践与练习
//1.使用String类的toUpperCase()方法和toLowerCase()方法来实现大小写的转换。（答案位置：\TM\sl\5.19）
import java.util.Scanner;
public class Practice9 {
	private static Scanner console;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("请输入一组字符串：");
		console = new Scanner(System.in);
		String str = console.nextLine();
		StringBuilder upperStr = new StringBuilder();
		StringBuilder lowerStr = new StringBuilder();
		int i = 0;
		while(i<str.length()) {
			char chr = str.charAt(i);
			if(Character.isLowerCase(chr)) {
				upperStr.append(chr);
			}else if(Character.isLowerCase(chr)){
				upperStr.append(chr);
			}
			i++;
		}
		System.out.println("大写字母有："+upperStr.toString());
		System.out.println("小写字母有："+lowerStr.toString());
	}
}
/*
 * toUpperCase的意思是将所有的英文字符转换为大写字符；
 * toLowerCase的意思是将所有的英文字符转换为小写字符；
 * toUpperCase和toLowerCase这两个方法只对英文字母4有效，对除了A~Z和a~z的其余字符无任何效果。
 */
