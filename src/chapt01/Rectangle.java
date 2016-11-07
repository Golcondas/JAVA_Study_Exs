package chapt01;

public class Rectangle {
	public double length;					// 公开的属性
	private double width;					// 私有的属性
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
	 * 面积
	 * @param length 长度
	 * @param width 宽度
	 * @return
	 */
	public double area(double length,double width){
		return length*width;
	}
}
