package kr.co.moneybook.main.ui;

import java.util.Scanner;

public abstract class BaseUI {
	public Scanner sc = new Scanner(System.in);

	public abstract void service();
	
	public String getStr(String msg){
		System.out.print(msg);
		return sc.nextLine();
	}
	public int getInt(String msg){
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
}
