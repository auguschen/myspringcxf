package com.airchina.xn.service;

import java.util.List;

import com.airchina.xn.model.Logs;

public interface LogService {

	public Boolean newLog(Logs l);
	
	public List<Logs> getLogs(String objectType, Integer objectId, String operation, Integer operatorId);
	
	public List<Logs> getAllLogs();
	
}
