package Number;
//《Java从入门到精通》P68 例4.11 图4.13
//在项目中创建类Cycle，在主方法中编写如下代码。通过本实例可以看出while语句与do...while语句的区别。
public class Cycle {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a =100;  //声明int型变量a并赋予初值100
		while(a==60)  //指定进入循环体条件
		{
			System.out.println("ok1");
			a--;  //修改循环条件
		}
		//上述五行代码为while语句循环体
		int b = 100;  //声明int型变量b并赋初值100
		do {
			System.out.println("ok2");
			b--;
		}while(b==60);  //指定循环结束条件
		//上述四行代码为do...while语句循环体
	}
}