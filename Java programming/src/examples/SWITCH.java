package examples;
//��Java�����ŵ���ͨ��P65 ��4.8
//Ҫͨ��switch�������ַ���str��ֵ�������ͬ����ʾ��Ϣ����ʹ������Ĵ���
public class SWITCH {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String str ="���տƼ�";
			switch(str){
			case"����":  //����case����еĳ���1
				System.out.println("����ͼ����www.mingribook.com");  //�����Ϣ
				break;
			case"���տƼ�":  //����case����еĳ���2
			    System.out.println("����ʡ���տƼ����޹�˾");  //�����Ϣ
			    break;
		    default:  //default���
			    System.out.println("�������������ǡ�");  //�����Ϣ
				
		}

	}

}
