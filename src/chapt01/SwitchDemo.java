package chapt01;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getToday(0);
	}
	
	public static String getToday(int num)
	{
		switch (num) {
		case 0:
			System.out.println("星期日");
			break;
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		default:
			System.out.println("输入的数字不正确。");
			break;
		}
		return null;
	}

}
