package Number;
//��Java�����ŵ���ͨ��P93 ��5.23 ͼ5.18
//����Ŀ�д�����Eval��ʵ�ֵ�ǰ������Ϣ��4λ��ݡ��·�ȫ�ơ�2λ������ʽ�����
import java.util.Date;  //����java.util.Date��
public class Eval523 {  //�½���

	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
		Date date = new Date();  //����Date����date
		String year = String.format("%tY",date);  //��date���и�ʽ��
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		System.out.println("�����ǣ�"+year+"��");  //�����Ϣ
		System.out.println("�����ǣ�"+month);
		System.out.println("�����ǣ�"+day+"��");

	}

}
