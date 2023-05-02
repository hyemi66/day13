package overriding;

import java.util.ArrayList;

class A02 extends ArrayList<String> {
	String[] arr = new String[3];
	public void test() {}

	@Override
	public boolean add(String e) {
		System.out.println("내용을 추가해 줍니다");
		arr[0] = e;
		return true;
	}

	@Override
	public String get(int index) {
		System.out.println("내가 만든 get실행");
		return arr[index];
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		A02 a = new A02();
		a.add("안녕하세요");
		System.out.println(a.get(0));
	}
}
