package kr.co.moneybook.main.ui;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.moneybook.transfer.mapper.TransferMapper;
import kr.co.moneybook.transfer.ui.TransferInquiryUI;
import kr.co.moneybook.transfer.ui.TransferUI;

public class AfterLoginUI extends BaseUI {
	private Scanner sc = new Scanner(System.in);
	public static String id = "g";
	private TransferMapper transMapper;
	
	public AfterLoginUI() {
		SqlSession session = MyAppSqlConfig.getSqlSessionInstance();
		transMapper = session.getMapper(TransferMapper.class);
	}


	public void service(){
		BaseUI ui = null;
		while(true){
			switch(menu()){
			case 1: break;
			case 2: break;
			case 3: 
				ui = new TransferUI(transMapper); break;
			case 4: ui = new TransferInquiryUI(transMapper); break;
			case 5: break;
			case 6: break;
			case 7: break;
			case 8: break;
			}
			ui.service();
		}
	}

	
	private int menu(){
		System.out.println("----------------------------------");
		System.out.println("1. 가계부 조회");
		System.out.println("2. 가계부 작성");
		System.out.println("3. 보유금 이체");
		System.out.println("4. 이체 내역 조회");
		System.out.println("5. 파일로 저장");
		System.out.println("6. 카테고리 관리");
		System.out.println("7. 로그아웃");
		System.out.println("8. 회원탈퇴");
		System.out.println("메뉴를 선택 하세요 : ");
		return Integer.parseInt(sc.nextLine());
	}
}
