package Number;
//《Java从入门到精通》P72 例4.15 图4.19
//在嵌套的循环中使用break跳出内层循环
public class BreakInsideNested {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int i=0;i<3;i++) {
			for(int j = 0;j<6;j++) {
				if(j==4) {  //如果j等于4就结束内部循环
					break;
				}
				System.out.println("i="+i + "j="+j);
			}
		}

	}

}
