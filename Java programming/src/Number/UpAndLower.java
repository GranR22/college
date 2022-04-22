package Number;
//《Java从入门到精通》P90 例5.20 图5.16
//在项目中创建类UpAndLower，在主方法中创建String型变量，实现字符变量的大小写转换，并将转换后的结果输出。
public class UpAndLower {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		String str = new String("abc DEF");  //创建的字符串str
		String newstr = str.toLowerCase();  //使用toLowerCase()方法实行小写转换
		String newstr2 = str.toUpperCase();  //使用toUpperCase()方法实行大写转换
		System.out.println(newstr);  //将转换后的结果输出
		System.out.println(newstr2);
	}

}
//使用toLowerCase()方法和toUpperCase()方法进行大小写转换时，数字或非字符不受影响