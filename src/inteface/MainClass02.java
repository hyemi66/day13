package inteface;

import java.util.ArrayList;

class A02 {
	public void aa() {}
}
class B02 extends A02 {
	public void aa() {}
	public void test() {}
}
public class MainClass02 {
	public static void main(String[] args) {
		A02 a = new B02(); // up casting : 부모형태로 먼저 올라가므로 자식의 것을 볼 수 없음
		B02 b = (B02)a; // 그래서 down casting으로 형변환하여 자식메소드의 클래스를 사용
		b.test();
		
	}
}
