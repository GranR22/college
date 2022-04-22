package Number;
//《Java从入门到精通》P98 例5.27 图5.22
//在项目中创建类Judge，在主方法中实现使用正则表达式来判断指定的变量是否为合法的E-mail地址。
public class Judge {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//定义要匹配E-mail地址的正则表达式
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String str1 = "aaa@";  //定义要进行验证的字符串
        String str2 = "aaaaa";
        String str3 = "1111@111ffyu.dfg.com";
        if(str1.matches(regex)) {  //判断字符串变量是否与正则表达式匹配
        	System.out.println(str1+"是一个合法的E-mail地址格式");
        }
        if(str2.matches(regex)) {
        	System.out.println(str2+"是一个合法的E-mail地址格式");
        }
        if(str3.matches(regex)) {
        	System.out.println(str3+"是一个合法的E-mail地址格式");
        }
	}

}
/*
*正则表达式分析：
*通常情况下E-mail的格式为“X@X.com.cn”。
*字符X表示任意的一个或多个字符，@为E-mail地址中特有符号，符号@后还有一个或多个字符，之后是字符“.com”，也可能后面还有类似“.cn”的标记。
*总结E-mail地址的这些特点，因此可以书写正则表达式“\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}”来匹配E-mail地址
*字符集“\\w”匹配任意字符，符号“+”表示字符可以出现一次或多次，表达式“(\\.\\w{2,3})*”表示形如“.com”格式的字符串可以出现0次或多次。而最后的表达式“\\.\\w{2,3}”用于匹配E-mail地址中的结尾字符，如“.com”
*/