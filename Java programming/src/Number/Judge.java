package Number;
//��Java�����ŵ���ͨ��P98 ��5.27 ͼ5.22
//����Ŀ�д�����Judge������������ʵ��ʹ��������ʽ���ж�ָ���ı����Ƿ�Ϊ�Ϸ���E-mail��ַ��
public class Judge {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����Ҫƥ��E-mail��ַ��������ʽ
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String str1 = "aaa@";  //����Ҫ������֤���ַ���
        String str2 = "aaaaa";
        String str3 = "1111@111ffyu.dfg.com";
        if(str1.matches(regex)) {  //�ж��ַ��������Ƿ���������ʽƥ��
        	System.out.println(str1+"��һ���Ϸ���E-mail��ַ��ʽ");
        }
        if(str2.matches(regex)) {
        	System.out.println(str2+"��һ���Ϸ���E-mail��ַ��ʽ");
        }
        if(str3.matches(regex)) {
        	System.out.println(str3+"��һ���Ϸ���E-mail��ַ��ʽ");
        }
	}

}
/*
*������ʽ������
*ͨ�������E-mail�ĸ�ʽΪ��X@X.com.cn����
*�ַ�X��ʾ�����һ�������ַ���@ΪE-mail��ַ�����з��ţ�����@����һ�������ַ���֮�����ַ���.com����Ҳ���ܺ��滹�����ơ�.cn���ı�ǡ�
*�ܽ�E-mail��ַ����Щ�ص㣬��˿�����д������ʽ��\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}����ƥ��E-mail��ַ
*�ַ�����\\w��ƥ�������ַ������š�+����ʾ�ַ����Գ���һ�λ��Σ����ʽ��(\\.\\w{2,3})*����ʾ���硰.com����ʽ���ַ������Գ���0�λ��Ρ������ı��ʽ��\\.\\w{2,3}������ƥ��E-mail��ַ�еĽ�β�ַ����硰.com��
*/