package com.customerLog.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.customerLog.Exception.CustomerLogException;
import com.customerLog.entity.LogModel;

public interface CustomerLogService {

	public List<LogModel> getAllLog()throws CustomerLogException;
	
	public LogModel getCheckIn( String name)throws CustomerLogException;
	
	public LogModel getCheckOut( String name) throws CustomerLogException;
	
	public List<LogModel> getLogByDate( String date) throws CustomerLogException;
	
}
