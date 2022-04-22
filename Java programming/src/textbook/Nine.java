package textbook;
//《Java程序设计》P064
//3.设计登陆口令程序，当输入正确的用户名和密码时（用户名为lisi,密码为123456），输出“欢迎使用！”；否则，输出“用户名或密码错误，您还有n次机会”。n<=3,若用户名或密码错3次以上，输出“本用户已被锁定！”。
/*
 * 提示：部分代码如下。
 * ...
 * Scanner input=new Scanner(System.in);
 * String name="lisi";
 *  ...
 * int n=2;
 * for(int i=0;i<=3;i++){
 *  System.out.println("请输入用户名：");
 *  ...
 *  System.out.println("请输入密码：");
 *  ...
 *  if(password.equals(code)&&userName.equals(name))
 *  {
 *    ...
 *  }
 *  else{
 *      if(n!=0){
 *        System.out.println("用户名或密码错误，您还有"+n+"次机会");
 *        ...
 *      }
 *      else{
 *        System.out.println("本用户已被锁定！");
 *      }
 *        ...
 *  }
 * }
 */
import java.util.Scanner;
public class Nine {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		String userName="lisi";
		String password="123456";
		String name=input.nextLine();
		String code=input.nextLine();
		input.close();
		int n=2;
		for(int i=0;i<=3;i++) {
			System.out.println("请输入用户名：");
			System.out.println("请输入密码：");
			if(password.equals(code)&&userName.equals(name)) {
				System.out.println("欢迎使用！");
			}else {
				if(n!=0) {
					System.out.println("用户名或密码错误，您还有"+n+"次机会");
					continue;
				}else {
					System.out.println("本用户已被锁定！");
				}
			}
		}	
	}
}
