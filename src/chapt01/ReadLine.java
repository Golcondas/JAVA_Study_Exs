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
		Scanner sc = new Scanner(System.in);
		System.out.print("输入一行字符然后按回车键:");
		String s=sc.nextLine();
		System.out.print("您的输入是: " + s);
		//sc.close();
	}

}
