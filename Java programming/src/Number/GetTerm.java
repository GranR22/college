package Number;
//��Java�����ŵ���ͨ��P63
//����Ŀ�д�����GetTerm�����������ж������x��ʹ��if...else if���֧���ͨ���ж�x��ֵ������������
public class GetTerm {  //��������

	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
		int x = 20;  //����int�;ֲ�����
		if(x>30) {  //�жϱ���x�Ƿ����30
			System.out.println("x��ֵ����30");  //��������ʱ�������Ϣ
		}else if(x>10){  //�жϱ���x�Ƿ����10
			System.out.println("x��ֵ����10����С��30");  //��������ʱ�������Ϣ
		}else if(x>0) {  //�жϱ���x�Ƿ����0
			System.out.println("x��ֵ����0����С��10");  //��������ʱ�������Ϣ
		}else {  //������������������ʱ��ִ�е�����
			System.out.println("x��ֵС��0");  //�����Ϣ
		}

	}

}
//if���ִֻ������Ϊ���������䣬������䶼����ִ�С�