package practice;
//��Java�����ŵ���ͨ��P57 3.8ʵ������ϰ
//3.��дJava���򣬽�����������ֵȫ��ת����int�ͣ�����ת�����ֵ���
public class Practice5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		byte mybyte = 56;
		short myshort = 56;
		int myint = 56;
		long mylong = 56;
		float myfloat = 56.56f;
		double mydouble = 56.5656;
		char mychar =56;
		System.out.println(mybyte+myshort+myint+mylong+myfloat+mydouble+mychar);
		int x = (mybyte+myshort+myint+mychar);
		System.out.println(x);
		int y = (int) (mybyte+myshort+myint+mylong+myfloat+mydouble+mychar);
		System.out.println(y);
	}

}
