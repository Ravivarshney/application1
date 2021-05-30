package com.customerLog.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.customerLog.Exception.CustomerLogException;
import com.customerLog.entity.LogModel;
import com.customerLog.service.CustomerLogService;


@Repository
@Transactional
public class CustomerLogDaoImpl implements CustomerLogDao {

	
		
		@PersistenceContext
		EntityManager entityManager;
		
		
		@Override
		public List<LogModel> getAllLog() {
			TypedQuery<LogModel> query = entityManager.createQuery("FROM LogModel", LogModel.class);
			List<LogModel> LogModelList = query.getResultList();
			return LogModelList;
		}

		@Override
		public LogModel getCheckIn(String name) throws CustomerLogException {
			String logType = "IN";
			LogModel LogModelList;
			try{
			TypedQuery<LogModel> query = entityManager.createQuery("FROM LogModel where name = :name AND logType = :logType", LogModel.class);
			
			query.setParameter("name", name);
			query.setParameter("logType", logType);
			 LogModelList = query.getSingleResult();
			 	
			}
			catch (Exception e) {
				throw new CustomerLogException("No records found!!!");
			}
			
			
			return LogModelList;
		}


		@Override
		public LogModel getCheckOut(String name) throws CustomerLogException {
			String logType = "OUT";
		LogModel LogModelList;
		try{
		TypedQuery<LogModel> query = entityManager.createQuery("FROM LogModel where name = :name AND logType = :logType", LogModel.class);
		
		query.setParameter("name", name);
		query.setParameter("logType", logType);
		 LogModelList = query.getSingleResult();
		 	
		}
		catch (Exception e) {
			throw new CustomerLogException("No records found!!!");
		}
		
		
		return LogModelList;
		}


		@Override
		public List<LogModel> getLogByDate(String date) throws CustomerLogException {
			List<LogModel> LogModelList;
			try{
				TypedQuery<LogModel> query = entityManager.createQuery("FROM LogModel where date = :date", LogModel.class);
				
				query.setParameter("date", date);
				 LogModelList = query.getResultList();
				 
				}
				catch (Exception e) {
					throw new CustomerLogException("No records found!!!");
				}
				
				
				return LogModelList;
		}

}
