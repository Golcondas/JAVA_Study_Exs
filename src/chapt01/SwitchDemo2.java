package chapt01;

import java.util.Date;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day; 				// 声明Day的变量
		day = Day.MONDAY; 		// 赋值，只能在七天中赋值
		switch (day) { 		// switch中可以用枚举类型
		case SUNDAY:
		case SATURDAY:
			System.out.println("周末，可以休息了。");
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			System.out.println("工作日");
			break;
		// 不需要default，因为day的值不可能超出枚举的范围。
		}
	}
}
