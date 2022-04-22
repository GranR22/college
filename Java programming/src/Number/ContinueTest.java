package Number;
//《Java从入门到精通》P74 例4.17
//输出1~20之间的奇数，使用continue跳出循环
public class ContinueTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int i = 1;i<20;i++) {
			if (i%2==0) {  //如果i是偶数
				continue;  //跳到下一循环
			}
            System.out.println(i);  //输出i的值
	}

   }
}