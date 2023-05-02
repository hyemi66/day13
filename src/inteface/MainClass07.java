package inteface;
interface Unit07 {
	public void attack(); // 공격
	public void defense(); // 방어
}
class A07 implements Unit07 {
	
	@Override
	public void attack() {
		System.out.println("지상군이 공격합니다");
	}

	@Override
	public void defense() {
		System.out.println("지상군이 방어합니다");
	}
	
}
public class MainClass07 {
	public static void main(String[] args) {
		Unit07 a = new A07();
		a.attack(); a.defense();
		
	}
}
