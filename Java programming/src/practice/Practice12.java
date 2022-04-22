package practice;
//《Java从入门到精通》P101 5.9实践与练习
//使用字符串生成器，将字符串str追加1~10这10个数字。（答案位置：\TM\sl\5.22）
public class Practice12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        StringBuilder str = new StringBuilder("str");
        str.insert(3,"1,2,3,4,5,6,7,8,9,10");
        System.out.println(str.toString());
	}

}
