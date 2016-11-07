package chapt01;

import java.util.Scanner;

public class ReadLine {

	public static void main(String[] args) {
		// int[] a={11, 2, 3, 4, 5, 6, 7 };
		// int[] b=new int[6];
		// System.arraycopy(a, 5, b, 0, 1);
		// for (int i = 0; i < b.length; i++) {
		// System.out.println("输出了结果"+i+":"+b[i]);
		// }
		System.out.println("你可以输入y结束:");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("输入一行字符然后按回车键:");
			String s=sc.next();
			if(s.equals("y")){
				System.out.println("结束运行");
				sc.close();
				return;
			}
			System.out.println("您的输入是: " + s.toUpperCase());
		}
	}

}
