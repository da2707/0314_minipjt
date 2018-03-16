package kr.co.moneybook.user.ui;

import kr.co.moneybook.main.ui.BaseUI;
import kr.co.moneybook.user.domain.User;
import kr.co.moneybook.user.mapper.UserMapper;

public class UserUI extends BaseUI {
	private UserMapper mapper;
	
	public UserUI(UserMapper mapper){
		this.mapper = mapper;
	}

	@Override
	public void service() {
		User uv = new User();
		uv.setUserId(getStr("ID를 입력해주세요 : "));
		uv.setUserPw(getStr("Password를 입력해주세요 : "));
		uv.setUserEmail(getStr("e-mail을 입력해주세요 : "));
		uv.setUserPwHint(getStr("힌트를 입력해주세요 : "));
		uv.setUserAmountPrice(getInt("보유 금액을 입력해주세요  : "));
//		mapper.insertUser(uv);
		System.out.println("가입이 완료되었습니다.");
		
		
		
	}

}
