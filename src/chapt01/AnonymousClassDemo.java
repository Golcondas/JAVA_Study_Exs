package chapt01;

public class AnonymousClassDemo {
	public static void main(String[] args) {
		Person p = new Child();
		p.eat();

		People p1 = new People() {

			@Override
			public void eat() {
				System.out.println("接口输出匿名类eat()");
			}
		};
		p1.eat();

		Thread t1 = new Thread() {
				public void run() {
					for (int i = 1; i <= 5; i++) {
						System.out.print(i+" ");
					}
				}
		};
		t1.start();
	}

}

abstract class Person {
	public abstract void eat();
}

class Child extends Person {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("输出匿名方法eat()");
	}
}

interface People {
	public void eat();
}