package inteface;
class A06지상군 {
	public void 지상군공격() {
		System.out.println("지상군이 공격합니다");
	}
	public void 지상군방어() {
		System.out.println("지상군이 방어합니다");
	}
}
class B06공군 {
	public void 미사일장착() {}
	public void 연료() {}
	public void 시동() {}
	public void 비행기공격() {
		System.out.println("비행기가 공격합니다");
	}
	public void 비행기방어() {
		System.out.println("비행기가 방어합니다");
	}
}
public class MainClass06 {
	public static void main(String[] args) {
		A06지상군 a = new A06지상군();
		B06공군 b = new B06공군();
		a.지상군공격(); a.지상군방어();
		b.비행기공격(); b.비행기방어();
	}
}
