package chapt01;

public class RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle=new Rectangle();
		rectangle.length=10;
		rectangle.setWidth(20);
		
		System.out.println("����������ǣ�"+rectangle.area(rectangle.length,rectangle.getWidth()));
	}

}
