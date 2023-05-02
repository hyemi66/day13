package overriding;
final class A04 { // class앞에 final붙을시 상속x -> 오버라이딩x
	public void test() {
		System.out.println("부모 메소드");
	}
}
class B04 {
	A04 a = new A04(); // 부모메소드 사용하고 싶을시 객체 만들어서 사용
	public void test() {
		a.test();
		System.out.println("자식 메소드");
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		B04 b = new B04();
		b.test();
	}
}
