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
	System.out.println(getColor()+"颜色的宝马正在运行");
}
class BENZ extends Car implements Icar{
	BENZ(String color){
		super(color);
	}
	public void run(){
		System.out.println(getColor()+"颜色的奔驰正在运行");
	}
}
public class Client{
	public void main(String args[]) {
        Icar c=new BMW("蓝色");
        c.run();
        c=new BENZ("白色");
        c.run();
    }
  }
}
