package Number;
//��Java�����ŵ���ͨ��P59 ��4.1 
//����Ŀ�д�����Compound�����������ж��帴�����飬���а�����һ�������顣�������£�
public class Compound {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int x = 20;
		{  //�������1�Ŀ�ʼ
			int y = 40;
			System.out.println(y);
			int z = 245;
			boolean b;
			{  //�������2�Ŀ�ʼ
				b = y > z;
				System.out.println(b);
			}  //�������2�Ľ���
		}  //�������1�Ľ���
		String word = "hello java";
		System.out.println(word);
  //���������Ƕ�׸������
	}

}
