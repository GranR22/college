package practice;
//��Java�����ŵ���ͨ��P75 4.6ʵ������ϰ
//3.��дJava����ʹ��whileѭ��������1+1/2!+1/3!+������+1/20!֮�͡�
public class Practice8 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double x=1;
		double y=1;
		double z=0;
		double sum=0;
		while(x<=20) {
			y=y*x;
			z=1/y;
			sum=sum+z;
			x++;
		}
        System.out.println("1+1/2!+1/3!+������+1/20!�ĺ�Ϊ"+sum);
	}

}
