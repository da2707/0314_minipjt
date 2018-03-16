package kr.co.moneybook.user.ui;

import java.util.Scanner;

import kr.co.moneybook.main.ui.BaseUI;
import kr.co.moneybook.user.mapper.UserMapper;

public class FindUserUI extends BaseUI {
	private Scanner sc = new Scanner(System.in);
	private UserMapper mapper;
	
	public void FindeUserUI(String str) {
		this.mapper = mapper;
	}
	@Override
	public void service() {
		
		while(true) {
			switch(menu()) {
			case 1:
					System.out.println("1.이메일로 인증하기");
			case 2:
					System.out.println("1.이메일로 인증하기");
					System.out.println("2.비밀번호 힌트로 찾기");
			}
		}
	}
	private int menu() {
		System.out.println("1.아이디 찾기");
		System.out.println("2.비밀번호 찾기");
		return Integer.parseInt(sc.nextLine());
	}
}
