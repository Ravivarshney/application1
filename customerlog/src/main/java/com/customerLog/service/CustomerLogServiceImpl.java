package com.customerLog.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customerLog.Exception.CustomerLogException;
import com.customerLog.dao.CustomerLogDao;
import com.customerLog.entity.LogModel;


@Service
public class CustomerLogServiceImpl implements CustomerLogService{

	
@Autowired
CustomerLogDao customerLogDao;
	
	
	@Override
	public List<LogModel> getAllLog()throws CustomerLogException {
			return customerLogDao.getAllLog();
	}


	@Override
	public LogModel getCheckIn(String name)throws CustomerLogException {
		// TODO Auto-generated method stub
		System.out.println("CheckIn");

		return customerLogDao.getCheckIn(name);
	}


	@Override
	public LogModel getCheckOut(String name) throws CustomerLogException{
		// TODO Auto-generated method stub
		return customerLogDao.getCheckOut(name);
	}


	@Override
	public List<LogModel> getLogByDate(String date) throws CustomerLogException{
		// TODO Auto-generated method stub
		return customerLogDao.getLogByDate(date);
	}

}
