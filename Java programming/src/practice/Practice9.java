package practice;
//��Java�����ŵ���ͨ��P101 5.9ʵ������ϰ
//1.ʹ��String���toUpperCase()������toLowerCase()������ʵ�ִ�Сд��ת��������λ�ã�\TM\sl\5.19��
import java.util.Scanner;
public class Practice9 {
	private static Scanner console;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.print("������һ���ַ�����");
		console = new Scanner(System.in);
		String str = console.nextLine();
		StringBuilder upperStr = new StringBuilder();
		StringBuilder lowerStr = new StringBuilder();
		int i = 0;
		while(i<str.length()) {
			char chr = str.charAt(i);
			if(Character.isLowerCase(chr)) {
				upperStr.append(chr);
			}else if(Character.isLowerCase(chr)){
				upperStr.append(chr);
			}
			i++;
		}
		System.out.println("��д��ĸ�У�"+upperStr.toString());
		System.out.println("Сд��ĸ�У�"+lowerStr.toString());
	}
}
/*
 * toUpperCase����˼�ǽ����е�Ӣ���ַ�ת��Ϊ��д�ַ���
 * toLowerCase����˼�ǽ����е�Ӣ���ַ�ת��ΪСд�ַ���
 * toUpperCase��toLowerCase����������ֻ��Ӣ����ĸ4��Ч���Գ���A~Z��a~z�������ַ����κ�Ч����
 */
