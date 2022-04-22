package javadesigning;

public abstract class	Compute{
	public abstract int computer(int n,int m);
}
class Add extends Compute{
	private int n,m,result;
	public int computer(int n,int m){
		this.n=n;
		this.m=m;
		this.result=this.n+this.m;
		System.out.println(result);
		return result;
	}
}
class Minus extends Compute{
	private int n,m,result;
	public int computer(int n,int m){
		this.n=n;
		this.m=m;
		this.result=this.n-this.m;
		System.out.println(result);
		return result;
	}
}
class Mul extends Compute{
	private int n,m,result;
	public int computer(int n,int m){
		this.n=n;
		this.m=m;
		this.result=this.n*this.m;
		System.out.println(result);
		return result;
	}
}
class Div extends Compute{
	private int n,m,result;
	public int computer(int n,int m){
		this.n=n;
		this.m=m;
		this.result=this.n/this.m;
		System.out.println(result);
		return result;
	}
	class Test{
public void main(String[] args ) {
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
}
