package Number;
//��Java�����ŵ���ͨ��P65-P66 ��4.9 ͼ4.9
//����Ŀ�д�����GetSwitch������������Ӧ��switch��佫��һ��������Ӣ�ĵ��ʴ�ӡ����
public class GetSwitch {  //������

	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
        int week = 2;  //����int�ͱ���week
        switch(week) {  //ָ��switch���ı��ʽΪ����week
        case 1:  //����case����еĳ���Ϊ1
        	System.out.println("Monday");  //�����Ϣ
        	break;
        case 2:  //����case����еĳ���Ϊ2
        	System.out.println("Tuesday");  //�����Ϣ
        	break;
        case 3:  //����case����еĳ���Ϊ3
        	System.out.println("Wednesday");  //�����Ϣ
        	break;
        default:  //default���
        	System.out.println("Sorry,I don't know.");
        }
	}

}
