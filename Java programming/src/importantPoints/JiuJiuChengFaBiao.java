package importantPoints;
//��Java������ơ�P054��3-16
//��д����ʹ�ö���ѭ�������㲢����žų˷���
public class JiuJiuChengFaBiao {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int x=1;x<=9;x++) {
        	for(int y=1;y<=x;y++) {
        		System.out.print(y+"*"+x+"="+(x*y)+"\t");
        		//"\t"Ϊת���ַ��еĴ�ֱ�Ʊ����������Ƶ���һ���Ʊ����λ��
        	}
        	System.out.println();   //���У��С�ln��׺����
	}       
        }
}
//���ϴ��벻���鱾�ϵı�׼���룬�о����˸Ķ�
/*
*����Ĵ���Ϊ��Java������ơ�P054��3-16�Ĳ��ִ��룺
*for(int i=1;i<=9;i++) {   //��һ��ѭ��
      	for(int j=1;j<=i;j++) {   //�ڶ���ѭ��
      		System.out.print(i+"*"+j+"="+(i*j)+"\t");
      		//"\t"Ϊת���ַ��еĴ�ֱ�Ʊ����������Ƶ���һ���Ʊ����λ��
      	}
      	System.out.print("\n");
      	//���У�ת���ַ���
      }   
*/