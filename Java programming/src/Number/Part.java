package Number;
//��Java�����ŵ���ͨ��P43 ��3.11 ͼ3.6
//����Ŀ�д�����Part���������д�������age�볣��PI�����������зֱ𽫱����볣����ֵ��ͨ�������Ϣ�ɲ��Ա����볣������Ч��Χ��
public class Part {  //�½���Part
  //��������PI����ʱ�粻��PI���и�ֵ�������ִ�����ʾ
	static final double PI = 3.14;
	static int age = 23;  //����int�ͱ���age�����и�ֵ
	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
		final int number;  //����int�ͳ���number
		number = 1235;  //�Գ������и�ֵ
		age = 22;  //�ٴζԱ������и�ֵ
		//number = 1236  //����Ĵ��룬��ΪnumberΪ������ֻ�ܽ���һ�θ�ֵ
		System.out.println("����PI��ֵΪ��"+PI);  //��PI��ֵ���
		System.out.println("��ֵ��number��ֵΪ��"+number);  //��number��ֵ���
		System.out.println("int�ͱ���age��ֵΪ��"+ age);  //��age��ֵ���

	}

}
