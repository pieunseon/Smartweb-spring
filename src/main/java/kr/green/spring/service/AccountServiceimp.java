package kr.green.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  //ctrl+shift+o  
import kr.green.spring.dao.AccountDao;
import kr.green.spring.vo.AccountVo;

@Service

//service : 데이터를 처리함 (가공:정보를 바로 처리하는 것이 아니라 선택하거나 수정해서 처리함)
public class AccountServiceimp implements AccountService{
	/*Autowired는 객체생성을 자동으로 해준다.*/
	
	@Autowired
	private AccountDao accountDao;
	
	@Override
	public AccountVo getAccount(String id) {
		// TODO Auto-generated method stub
		return accountDao.getAccount(id);
	}

	@Override
	public boolean signup(AccountVo accountVo) {
		/* [아이디 중복 확인]
		1.accountDao를 이용해서 id정보가 주어지면 해당 id와 일치하는 객체정보를 가져온다
		2.가져온 객체정보가 null이면 accountDao.insertAccount(acccountVo)를 실행
		3.아니면 아무것도 처리하지 않음
		*/
		
	
		String id = accountVo.getId();   //id 정보를 가져옴
		AccountVo tmp =accountDao.getAccount(id);  //id 정보를 가져와서 확인함
		if(tmp == null) {
			accountDao.insertAccount(accountVo);
			return true;
		}else {
			return false;
		}
		
		/*
		accountVo.getId();
		getAccountDao(id);
		if (accountVo = null) {
			accountDao.insertAccount(acccountVo)
		}
		else {
			return false;
		}*/
		
	}
	
}
