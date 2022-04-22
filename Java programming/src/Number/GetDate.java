package Number;
//《Java从入门到精通》P94 例5.24 图5.19
//在项目中创建类GetDate,实现将当前时间信息以2位小时数、2位分钟数、2位秒数形式输出
import java.util.Date;  //导入java.util.Date类
public class GetDate {  //新建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		Date date = new Date();  //创建Date对象date
        String hour = String.format("%tH", date);  //将date进行格式化
        String minute = String.format("%tM", date);
        String second = String.format("%tS",date);
        //输出信息
        System.out.println("现在是："+hour+"时"+minute+"分"+second+"秒");
	}

}
