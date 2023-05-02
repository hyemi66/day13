package inteface;
class A04 {
	public void a04() { System.out.println("부모"); }
}
class B04 extends A04 implements Interface04 {
	//interface는 다중상속가능 -> 다만, 추상화이므로 해당 메소드에서 실체화시켜야지만 문법적에러x
	@Override
	public void test() {
		
	}

	@Override
	public void test1() {
		
	}
	
}
public class MainClass04 {
	public static void main(String[] args) {
		
	}
}
