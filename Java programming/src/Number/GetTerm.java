package Number;
//《Java从入门到精通》P63
//在项目中创建类GetTerm，在主方法中定义变量x，使用if...else if多分支语句通过判断x的值决定输出结果。
public class GetTerm {  //创建主类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		int x = 20;  //声明int型局部变量
		if(x>30) {  //判断变量x是否大于30
			System.out.println("x的值大于30");  //条件成立时输出的信息
		}else if(x>10){  //判断变量x是否大于10
			System.out.println("x的值大于10，但小于30");  //条件成立时输出的信息
		}else if(x>0) {  //判断变量x是否大于0
			System.out.println("x的值大于0，但小于10");  //条件成立时输出的信息
		}else {  //当以上条件都不成立时，执行的语句块
			System.out.println("x的值小于0");  //输出信息
		}

	}

}
//if语句只执行条件为真的命令语句，其他语句都不会执行。