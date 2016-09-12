package com.airchina.xn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.airchina.xn.dao.ParametersMapper;
import com.airchina.xn.model.Parameters;
import com.airchina.xn.service.ParameterService;

public class ParameterServiceImpl implements ParameterService {

	@Autowired
	private ParametersMapper parametersmapper;
	
	public ParametersMapper getParametersmapper() {
		return parametersmapper;
	}

	public void setParametersmapper(ParametersMapper parametersmapper) {
		this.parametersmapper = parametersmapper;
	}

	@Override
	public List<Parameters> getAllParameters() {
		return parametersmapper.selectAll();
	}

	@Override
	public List<Parameters> getParametersByType(String parameterType) {
		return parametersmapper.selectByType(parameterType);
	}

	@Override
	public List<Parameters> getAllParametersByName(String parameterType) {
		return parametersmapper.selectByType(parameterType);
	}

	@Override
	public Parameters newParameter(Parameters p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parameters updateParameter(Parameters p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parameters deleteParameter(Parameters p) {
		// TODO Auto-generated method stub
		return null;
	}

}
