package chapt01;

public class Rectangle {
	public double length;					// ����������
	private double width;					// ˽�е�����
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * ���
	 * @param length ����
	 * @param width ���
	 * @return
	 */
	public double area(double length,double width){
		return length*width;
	}
}
