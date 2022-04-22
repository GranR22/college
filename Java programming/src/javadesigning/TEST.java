package javadesigning;

public class TEST {
	public static void main(String[] args ) {
		Compute a=new Add();
		a.computer(1, 2);
		Compute b=new Minus();
		b.computer(1, 2);
		Compute c=new Mul();
		c.computer(1, 2);
		Compute d=new Div();
		d.computer(1, 2);
		
	  }
}
