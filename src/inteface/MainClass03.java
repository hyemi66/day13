package inteface;
abstract class A03 {
	public abstract void a03(); // 추상화메소드
	public void test() {
		System.out.println("test 기능입니다");
	}
}
class B03 extends A03 {
	public void b03() {
		System.out.println("새로운 기능 추가");
	}

	@Override
	public void a03() {
		System.out.println("새로운 내용");
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		B03 b = new B03();
		b.a03(); b.b03(); b.test();;
	}
}
