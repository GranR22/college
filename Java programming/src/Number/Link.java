package Number;
//《Java从入门到精通》P79-P80 例5.7
//在项目中创建类Link，在主方法中创建数值型变量，实现将字符串与整型、浮点型变量相连的结果输出。
public class Link {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		int booktime = 4;  //声明的int型变量booktime
		float practice = 2.5f;  //声明的float型变量practice
		//将字符串与整型、浮点型变量相连，并将结果输出
		System.out.println("我每天花费"+booktime+"小时看书；"+practice+"小时上机练习");
		System.out.println("我每天花费"+booktime+"小时看书；"+(practice+booktime)+"小时上机练习");
		

	}

}
