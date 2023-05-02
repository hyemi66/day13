package overriding;

import java.util.ArrayList;
import java.util.Scanner;

class login {
	ArrayList<String> id = new ArrayList<>();
	ArrayList<String> pwd = new ArrayList<>();
	String inputId, inputPwd;
	Scanner sc = new Scanner(System.in);
	int index = 0;
	boolean bool;
	public void input() {
		System.out.print("아이디 : ");
		this.inputId = sc.next();
		System.out.print("비밀번호 : ");
		this.inputPwd = sc.next();
	}
	public void login() {
		bool = id.contains(inputId);
		if(id.size()==0) { System.out.println("회원가입부터 진행해주세요"); }
		else {
			if(bool) {
				index = id.indexOf(inputId);
				if(pwd.get(index).equals(inputPwd)) {
					System.out.println("인증성공");
				} else { System.out.println("비밀번호틀림"); }
			} else { System.out.println("아이디없음"); }
		}
	}
	public void madeLo() {
		bool = id.contains(inputId);
		if(!bool) {
			id.add(inputId); pwd.add(inputPwd);
			System.out.println("가입완료");
		} else { System.out.println("중복되는 아이디입니다."); }
	}
}
public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		login login = new login();
		int num;
		while(true) {
			System.out.println("1.로그인 2.가 입 3.로그아웃");
			System.out.print(">>> ");
			num = sc.nextInt();
			if(num==1) {
				login.input();
				login.login();
			}
			else if(num==2) {
				login.input();
				login.madeLo();
			}
			else if(num==3) { System.out.println("로그아웃"); break; }
			else { System.out.println("다시선택"); }
		}
	}
}
