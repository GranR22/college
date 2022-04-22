package Number;
//《Java从入门到精通》P89 例5.19 图5.15
//在项目中创建类Wordbook，在主方法中创建String变量，使用compareTo()方法将字符变量进行比较，并将比较结果输出。
public class Wordbook {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
        String str = new String("b");
        String str2 = new String("a");
        String str3 = new String("c");
        //上述三条代码为用于比较的3个字符串
        System.out.println(str+" compareTo "+str2+":"+str.compareTo(str2));  //将str与str2的比较结果输出
        System.out.println(str+" compareTo "+str3+":"+str.compareTo(str3));  //将str与str3比较的结果输出
	}

}
//compareTo()方法只有在equals(Object)方法返回true式才有效