package Number;
//��Java�����ŵ���ͨ��P85 ��5.15 ͼ5.11
//����Ŀ�д�����NewStr�����������д���String���������ַ������е���ĸa�滻��A��Ľ�������
public class NewStr {  //������

	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
		String str = "address";  //�����ַ���str
		//�ַ���str�е��ַ�"a"�滻��"A"�󷵻��µ��ַ���newstr
		String newstr  = str.replace("a", "A");
		System.out.println(newstr);  //���ַ���newstr���

	}

}
//���Ҫ�滻���ַ�oldChar���ַ������ظ����ֶ�Σ�replace()�����Ὣ����oldCharȫ���滻��newChar
//Ҫ�滻���ַ�oldChar�Ĵ�СдҪ��ԭ�ַ������ַ��Ĵ�Сд����һ�£������ܳɹ����滻��