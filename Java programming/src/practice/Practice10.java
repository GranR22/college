package practice;
//��Java�����ŵ���ͨ��P101 5.9ʵ������ϰ
//2.�ֱ��ȡ�ַ���str1���ַ���str2�еĲ������ݣ������ȡ��������Ӵ���ͬ�������ִ�Сд��������������Ӵ���ͬ����������������Ӵ�������ͬ��������λ�ã�\TM\sl\5.20��
import java.util.Scanner;
public class Practice10 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner str=new Scanner(System.in);
		System.out.println("�����һ���ַ���"); 
        String str1 = str.next();
        System.out.println("����ڶ����ַ���");
        String str2 = str.next();
        System.out.println("�����и�����");
        int n = str.nextInt();
        str.close();
        String str3=str1.substring(n);
        String str4=str2.substring(n);
        if(str3.equalsIgnoreCase(str4)) {
        	System.out.println("�����Ӵ���ͬ");
        }else {
        	System.out.println("�����Ӵ�������ͬ");
        }
	}

}
