package Number;
//��Java�����ŵ���ͨ��P68 ��4.11 ͼ4.13
//����Ŀ�д�����Cycle�����������б�д���´��롣ͨ����ʵ�����Կ���while�����do...while��������
public class Cycle {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a =100;  //����int�ͱ���a�������ֵ100
		while(a==60)  //ָ������ѭ��������
		{
			System.out.println("ok1");
			a--;  //�޸�ѭ������
		}
		//�������д���Ϊwhile���ѭ����
		int b = 100;  //����int�ͱ���b������ֵ100
		do {
			System.out.println("ok2");
			b--;
		}while(b==60);  //ָ��ѭ����������
		//�������д���Ϊdo...while���ѭ����
	}
}