package practice;
//《Java从入门到精通》P101 5.9实践与练习
//2.分别截取字符串str1和字符串str2中的部分内容，如果截取后的两个子串相同（不区分大小写）会输出“两个子串相同，否则输出“两个子串并不相同”。（答案位置：\TM\sl\5.20）
import java.util.Scanner;
public class Practice10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner str=new Scanner(System.in);
		System.out.println("输入第一个字符串"); 
        String str1 = str.next();
        System.out.println("输入第二个字符串");
        String str2 = str.next();
        System.out.println("输入切割的序号");
        int n = str.nextInt();
        str.close();
        String str3=str1.substring(n);
        String str4=str2.substring(n);
        if(str3.equalsIgnoreCase(str4)) {
        	System.out.println("两个子串相同");
        }else {
        	System.out.println("两个子串并不相同");
        }
	}

}
