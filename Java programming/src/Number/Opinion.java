package Number;
//��Java�����ŵ���ͨ��P88 ��5.18 ͼ5.14
//����Ŀ�д�����Opinion�����������д���String������ʵ���ж������ַ����Ƿ���ȣ�������������
public class Opinion {  //������

	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
		String s1 = new String("abc");  //�����ַ�������s1
		String s2 = new String("ABC");  //�����ַ�������s2
		String s3 = new String("abc");  //�����ַ�������s3
		boolean b = s1.equals(s2);
		//ʹ��equalslgnoreCase()�����Ƚ�s1��s2
		boolean b2 = s1.equalsIgnoreCase(s2);
		System.out.println(s1+" equals"+s2+":"+b2);  //�����Ϣ
		System.out.println(s1+" equalsIgnoreCase"+s2+":"+b2);

	}

}
