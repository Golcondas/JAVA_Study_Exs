package chapt01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("简易计算器,你可以输入y结束:");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("输入第一个数字");
			String a=sc.next();
			System.out.println("输入+、-、*、/");
			String b=sc.next();
			System.out.println("输入第二个数字");
			String c=sc.next();
			if(a.equals("y")||b.equals("y")||c.equals("y")){
				System.out.println("结束运行");
				sc.close();
				return;
			}
			String result="";
			switch (b) {
			case "+":
				result=Integer.toString(Integer.parseInt(a)+Integer.parseInt(c));
				if(String.valueOf(result) != null||result.equals("")){
					System.out.println("結果: " + result);
				}
				continue;
			case "-":
				result=Integer.toString(Integer.parseInt(a)-Integer.parseInt(c));
				if(String.valueOf(result) != null||result.equals("")){
					System.out.println("結果: " + result);
				}
				continue;
			case "*":
				result=Integer.toString(Integer.parseInt(a)*Integer.parseInt(c));
				if(String.valueOf(result) != null||result.equals("")){
					System.out.println("結果: " + result);
				}
				continue;
			case "/":
				result=Integer.toString(Integer.parseInt(a)/Integer.parseInt(c));
				if(String.valueOf(result) != null||result.equals("")){
					System.out.println("結果: " + result);
				}
				continue;
			default:
				break;
			}
			
		}
	}

}
