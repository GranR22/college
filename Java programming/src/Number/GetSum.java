package Number;
//��Java�����ŵ���ͨ��P67 ��4.10 ͼ4.11
//����Ŀ�д�����GetSum������������ͨ��whileѭ��������1~10��ӣ�����������
public class GetSum {  //������

	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
		int x = 1;  //����int�ͱ���x����������ֵ
		int sum = 0;  //����������ڱ�����Ӻ�Ľ��
		while(x<=10) {
			sum =sum + x;  //whileѭ����䣬���������������ʽʱִ��ѭ�������
			x++;  //�޸�ѭ������
		}
        System.out.println("sum = "+sum);  //������sum���
	}
}