package textbook;
//��Java������ơ�P064
//3.��Ƶ�½������򣬵�������ȷ���û���������ʱ���û���Ϊlisi,����Ϊ123456�����������ӭʹ�ã���������������û������������������n�λ��ᡱ��n<=3,���û����������3�����ϣ���������û��ѱ�����������
/*
 * ��ʾ�����ִ������¡�
 * ...
 * Scanner input=new Scanner(System.in);
 * String name="lisi";
 *  ...
 * int n=2;
 * for(int i=0;i<=3;i++){
 *  System.out.println("�������û�����");
 *  ...
 *  System.out.println("���������룺");
 *  ...
 *  if(password.equals(code)&&userName.equals(name))
 *  {
 *    ...
 *  }
 *  else{
 *      if(n!=0){
 *        System.out.println("�û������������������"+n+"�λ���");
 *        ...
 *      }
 *      else{
 *        System.out.println("���û��ѱ�������");
 *      }
 *        ...
 *  }
 * }
 */
import java.util.Scanner;
public class Nine {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input=new Scanner(System.in);
		String userName="lisi";
		String password="123456";
		String name=input.nextLine();
		String code=input.nextLine();
		input.close();
		int n=2;
		for(int i=0;i<=3;i++) {
			System.out.println("�������û�����");
			System.out.println("���������룺");
			if(password.equals(code)&&userName.equals(name)) {
				System.out.println("��ӭʹ�ã�");
			}else {
				if(n!=0) {
					System.out.println("�û������������������"+n+"�λ���");
					continue;
				}else {
					System.out.println("���û��ѱ�������");
				}
			}
		}	
	}
}
