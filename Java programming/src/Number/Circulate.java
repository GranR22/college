package Number;
//��Java�����ŵ���ͨ��P69 ��4.12 ͼ4.15
//����Ŀ�д�����Circulate������������ʹ��forѭ��������2~100֮������ż��֮�͡�
public class Circulate {  //������Circulate

	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
		int sum = 0;  //�������������ڱ��������Ӻ�Ľ��
		for(int i = 2;i<=100;i+=2) {
			sum = sum + i;  //ָ��ѭ��������ѭ����
		}
        //����Ӻ�Ľ�����
		System.out.println("2��100֮�������ż��֮��Ϊ��"+sum);
	}

}
