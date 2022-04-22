package javadesigning;
import java.util.Scanner;
public class MultithreadedTesting {
	public class TwoThreadGuessNumber {
	   public void main(String args[]) {
	      Number number=new Number();
	      number.giveNumberThread.start();
	      number.guessNumberThread.start();
	   }
	}
	public class Number implements Runnable {
	    final int SMALLER=-1,LARGER=1,SUCCESS=8;
	    int realNumber,guessNumber,min=0,max=100,message=SMALLER;
	    boolean pleaseGuess=false,isGiveNumber=false;
	    Thread giveNumberThread,guessNumberThread;
	    Number() {
	        giveNumberThread=new Thread(this);
	        guessNumberThread=new Thread(this);
	    }
	    public void run() {
	        for(int count=1;true;count++) {
	            setMessage(count);
	            if( message==SUCCESS)
	                return;
	        }
	    }
	    public synchronized void setMessage(int count) {
	        if(Thread.currentThread()==giveNumberThread&&isGiveNumber==false) {
	            realNumber=(int)(Math.random()*100)+1;
	            System.out.println("�������һ��1��100֮��������²����Ƕ��٣�");
	            isGiveNumber=true;
	            pleaseGuess=true;
	        }
	        if(Thread.currentThread()==giveNumberThread) {
	            while(pleaseGuess==true)
	                try  { wait();
	                }
	                catch(InterruptedException e){}
	            if(realNumber>guessNumber)  {
	                message=SMALLER;
	                System.out.println("������˼���С��");
	            }
	            else if(realNumber<guessNumber) {
	                message=LARGER;
	                System.out.println("������˼��´���");
	            }
	            else {
	                message=SUCCESS;
	                System.out.println("��ϲ��¶���");
	            }
	            pleaseGuess=true;
	        }
	        if(Thread.currentThread()==guessNumberThread&&isGiveNumber==true) {
	            while(pleaseGuess==false)
	                try { wait();
	                }
	                catch(InterruptedException e){}
	            if((message==SMALLER) || (message==LARGER)) {
	                Scanner scanner = new Scanner(System.in);
	                System.out.println("��������Ҫ�µ�����");
	                guessNumber = scanner.nextInt();
	                System.out.println("�ҵ�"+count+"�β��������:"+guessNumber);
	            }
	            pleaseGuess=false;
	        }
	        notifyAll();
	    }
	}
}
