package chapt01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���׼�����,���������y����:");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�����һ������");
			String a=sc.next();
			System.out.println("����+��-��*��/");
			String b=sc.next();
			System.out.println("����ڶ�������");
			String c=sc.next();
			if(a.equals("y")||b.equals("y")||c.equals("y")){
				System.out.println("��������");
				sc.close();
				return;
			}
			String result="";
			switch (b) {
			case "+":
				result=Integer.toString(Integer.parseInt(a)+Integer.parseInt(c));
				if(String.valueOf(result) != null||result.equals("")){
					System.out.println("�Y��: " + result);
				}
				continue;
			case "-":
				result=Integer.toString(Integer.parseInt(a)-Integer.parseInt(c));
				if(String.valueOf(result) != null||result.equals("")){
					System.out.println("�Y��: " + result);
				}
				continue;
			case "*":
				result=Integer.toString(Integer.parseInt(a)*Integer.parseInt(c));
				if(String.valueOf(result) != null||result.equals("")){
					System.out.println("�Y��: " + result);
				}
				continue;
			case "/":
				result=Integer.toString(Integer.parseInt(a)/Integer.parseInt(c));
				if(String.valueOf(result) != null||result.equals("")){
					System.out.println("�Y��: " + result);
				}
				continue;
			default:
				break;
			}
			
		}
	}

}
