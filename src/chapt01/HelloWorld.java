package chapt01;

/**
* ���ǵڶ�������, ���������޸�, ���Դ��������ж�ȡ��һ������, ��
* ���ò����������Ļ�ϡ�
* 
* @author ���ܹ�
*/
public class HelloWorld {
	// hello����Ӣ�ĵ��ʺ���
	private static String hello = "Hello, ";

	/**
	 * ���ǳ����������<
	 * 
	 * @param����: args �ַ�������, ���������н���<br>
	 * @return ����ֵ: ��<br>
	 */
	public static void main(String[] args) {
		System.out.println("hello");
		//sayHello(args[0]);
	}
	
	/*
	 * sayHello�Ĺ���������ʺ���.
	 * @param����: name �ַ���, ���ʺ��ߵ�����
	 * @return ����ֵ: ��
	 */
	private static void sayHello(String name) {
		System.out.println(hello + name);
	}
}