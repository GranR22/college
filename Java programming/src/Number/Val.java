package Number;
//《Java从入门到精通》P44 例3.13 图3.8
//在项目中创建类Val，分别定义名称相同的局部变量和成员变量，当名称相同时成员变量将被隐藏。
public class Val {  //新建类
	static int times = 3;  //定义新成员变量times

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		int times = 4;  //定义局部变量times
		System.out.println("times的值为："+times);  //将times的值输出

	}

}
