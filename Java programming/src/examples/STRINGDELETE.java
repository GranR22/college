package examples;
//��Java�����ŵ���ͨ��P100 ��5.30
//ɾ��ָ��λ�õ����ַ�����ʵ���������£�
public class STRINGDELETE {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		StringBuilder bf = new StringBuilder("StringBuilder");  //�����ַ���������
		bf.delete(5, 10);  //ɾ�������ַ���
		System.out.println(bf.toString());  //��ʱ�������ϢΪStrinder

	}

}
