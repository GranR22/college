package Number;
//��Java�����ŵ���ͨ��P37 ��3.3 ͼ3.3��ͬ��ֵ�ͱ�����ӵĺ�
//����Ŀ�д�����Number�����������д�����ͬ��ֵ�ͱ�����������Щ������ӣ����������
public class Number {  //������
	public static void main(String[]args) {  //������
		byte mybyte = 124;  //����byte�ͱ�������ֵ
		short myshort = 32564;  //����short�ͱ�������ֵ
		int myint = 45784612;  //����int�ͱ�������ֵ
		long mylong = 46789451;  //����long�ͱ�������ֵ
		long result = mybyte+myshort+myint+mylong;  //��ø�����Ӻ�Ľ��
		System.out.println("���Ϊ��"+result);  //�����ϱ�����ӵĽ�����
	}

}