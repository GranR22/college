package practice;
//��Java�����ŵ���ͨ��P101 5.9ʵ������ϰ
//ʹ��������ʽ���ж��ַ���text�Ƿ�Ϊ�Ϸ����ֻ��š�����λ�ã�\TM\sl\5.21��
public class Practice11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        String text = "6545164681648";
        String rule = "1{1}\\d{10}";
        if(text.matches(rule)) {
        	System.out.println("�ֻ��źϷ�");
        }else {
        	System.out.println("�ֻ��Ų��Ϸ�");
        }
	}

}
