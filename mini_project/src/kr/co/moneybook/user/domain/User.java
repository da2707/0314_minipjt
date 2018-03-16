
package kr.co.moneybook.user.domain;

public class User {
	private String userId;
	private String userPw;
	private String userEmail;
	private String userPwHint;
	private int userAmountPrice;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPwHint() {
		return userPwHint;
	}
	public void setUserPwHint(String userPwHint) {
		this.userPwHint = userPwHint;
	}
	public int getUserAmountPrice() {
		return userAmountPrice;
	}
	public void setUserAmountPrice(int userAmountPrice) {
		this.userAmountPrice = userAmountPrice;
	}

	
}
