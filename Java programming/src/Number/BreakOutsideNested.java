package Number;
//《Java从入门到精通》P73 例4.16 图4.20
//用带有标签的break跳出外层循环
public class BreakOutsideNested {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Loop:for(int i =0;i<3;i++) {  //在for循环前用标签标记
			for(int j =0;j<6;j++) {
				if(j==4) {  //如果j等于4就结束外层循环
					break Loop;  //跳出Loop标签标记的循环体
				}
				System.out.println("i="+i+"j="+j);
			}
		}

	}

}
