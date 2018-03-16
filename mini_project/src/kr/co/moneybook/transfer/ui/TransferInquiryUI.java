/*
	송금별, 입금별 조회
*/
package kr.co.moneybook.transfer.ui;

import java.util.List;

import kr.co.moneybook.main.ui.AfterLoginUI;
import kr.co.moneybook.main.ui.BaseUI;
import kr.co.moneybook.transfer.domain.Transfer;
import kr.co.moneybook.transfer.mapper.TransferMapper;

public class TransferInquiryUI extends BaseUI{
	private TransferMapper transMapper;
	
	public TransferInquiryUI(TransferMapper transMapper) {
		this.transMapper = transMapper;
	}

	public void service() {
		System.out.println(AfterLoginUI.id + "님 송급/입금 내역");
		System.out.println("-----------------------------------");
		List<Transfer> list = transMapper.selectInquiry(AfterLoginUI.id);
		for(Transfer t : list){
			System.out.println(t.getTransferUserId()+"\t"+t.getTransferPrice()+"\t"+t.getAcceptUserId());
		}
		System.out.println("-----------------------------------");
		
	}

}