package textbook;
//��Java������ơ�P064
//4.���岢���÷���������뾶Ϊ3.1��Բ��������ܳ�����˼��������Ӽ�������뾶�������޸Ĵ��룿��
/*
 * ��ʾ�����ִ������¡�
 * public class CircleArea{
 *   static double calcArea(double r){  //�������Բ�������
 *   ...
 *   }
 *   return area;
 * }
 * public class CircleGirh{
 *   static double calcGirth(double r)  {  //�������Բ�ܳ�����
 *     ...
 *   }
 * }
 * public static void main(string[] args){
 *   double radius,area;
 *   ...
 *   System.out.printf("\n�뾶Ϊ3.1��Բ�����:%.2f",area);
 *   //���ü���Բ����ķ���
 *   System.out.printf("\n�뾶Ϊ3.1��Բ���ܳ�:%.2f",calcGirth(3.1));
 *   //���ü���Բ�ܳ��ķ���
 * }
 */
public class Ten {
	final static double PI=3.1415926;
	 public class CircleArea{	 
		 static double calcArea(double r) {
			 double area;
			 area=PI*r*r;
			 return area;
		 }	 
	   }  	 
	 public class circleGirth{	 
		static double calcGirth(double r) {
			double calcGirth;
		    calcGirth=2*PI*r;
		    return calcGirth;
	   }
	 }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        double radius,area;
        
        System.out.printf("\n�뾶Ϊ3.1��Բ�����:%.2f",area);
        System.out.printf("\n�뾶Ϊ3.1��Բ���ܳ�:%.2f",calcGirth(3.1));
	}
}