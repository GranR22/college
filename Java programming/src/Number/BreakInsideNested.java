package Number;
//��Java�����ŵ���ͨ��P72 ��4.15 ͼ4.19
//��Ƕ�׵�ѭ����ʹ��break�����ڲ�ѭ��
public class BreakInsideNested {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i=0;i<3;i++) {
			for(int j = 0;j<6;j++) {
				if(j==4) {  //���j����4�ͽ����ڲ�ѭ��
					break;
				}
				System.out.println("i="+i + "j="+j);
			}
		}

	}

}
