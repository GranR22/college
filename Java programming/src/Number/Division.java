package Number;
//《Java从入门到精通》P91 例5.21 图5.17
//在项目中创建类Division，在主方法中创建String变量，并将字符变量进行分割，将分割后的结果输出。
public class Division {

	public static void main(String[] args) {  //创建字符串
		// TODO 自动生成的方法存根
		String str = "192.168.0.1";
		//按照"."进行分割，使用转义字符"\\."
		String[]firstArray=str.split("\\.");
        //按照"."进行两次分割，使用转义字符"\\."
		String[]secondArray=str.split("\\.",2);
		//输出str原值
		System.out.println("str的原值为：["+str+"]");
		//输出全部分割的结果
		System.out.print("全部分割结果：");
		for(String a:firstArray) {
			System.out.print("["+a+"]");
		}
		System.out.println();  //换行
		//输出两次的结果
		System.out.print("分割两次的结果：");
		for(String a:secondArray) {
			System.out.print("["+a+"]");
		}
		System.out.println();
	}

}
