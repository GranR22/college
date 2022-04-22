package Number;
//《Java从入门到精通》P88 例5.18 图5.14
//在项目中创建类Opinion，在主方法中创建String变量，实现判断两个字符串是否相等，并将结果输出。
public class Opinion {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		String s1 = new String("abc");  //创建字符串对象s1
		String s2 = new String("ABC");  //创建字符串对象s2
		String s3 = new String("abc");  //创建字符串对象s3
		boolean b = s1.equals(s2);
		//使用equalslgnoreCase()方法比较s1与s2
		boolean b2 = s1.equalsIgnoreCase(s2);
		System.out.println(s1+" equals"+s2+":"+b2);  //输出信息
		System.out.println(s1+" equalsIgnoreCase"+s2+":"+b2);

	}

}
