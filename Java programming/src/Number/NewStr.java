package Number;
//《Java从入门到精通》P85 例5.15 图5.11
//在项目中创建类NewStr，在主方法中创建String变量，将字符变量中的字母a替换成A后的结果输出。
public class NewStr {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		String str = "address";  //定义字符串str
		//字符串str中的字符"a"替换成"A"后返回新的字符串newstr
		String newstr  = str.replace("a", "A");
		System.out.println(newstr);  //将字符串newstr输出

	}

}
//如果要替换的字符oldChar在字符串中重复出现多次，replace()方法会将所有oldChar全部替换成newChar
//要替换的字符oldChar的大小写要与原字符串中字符的大小写保持一致，否则不能成功地替换。