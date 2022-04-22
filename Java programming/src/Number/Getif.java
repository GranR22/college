package Number;
//《Java从入门到精通》P61 例4.4 图4.3
//在项目中创建类Getif在主方法中定义整型变量。使用条件语句判断两个变量的大小来决定输出结果
public class Getif {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		int x = 45;  //声明int型变量x，并赋给初值
		int y = 12;  //声明int型变量y，并赋给初值
		if (x>y) {  //判断x是否大于y
			System.out.println("变量x大于变量y");  //如果	条件成立，输出的信息
		}
		if (x<y) {  //判断x是否小于y
			System.out.println("变量x小于变量y");  //如果条件成立，输出的信息
		}

	}

}
