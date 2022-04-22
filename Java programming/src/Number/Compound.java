package Number;
//《Java从入门到精通》P59 例4.1 
//在项目中创建类Compound，在主方法中定义复合语句块，其中包含另一复合语句块。代码如下：
public class Compound {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x = 20;
		{  //复合语句1的开始
			int y = 40;
			System.out.println(y);
			int z = 245;
			boolean b;
			{  //复合语句2的开始
				b = y > z;
				System.out.println(b);
			}  //复合语句2的结束
		}  //复合语句1的结束
		String word = "hello java";
		System.out.println(word);
  //复合语句中嵌套复合语句
	}

}
