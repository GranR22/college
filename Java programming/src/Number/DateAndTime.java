package Number;
//��Java�����ŵ���ͨ��P95 ��5.25 ͼ5.20
//����Ŀ�д�����DateAndTime,����������ʵ�ֽ���ǰ����ʱ���ȫ����Ϣ�Լ�ָ����ʽ�����������
import java.util.Date;
public class DateAndTime {  //������
	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
		Date date = new Date();  //����Date����date
		String time = String.format("%tc",date);  //��date��ʽ��
		String form = String.format("%tF",date);
        //����ʽ���������ʱ�����
		System.out.println("ȫ����ʱ����Ϣ�ǣ�"+time);
		System.out.println("��-��-�ո�ʽ��"+form);
	}

}
