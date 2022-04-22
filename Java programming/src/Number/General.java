package Number;
//《Java从入门到精通》P96 例5.26 图5.21
//在项目中创建类General,在主方法中实现不同数据类型到字符串的转换。
public class General {  //新建类
	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
        String str = String.format("%d",400/2);  //将结果以十进制格式显示
        String str2 = String.format("%b", 3>5);  //将结果以boolean型显示
        String str3 = String.format("%x", 200);  //将结果以十六进制格式显示
        System.out.println("400的一半是："+str);  //输出格式化字符串
        System.out.println("3>5正确吗："+str2);
        System.out.println("200的十六进制数是："+str3);
	}
}
