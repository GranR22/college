package Number;
//��Java�����ŵ���ͨ��P74 ��4.17
//���1~20֮���������ʹ��continue����ѭ��
public class ContinueTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i = 1;i<20;i++) {
			if (i%2==0) {  //���i��ż��
				continue;  //������һѭ��
			}
            System.out.println(i);  //���i��ֵ
	}

   }
}