package chapt01;

import java.util.Scanner;

public class ReadLine {

	public static void main(String[] args) {
		// int[] a={11, 2, 3, 4, 5, 6, 7 };
		// int[] b=new int[6];
		// System.arraycopy(a, 5, b, 0, 1);
		// for (int i = 0; i < b.length; i++) {
		// System.out.println("����˽��"+i+":"+b[i]);
		// }
		System.out.println("���������y����:");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("����һ���ַ�Ȼ�󰴻س���:");
			String s=sc.next();
			if(s.equals("y")){
				System.out.println("��������");
				sc.close();
				return;
			}
			System.out.println("����������: " + s.toUpperCase());
		}
	}

}
