package kr.co.moneybook.main.ui;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.moneybook.user.mapper.UserMapper;
import kr.co.moneybook.user.ui.FindUserUI;
import kr.co.moneybook.user.ui.LoginUI;
import kr.co.moneybook.user.ui.UserUI;

public class MainUI {
	private Scanner sc = new Scanner(System.in);
	private UserMapper mapper;
	public MainUI() {
		SqlSession session = MyAppSqlConfig.getSqlSessionInstance();
		mapper = session.getMapper(UserMapper.class);
	}
	public void service() {
		BaseUI ui = null;
		while(true) {
			switch(menu()) {
			case 1: ui = new UserUI(mapper); break;
			case 2: ui = new LoginUI(mapper); break;
			case 3: ui = new FindUserUI(); break;
			case 0: quit();
			}
			ui.service();
		}
	}

	private int menu() {
		System.out.println("-------------------------------");
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("3.계정찾기");
		System.out.println("0.종료");
		System.out.println("-------------------------------");
		System.out.print("메뉴를 선택해주세요 : ");
		return Integer.parseInt(sc.nextLine());
	}

	private void quit() {
		System.out.println("프로그램을 종료합니다");
		System.exit(0);
		
	}
}
