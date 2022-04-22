package practice;
//《Java从入门到精通》P75 4.6实践与练习
//3.编写Java程序，使用while循环语句计算1+1/2!+1/3!+···+1/20!之和。
public class Practice8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double x=1;
		double y=1;
		double z=0;
		double sum=0;
		while(x<=20) {
			y=y*x;
			z=1/y;
			sum=sum+z;
			x++;
		}
        System.out.println("1+1/2!+1/3!+···+1/20!的和为"+sum);
	}

}
