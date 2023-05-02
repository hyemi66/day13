package overriding;

import java.util.ArrayList;

class A03 {}
class B03 extends A03 {}
class C03 {
	int age;
	String name;
	@Override
	public String toString() {
		return "[" + age + "," + name + "]";
	}
	
}
public class MainClass03 {
	public static void main(String[] args) {
		// Object로 모든 값을 저장할 수 있음
		Object b = new B03();
		Object num = "aaa";
		Object num1 = 111;
		Object num2 = 111.111;
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		
		C03 c = new C03();
		c.age = 20; c.name = "홍길동";
		
		System.out.println(c);
		System.out.println(c.toString());
		System.out.println(arr);
		System.out.println(arr.toString());
		
	}
}
