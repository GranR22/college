package textbook;
//��Java������ơ�P063
//2.��д����1~n���ۼӳ���Ҫ���������ʱ����������n�����н�����ͼ3-10��ʾ��
/*
 * ��ʾ�����ִ������¡�
 * ...
 * int n,sum=0;
 * Scanner scan=new Scanner(System.in);
 * System.out.println("====����1��n���ۼ�====");
 * System.out.println("������������n��");
 * n=scan.nextInt();
 * for(int 1=1;   ...){
 * sum+=...;
 * System.out.printf("1��%d���ۼӽ����%d\n",i,...);
 */
import java.util.Scanner;
public class Eight {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int n,sum=0;
		Scanner scan=new Scanner(System.in);
	    n=scan.nextInt();
	    scan.close();
		System.out.println("====����1��n���ۼ�====");
		System.out.println("������������n��");
		for(int i=1;i<=n;i++){
			sum+=i;
			if(i==n) {
				continue;
			}
		System.out.printf("1��%d���ۼӽ����%d\n",i,sum);
	}		
  }
}
