package Number;
//��Java�����ŵ���ͨ��P82 ��5.10 ͼ5.6 
//����Ŀ�д�����Text�����������д���String����ʹ��lastIndexOf()�����鿴�ַ���str�п��ַ�����λ�ã�Ȼ������ַ����ĳ��ȣ��������Ƿ���ͬ��
public class Text {  //������

	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
		String str = "We are students";  //�����ַ���str
		//�����ַ�����str�е�����λ�ø�ֵ������size
		int size = str.lastIndexOf("");
		//������size���
		System.out.println("���ַ����ַ���str�е�����λ���ǣ�"+size);
		//���ַ���str�ĳ������
		System.out.println("�ַ���str�ĳ��� �ǣ�"+str.length());

	}

}
//���lastIndexOf()�����еĲ����ǿ��ַ���""(ע��û�пո�)���򷵻صĽ������ø��ַ���length()�����ķ��ؽ����ͬ��