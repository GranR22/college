package examples;
//《Java从入门到精通》P65 例4.8
//要通过switch语句根据字符串str的值，输出不同的提示信息可以使用下面的代码
public class SWITCH {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str ="明日科技";
			switch(str){
			case"明日":  //定义case语句中的常量1
				System.out.println("明日图书网www.mingribook.com");  //输出信息
				break;
			case"明日科技":  //定义case语句中的常量2
			    System.out.println("吉林省明日科技有限公司");  //输出信息
			    break;
		    default:  //default语句
			    System.out.println("以上条件都不是。");  //输出信息
				
		}

	}

}
