package textbook;  //��
//��Java������ơ�P019
//2.����Ļ�ϴ�ӡ����ͼ��
public class Two {   //��

	public static void main(String[] args) {  //������
		// TODO �Զ����ɵķ������
		
        for(int i=0;i<=29;i++){  //Ӧ��forѭ����for����ʼ���������������ʽ���ı�ѭ��������
        	System.out.print('*');  //ѭ����
        	if(i==29) {  //ѭ������Ƕ��һ������ѡ��ṹ�Դﵽһ������ʱ������ѭ��
        		continue;  //�������������ѭ��
        	}
        }
        System.out.println();  //���У���һ��
        for(int j=0;j<=5;j++) {  //��Ϊj++������ԭ���������ʽ��j<=6����Ϊ��j<=5��,�����ӡ�Ľ����6����*��
        	System.out.print("*");
        	if(j==5) {
        		continue;
        	}
        }
        System.out.print("  Java�������  ");  //printû��ln��׺�ͽ����ϴεĴ�ӡ��������û�л���
        for(int k=0;k<=5;k++) {
        	System.out.print('*');
        	if(k==5) {
        		continue;
        	}
        }
        System.out.println();
        for(int l=0;l<=29;l++) {
        	System.out.print('*');
        	if(l==29) {
        		continue;
        	}
        }
	}

}
