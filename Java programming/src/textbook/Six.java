package textbook;
//《Java程序设计》P041
//6.对字符‘广’、‘东’、‘理’、‘工’进行加密，输出密文。部分代码如下。
/*
 * char a1='广',a2='东',a3='理',a4='工';
 * char secret='A';
 * a1=(char)(a1^secret);
 * ...
 * System.out.println("密文："+a1+a2+a3+a4);
 * a1=(char)(a1^secret);
 * ...
 * System.out.println("原文："+a1+a2+a3+a4);
 */
public class Six {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 char a1='广',a2='东',a3='理',a4='工';
		 char secret='A';
		 a1=(char)(a1^secret);
		 a2=(char)(a2^secret);
		 a3=(char)(a3^secret);
		 a4=(char)(a4^secret);
		 System.out.println("密文："+a1+a2+a3+a4);
		 a1=(char)(a1^secret);
		 a2=(char)(a2^secret);
		 a3=(char)(a3^secret);
		 a4=(char)(a4^secret);
		 System.out.println("原文："+a1+a2+a3+a4);
	}

}
