package textbook;
//《Java程序设计》P041
//5.已知a=10，b=12。编写程序，交换两个变量的值
public class Five {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=10;
        int b=12;
        int Exchange=a;  //先创建中间变量Exchange,并将a的值赋予Exchange，赋值完成后，a原来的值被移走，其值变为空
        a=b;  //在a的值为空值时将b的值赋给a，赋值完成后，b的值变为空值，a的值为b原来的值
        b=Exchange;  //将拥有原来a的值的中间变量的值赋给b，赋值完成后，中间变量的值变为空值，b的值为a原来的值
        //特别注意字母顺序不能颠倒，第九行a结尾，第十行就a开头，第十行b结尾，第十一行就b开头，上下行要首尾呼应
        System.out.println(a);
        System.out.println(b);
	}

}
