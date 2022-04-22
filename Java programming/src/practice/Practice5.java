package practice;
//《Java从入门到精通》P57 3.8实践与练习
//3.编写Java程序，将所有整型数值全部转换成int型，并将转换后的值输出
public class Practice5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		byte mybyte = 56;
		short myshort = 56;
		int myint = 56;
		long mylong = 56;
		float myfloat = 56.56f;
		double mydouble = 56.5656;
		char mychar =56;
		System.out.println(mybyte+myshort+myint+mylong+myfloat+mydouble+mychar);
		int x = (mybyte+myshort+myint+mychar);
		System.out.println(x);
		int y = (int) (mybyte+myshort+myint+mylong+myfloat+mydouble+mychar);
		System.out.println(y);
	}

}
