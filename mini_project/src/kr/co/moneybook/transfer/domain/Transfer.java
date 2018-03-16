package kr.co.moneybook.transfer.domain;

import java.util.Date;

public class Transfer {
	
	private int no;
	private String transferUserId;
	private int transferPrice;
	private String acceptUserId;
	private Date transferDate;
	private int userAmountPrice;
	
	public int getUserAmountPrice() {
		return userAmountPrice;
	}
	public void setUserAmountPrice(int userAmountPrice) {
		this.userAmountPrice = userAmountPrice;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTransferUserId() {
		return transferUserId;
	}
	public void setTransferUserId(String transferUserId) {
		this.transferUserId = transferUserId;
	}
	public int getTransferPrice() {
		return transferPrice;
	}
	public void setTransferPrice(int transferPrice) {
		this.transferPrice = transferPrice;
	}
	public String getAcceptUserId() {
		return acceptUserId;
	}
	public void setAcceptUserId(String acceptUserId) {
		this.acceptUserId = acceptUserId;
	}
	public Date getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}

}
