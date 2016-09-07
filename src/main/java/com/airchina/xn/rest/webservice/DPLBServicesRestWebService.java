package com.airchina.xn.rest.webservice;

import java.util.List;

import com.airchina.xn.model.Aircraft;
import com.airchina.xn.model.Logs;
import com.airchina.xn.model.Parameters;

public interface DPLBServicesRestWebService {

//	根据飞机注册号查询航空器
	public Aircraft getAircraftByRegNo(String regno);
//	根据飞机型别机型查询航空器
	public List<Aircraft> getAircraftByType(String typecatalog, String typeafaircraft);
//	新增一个航空器
	public Boolean newAircraft(Aircraft ac);
//	更新一个航空器
	public Boolean updateAircraft(Aircraft ac);
//	删除一个航空器
	public Boolean deleteAircraft(Aircraft ac);
	
//	新增一条日志记录
	public Boolean newLog(Logs l);
//	查询日志记录
	public List<Logs> getLogs(Logs l);
	
	
//	新增一条参数信息
	public Boolean newParameter(Parameters p);
//	修改一条参数信息
	public Boolean updateParameter(Parameters p);
//	删除一条参数信息
	public Boolean deleteParameter(Parameters p);
//	获取参数信息
	public List<Parameters> getParameters(Parameters p);
	
}