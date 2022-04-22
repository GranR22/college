package javadesigning;

import java.util.Random;

public class TestingOfRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random myRandom = new Random();
		int n=1;
		while(n<8){
			System.out.println(10+ myRandom.nextInt(100-10+1));
			n++;
	}

}
}