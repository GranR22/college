package examples;
//��Java�����ŵ���ͨ��P100 ��5.29
//���ַ�����������ָ����λ������ַ���ʵ���������£�
public class STRINGBUILDERINSERT {
	public static void main(String[] args) {
	StringBuilder bf = new StringBuilder("hello");  //�����ַ���������
	bf.insert(5,"world");
	System.out.println(bf.toString());  //��ʱ�����ϢΪhelloword

}
}