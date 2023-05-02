package inteface;

public class B08공군 implements Unit08 {

	@Override
	public void attack() {
		System.out.println("비행기가 공격");
	}

	@Override
	public void defense() {
		System.out.println("비행기가 방어");
	}

}
