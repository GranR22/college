package textbook;
//《Java程序设计》P040
//3.编写Java程序，输入一个4位整数（如1234），依次输出其每位数字的值及其逆序数
public class Three {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        int x=1234;
        System.out.println("数字x的千位是："+x/1000);
        //先将x除以1000，等于1，余数为234
        System.out.println("数字x的百位是："+x/100%10);
        //先将x除以100，等于12，余数为34，然后将12除以10，等于1，余数为2
        System.out.println("数字x的十位是："+x/10%10);
        //先将x除以10，等于123，余数为4，然后将123除以10，等于12，余数为3
        System.out.println("数字x的个位是："+x%10);
        //先将x除以10，等于123，余数为4
        System.out.println("数字x的逆序数为："+(x%10)+(x/10%10)+(x/100%10)+(x/1000));
	}

}
