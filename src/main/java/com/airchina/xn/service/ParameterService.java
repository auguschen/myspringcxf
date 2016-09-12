package com.airchina.xn.service;

import java.util.List;

import com.airchina.xn.model.Parameters;

public interface ParameterService {

	public List<Parameters> getAllParameters();
	
	public List<Parameters> getParametersByType(String parameterType);
	
	public List<Parameters> getAllParametersByName(String parameterName);
	
	public Parameters newParameter(Parameters p);

	public Parameters updateParameter(Parameters p);
	
	public Parameters deleteParameter(Parameters p);
	
}
