package Number;
//��Java�����ŵ���ͨ��P90 ��5.20 ͼ5.16
//����Ŀ�д�����UpAndLower�����������д���String�ͱ�����ʵ���ַ������Ĵ�Сдת��������ת����Ľ�������
public class UpAndLower {  //������

	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
		String str = new String("abc DEF");  //�������ַ���str
		String newstr = str.toLowerCase();  //ʹ��toLowerCase()����ʵ��Сдת��
		String newstr2 = str.toUpperCase();  //ʹ��toUpperCase()����ʵ�д�дת��
		System.out.println(newstr);  //��ת����Ľ�����
		System.out.println(newstr2);
	}

}
//ʹ��toLowerCase()������toUpperCase()�������д�Сдת��ʱ�����ֻ���ַ�����Ӱ��