package Number;
//��Java�����ŵ���ͨ��P94 ��5.24 ͼ5.19
//����Ŀ�д�����GetDate,ʵ�ֽ���ǰʱ����Ϣ��2λСʱ����2λ��������2λ������ʽ���
import java.util.Date;  //����java.util.Date��
public class GetDate {  //�½���

	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
		Date date = new Date();  //����Date����date
        String hour = String.format("%tH", date);  //��date���и�ʽ��
        String minute = String.format("%tM", date);
        String second = String.format("%tS",date);
        //�����Ϣ
        System.out.println("�����ǣ�"+hour+"ʱ"+minute+"��"+second+"��");
	}

}
