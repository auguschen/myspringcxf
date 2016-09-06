/**
 * 
 */
package com.airchina.xn.rest.webservice;

import java.util.List;

import com.airchina.xn.model.Flightcheck;
import com.airchina.xn.model.Flighttraining;
import com.airchina.xn.model.Licensesratingsrecord;
import com.airchina.xn.model.Pilot;
import com.airchina.xn.model.Routineflight;
import com.airchina.xn.model.Simulatortraining;
import com.airchina.xn.model.Summaryoflogbooks;

/**
 * @author augus
 *
 */
public interface DigitalPilotLogBookRestWebService {
	/**
	 * 
	 * 飞行员
	 */
//	根据姓名返回飞行员列表
	public List<Pilot> pilotsbyname(String name);
//	根据主键返回飞行员
	public Pilot pilotbyid(Integer id);
//	根据执照号返回飞行员列表
	public List<Pilot> pilotsbylicenseno(String licenseNo);
//	新增一个飞行员信息
	public Boolean newpilot(Pilot p);
//	更新一个飞行员信息
	public Boolean updatepilot(Pilot p);
//	删除一个飞行员信息
	public Boolean deletepilot(Pilot p);
	
	/**
	 * 
	 * 日常飞行
	 * 
	 */
//	取得一个飞行员的日常飞行信息列表
	public List<Routineflight> routineFlightbyPilotid(Pilot p);	
//	新增一个飞行员的日常飞行信息
	public Boolean newRoutineflight(Pilot p, List<Routineflight> routineflgihtList);
//	更新一个飞行员的日常飞行信息
	public Boolean updateRoutineflight(Pilot p, List<Routineflight> routineflgihtList);
//	删除一个飞行员的日常飞行信息
	public Boolean deleteRoutineflight(Pilot p, List<Routineflight> routineflgihtList);
	
	/**
	 * 
	 * 飞行训练
	 * 
	 */	
//	取得一个飞行员的飞行训练信息列表
	public List<Flighttraining> flightTrainingbyPilotid(Pilot p);	
//	新增一个飞行员的飞行训练信息
	public Boolean newFlightraining(Pilot p, List<Flighttraining> flighttrainingList);
//	修改一个飞行员的飞行训练信息
	public Boolean updateFlightraining(Pilot p, List<Flighttraining> flighttrainingList);
//	删除一个飞行员的飞行训练信息
	public Boolean deleteFlightraining(Pilot p, List<Flighttraining> flighttrainingList);
	
	/**
	 * 
	 * 飞行检查
	 * 
	 */	
//	取得一个飞行员的飞行检查信息列表
	public List<Flightcheck> flightCheckbyPilotid(Pilot p);
//	新增一个飞行员的飞行检查信息
	public Boolean newFlightcheck(Pilot p, List<Flightcheck> flightcheckList);
//	修改一个飞行员的飞行检查信息
	public Boolean updateFlightcheck(Pilot p, List<Flightcheck> flightcheckList);
//	删除一个飞行员的飞行检查信息
	public Boolean deleteFlightcheck(Pilot p, List<Flightcheck> flightcheckList);
	
	/**
	 * 
	 * 模拟机训练
	 * 
	 */	
//	取得一个飞行员的模拟机训练信息列表
	public List<Simulatortraining> simulatorTrainingbyPilotid(Pilot p);
//	新增一个飞行员的模拟机训练信息
	public Boolean newSimulatortraining(Pilot p, List<Simulatortraining> simulatortrainingList);
//	修改一个飞行员的模拟机训练信息
	public Boolean updateSimulatortraining(Pilot p, List<Simulatortraining> simulatortrainingList);
//	删除一个飞行员的模拟机训练信息
	public Boolean deleteSimulatortraining(Pilot p, List<Simulatortraining> simulatortrainingList);
	
	
	/**
	 * 
	 * 执照等级记录
	 * 
	 */	
//	查询一个飞行员的执照等级记录信息
	public List<Licensesratingsrecord> pilotlicenseratingsrecordbypilot(Pilot p);
//	新增一个飞行员的执照等级记录信息
	public Boolean newpilotlicenseratingsrecord(Pilot p, List<Licensesratingsrecord> licenseratingsrecordList);
//	更新一个飞行员的执照等级记录信息
	public Boolean updatepilotlicenseratingsrecord(Pilot p, List<Licensesratingsrecord> licenseratingsrecordList);
//	删除一个飞行员的执照等级记录信息
	public Boolean deletepilotlicenseratingsrecord(Pilot p, List<Licensesratingsrecord> licenseratingsrecordList);
	
	/**
	 * 
	 * 飞行经历累计
	 * 
	 */	
	
//	查询一个飞行员的经验累计
	public List<Summaryoflogbooks> summaryoflogbooksbypilot(Pilot p);
//	新增一个飞行员的经验累计
	public Boolean newsummaryoflogbooks(Pilot p, List<Summaryoflogbooks> summaryoflogbooksList);
//	更新一个飞行员的经验累计
	public Boolean updatesummaryoflogbooks(Pilot p, List<Summaryoflogbooks> summaryoflogbooksList);

}
