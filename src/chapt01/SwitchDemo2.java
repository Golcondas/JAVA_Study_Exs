package chapt01;

import java.util.Date;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day; 				// ����Day�ı���
		day = Day.MONDAY; 		// ��ֵ��ֻ���������и�ֵ
		switch (day) { 		// switch�п�����ö������
		case SUNDAY:
		case SATURDAY:
			System.out.println("��ĩ��������Ϣ�ˡ�");
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			System.out.println("������");
			break;
		// ����Ҫdefault����Ϊday��ֵ�����ܳ���ö�ٵķ�Χ��
		}
	}
}
