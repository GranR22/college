package Number;
//��Java�����ŵ���ͨ��P89 ��5.19 ͼ5.15
//����Ŀ�д�����Wordbook�����������д���String������ʹ��compareTo()�������ַ��������бȽϣ������ȽϽ�������
public class Wordbook {  //������

	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
        String str = new String("b");
        String str2 = new String("a");
        String str3 = new String("c");
        //������������Ϊ���ڱȽϵ�3���ַ���
        System.out.println(str+" compareTo "+str2+":"+str.compareTo(str2));  //��str��str2�ıȽϽ�����
        System.out.println(str+" compareTo "+str3+":"+str.compareTo(str3));  //��str��str3�ȽϵĽ�����
	}

}
//compareTo()����ֻ����equals(Object)��������trueʽ����Ч