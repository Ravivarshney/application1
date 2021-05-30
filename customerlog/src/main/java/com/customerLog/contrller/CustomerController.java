package com.customerLog.contrller;

import java.io.Console;
import java.util.List;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.customerLog.Exception.CustomerLogException;
import com.customerLog.entity.LogModel;
import com.customerLog.service.CustomerLogService;

@CrossOrigin("*")
@RestController
public class CustomerController {
	
	@Autowired
	CustomerLogService customerLogService;
	
	@GetMapping(value = "/getAllLog")
	public List<LogModel> getAllLog() throws CustomerLogException {
		return customerLogService.getAllLog();
	}
	

	@GetMapping("/checkIn")
	@ResponseBody
	public LogModel getCheckIn(@RequestParam String name) throws CustomerLogException {
		System.out.println("controller");
	    return customerLogService.getCheckIn(name);
	}

	@GetMapping("/checkOut")
	@ResponseBody
	public LogModel getCheckOut(@RequestParam String name) throws CustomerLogException {
	    return customerLogService.getCheckOut(name);
	}
	
	@GetMapping("/getLog")
	@ResponseBody
	public List<LogModel> getLogByDate(@RequestParam String date) throws CustomerLogException {
	    return customerLogService.getLogByDate(date);
	}

}
