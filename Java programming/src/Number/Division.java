package Number;
//��Java�����ŵ���ͨ��P91 ��5.21 ͼ5.17
//����Ŀ�д�����Division�����������д���String�����������ַ��������зָ���ָ��Ľ�������
public class Division {

	public static void main(String[] args) {  //�����ַ���
		// TODO �Զ����ɵķ������
		String str = "192.168.0.1";
		//����"."���зָʹ��ת���ַ�"\\."
		String[]firstArray=str.split("\\.");
        //����"."�������ηָʹ��ת���ַ�"\\."
		String[]secondArray=str.split("\\.",2);
		//���strԭֵ
		System.out.println("str��ԭֵΪ��["+str+"]");
		//���ȫ���ָ�Ľ��
		System.out.print("ȫ���ָ�����");
		for(String a:firstArray) {
			System.out.print("["+a+"]");
		}
		System.out.println();  //����
		//������εĽ��
		System.out.print("�ָ����εĽ����");
		for(String a:secondArray) {
			System.out.print("["+a+"]");
		}
		System.out.println();
	}

}
