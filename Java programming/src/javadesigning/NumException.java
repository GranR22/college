package javadesigning;

public class NumException {
	
	public static void main(String[]args) throws Exception {
		int a=500;
	    int b=600;
	    int c=800;
		if(a>500|b>500|c>500) {
			throw new Exception("��������");
		}else {
			System.out.println("������ı���֮��Ϊ"+(a+b+c));
		}
	}
}
