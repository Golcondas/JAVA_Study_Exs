package chapt01;

/**
* 这是第二个程序, 作了少许修改, 可以从命令行中读取第一个参数, 并
* 将该参数输出到屏幕上。
* 
* @author 黄能耿
*/
public class HelloWorld {
	// hello保存英文的问候语
	private static String hello = "Hello, ";

	/**
	 * 这是程序的主方法<
	 * 
	 * @param参数: args 字符串数组, 从命令行中接收<br>
	 * @return 返回值: 无<br>
	 */
	public static void main(String[] args) {
		System.out.println("hello");
		//sayHello(args[0]);
	}
	
	/*
	 * sayHello的功能是输出问候语.
	 * @param参数: name 字符串, 被问候者的名字
	 * @return 返回值: 无
	 */
	private static void sayHello(String name) {
		System.out.println(hello + name);
	}
}