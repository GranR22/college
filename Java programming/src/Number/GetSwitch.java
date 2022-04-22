package Number;
//《Java从入门到精通》P65-P66 例4.9 图4.9
//在项目中创建类GetSwitch，在主方法中应用switch语句将周一到周三的英文单词打印出来
public class GetSwitch {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
        int week = 2;  //定义int型变量week
        switch(week) {  //指定switch语句的表达式为变量week
        case 1:  //定义case语句中的常量为1
        	System.out.println("Monday");  //输出信息
        	break;
        case 2:  //定义case语句中的常量为2
        	System.out.println("Tuesday");  //输出信息
        	break;
        case 3:  //定义case语句中的常量为3
        	System.out.println("Wednesday");  //输出信息
        	break;
        default:  //default语句
        	System.out.println("Sorry,I don't know.");
        }
	}

}
