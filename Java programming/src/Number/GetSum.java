package Number;
//《Java从入门到精通》P67 例4.10 图4.11
//在项目中创建类GetSum，在主方法中通过while循环将整数1~10相加，并将结果输出
public class GetSum {  //创建类

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		int x = 1;  //定义int型变量x，并赋给初值
		int sum = 0;  //定义变量用于保存相加后的结果
		while(x<=10) {
			sum =sum + x;  //while循环语句，当变满足条件表达式时执行循环体语句
			x++;  //修改循环条件
		}
        System.out.println("sum = "+sum);  //将变量sum输出
	}
}