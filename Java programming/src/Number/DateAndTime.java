package Number;
//《Java从入门到精通》P95 例5.25 图5.20
//在项目中创建类DateAndTime,在主方法中实现将当前日期时间的全部信息以及指定格式的日期输出。
import java.util.Date;
public class DateAndTime {  //创建类
	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		Date date = new Date();  //创建Date对象date
		String time = String.format("%tc",date);  //将date格式化
		String form = String.format("%tF",date);
        //将格式化后的日期时间输出
		System.out.println("全部的时间信息是："+time);
		System.out.println("年-月-日格式："+form);
	}

}
