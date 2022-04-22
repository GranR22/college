package Number;
//《Java从入门到精通》P93 例5.23 图5.18
//在项目中创建类Eval，实现当前日期信息以4位年份、月份全称、2位日期形式输出。
import java.util.Date;  //导入java.util.Date类
public class Eval523 {  //新建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		Date date = new Date();  //创建Date对象date
		String year = String.format("%tY",date);  //将date进行格式化
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		System.out.println("今年是："+year+"年");  //输出信息
		System.out.println("现在是："+month);
		System.out.println("今天是："+day+"号");

	}

}
