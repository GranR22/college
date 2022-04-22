package Number;
//《Java从入门到精通》P70 例4.13 图4.16
//在项目中创建类Repetition，在主方法中定义一维数组，并用foreach语句遍历该数组
public class Repetition {  //创建类Repetition

	public static void main(String[] args) {  //主方法
		// TODO 自动生成的方法存根
		int arr[]= {7,10,1};  //声明一维数组
		System.out.println("一维数组中的元素分别为：");  //输出信息
		for(int x :arr) {
			//foreach语句，int x引用的变量，arr指定要循环遍历的数组，最后将x输出
			System.out.println(x);
		}

	}

}
