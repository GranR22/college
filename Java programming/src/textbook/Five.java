package textbook;
//��Java������ơ�P041
//5.��֪a=10��b=12����д���򣬽�������������ֵ
public class Five {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a=10;
        int b=12;
        int Exchange=a;  //�ȴ����м����Exchange,����a��ֵ����Exchange����ֵ��ɺ�aԭ����ֵ�����ߣ���ֵ��Ϊ��
        a=b;  //��a��ֵΪ��ֵʱ��b��ֵ����a����ֵ��ɺ�b��ֵ��Ϊ��ֵ��a��ֵΪbԭ����ֵ
        b=Exchange;  //��ӵ��ԭ��a��ֵ���м������ֵ����b����ֵ��ɺ��м������ֵ��Ϊ��ֵ��b��ֵΪaԭ����ֵ
        //�ر�ע����ĸ˳���ܵߵ����ھ���a��β����ʮ�о�a��ͷ����ʮ��b��β����ʮһ�о�b��ͷ��������Ҫ��β��Ӧ
        System.out.println(a);
        System.out.println(b);
	}

}
