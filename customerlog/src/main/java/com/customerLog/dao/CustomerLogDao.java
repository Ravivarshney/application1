package com.customerLog.dao;

import java.util.List;

import com.customerLog.Exception.CustomerLogException;
import com.customerLog.entity.LogModel;

public interface CustomerLogDao {

	public List<LogModel> getAllLog();

	public LogModel getCheckIn( String name)throws CustomerLogException;
	
	public LogModel getCheckOut( String name) throws CustomerLogException;
	
	public List<LogModel> getLogByDate( String date)throws CustomerLogException ;
}
