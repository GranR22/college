package examples;
//��Java�����ŵ���ͨ��P78 ��5.3
//��ȡ�ַ���a�е�һ���ִ���һ���ַ�������ʵ���������£�
public class STRING2 {
  char a[]= {'s','t','u','d','e','n','t'};
  String s = new String(a,2,4);
  //�������д���ȼ���String s = new String("uden");
}
/*String(char a[],int offset,int length)  
��ȡ�ַ���a�е�һ���ִ���һ���ַ������󡣲���offset��ʾ��ʼ��ȡ�ַ�����λ�ã�length��ʾ��ȡ�ַ����ĳ���
*/