package textbook;
//��Java������ơ�P063
//1.ʹ��if����д�ɻ����������շѳ��򣺳����ɻ�ʱ��ÿλ�˿Ϳ����������20kg���ڵ�����������ְ�ÿ����1.2Ԫ�շѡ�
/*
 * ��ʾ�����ִ������¡�
 * import java.util.Scanner;
 * ...
 * double w,fee;
 * Scanner reader=new Scanner(System.in);
 * System.out.print("��������Ϊ��");
 * ...
 * if{   ...
 * System.out.print("����Ϊ��"+fee+"Ԫ��������ң�");
 * }
 * else
 * {   fee=0;
 * System.out.print("�����أ�����Ϊ0Ԫ");
 * }
 * ...
 */
import java.util.Scanner;
public class Seven {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double w,fee;
	    Scanner reader=new Scanner(System.in);
		w=reader.nextDouble();
		reader.close();
	    System.out.print("��������Ϊ��"+w+"���");	    
		if(w>20){
			fee=(w-20)*1.2;
		    System.out.print("����Ϊ��"+fee+"Ԫ��������ң�");
		 }else{
			 fee=0;
		     System.out.print("�����أ�����Ϊ0Ԫ");
		 }			
	}
}
		