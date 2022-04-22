package practice;
//《Java从入门到精通》P101 5.9实践与练习
//使用正则表达式来判断字符串text是否为合法的手机号。（答案位置：\TM\sl\5.21）
public class Practice11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        String text = "6545164681648";
        String rule = "1{1}\\d{10}";
        if(text.matches(rule)) {
        	System.out.println("手机号合法");
        }else {
        	System.out.println("手机号不合法");
        }
	}

}
