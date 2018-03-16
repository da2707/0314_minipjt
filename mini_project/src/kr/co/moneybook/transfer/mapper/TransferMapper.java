package kr.co.moneybook.transfer.mapper;

import java.util.List;

import kr.co.moneybook.transfer.domain.Transfer;

public interface TransferMapper {
	
	public void insertWithdrawal(Transfer transfer);
	public int updateWithdrawal(Transfer transfer);
	public int updateDeposit(Transfer transfer);
	public int selectUserAmountPrice(String id);
	public String selectFindUserId(String id);
	public List<Transfer> selectInquiry(String id);
}
