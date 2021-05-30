package com.customerLog.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="logmodel")
public class LogModel {

	
		
		@Column(name="logType")
		private String logType;

		@Column(name="date")
		private String date;
		
		@Column(name="time")
		private String time;
		
		@Column(name="name")
		private String name;
		
		@Id
		@GeneratedValue
		@Column(name="id")
		private String id;
		
		

		public String getId() {
			return name+time;
		}
		public String getLogType() {
			return logType;
		}

		public void setId(String id) {
			this.id = id;
		}

//		public String getName() {
//			return name;
//		}

		public void setName(String name) {
			this.name = name;
		}

		

		public void setLogType(String logType) {
			this.logType = logType;
		}

		public String getDate() {
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
			   LocalDateTime now = LocalDateTime.now();  
			   System.out.println();  
			LocalTime time = LocalTime.now();
			
		 	setDate(dtf.format(now));
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getTime() {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
			   LocalDateTime now = LocalDateTime.now();  
			   String time = dtf.format(now);  
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public LogModel( String name, String logType, String date, String time) {
			super();
			
			this.name = name;
			this.logType = logType;
			this.date = date;
			this.time = time;
		}
		public LogModel()
		{}
		
}
