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
			System.out.println("������");
			break;
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		default:
			System.out.println("��������ֲ���ȷ��");
			break;
		}
		return null;
	}

}
