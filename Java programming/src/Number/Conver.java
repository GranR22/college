package Number;
//��Java�����ŵ���ͨ��P53 ��3.21 ͼ3.18
//����Ŀ�д�����Conver�����������д�����ͬ��ֵ�͵ı�����ʵ�ֽ���������ʽת����
public class Conver {  //������

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		byte mybyte = 127;  //����byte�ͱ���mybyte������byte�ͱ�����������ֵ����mybyte
		int myint = 150;  //����int�ͱ���myint������ֵ150
		float myfloat = 452.12f;  //����float�ͱ���myfloat������ֵ
		char mychar = 10;  //����char�ͱ���mychar������ֵ
		double mydouble = 45.46546;  //����double�ͱ���mydouble������ֵ
		/*�����������*/
		System.out.println("byte����float�����ݽ���������Ϊ��"+(mybyte+myfloat));
		System.out.println("byte����int�����ݽ���������Ϊ��"+mybyte*myint);
		System.out.println("byte����char�����ݽ���������Ϊ��"+mybyte/mychar);
		System.out.println("double����char�����ݽ���������Ϊ��"+(mydouble+mychar));

	}

}
