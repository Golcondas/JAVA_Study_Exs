package chapt01;

public class FactorDemo {

	static String gongShi="";
	/**
	 * �ݹ� !10
	 * @param args
	 */
	public static void main(String[] args) {
		int a=10;
		System.out.println("�ݹ鷽��!10��"+factor(a)+'\n'+gongShi);
	}
	
	static int factor(int c){
		if(c<=1){
			return 1;
		}else{
			int b=c-1;
			gongShi+=c+"*";
			if(c==2){
				gongShi=gongShi.substring(0,gongShi.length()-1);
			}
			return c*factor(b);
		}
	}
}
