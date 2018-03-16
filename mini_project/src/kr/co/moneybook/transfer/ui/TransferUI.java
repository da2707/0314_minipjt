package kr.co.moneybook.transfer.ui;


import kr.co.moneybook.main.ui.AfterLoginUI;
import kr.co.moneybook.main.ui.BaseUI;
import kr.co.moneybook.transfer.domain.Transfer;
import kr.co.moneybook.transfer.mapper.TransferMapper;

public class TransferUI extends BaseUI{
	
	private TransferMapper transMapper;
	
	public TransferUI(TransferMapper transMapper) {
		this.transMapper = transMapper;
	}



	public void service(){
		int userTotalPrice = 0;
		Transfer t = new Transfer();
		String userId = getStr("받는사람 ID를 입력하세요 : ");
		int price = getInt("이체할 금액을 입력하세요 : " );
		t.setTransferUserId(AfterLoginUI.id);
		t.setTransferPrice(price);
		t.setAcceptUserId(userId);
		if(transMapper.selectFindUserId(userId) == null ){
			System.out.println("받는사람 아이디가 없습니다.");
			service();
		}else{
			try {
				userTotalPrice = transMapper.selectUserAmountPrice(AfterLoginUI.id);
				if(userTotalPrice < price){
					System.out.println("보유액보다 많은 금액을 이체할 수 없습니다.");
					service();
				}else{
					transMapper.updateWithdrawal(t);
					transMapper.updateDeposit(t);
					transMapper.insertWithdrawal(t);
					System.out.println("이체가 완료 되엇습니다.");
					userTotalPrice = userTotalPrice-price;
					System.out.println("보유액 : " + userTotalPrice);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
