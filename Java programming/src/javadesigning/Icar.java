package javadesigning;

public interface Icar {
	public abstract void run();
}
abstract class Car{
	private String color;
	Car(String color){
		this.color=color;
	}
	public String getColor(){
	return this.color;
  }
}
class BMW extends Car implements Icar{
	BMW(String color){
		super(color);
	}
	public void run() {
	System.out.println(getColor()+"��ɫ�ı�����������");
}
class BENZ extends Car implements Icar{
	BENZ(String color){
		super(color);
	}
	public void run(){
		System.out.println(getColor()+"��ɫ�ı�����������");
	}
}
public class Client{
	public void main(String args[]) {
        Icar c=new BMW("��ɫ");
        c.run();
        c=new BENZ("��ɫ");
        c.run();
    }
  }
}
