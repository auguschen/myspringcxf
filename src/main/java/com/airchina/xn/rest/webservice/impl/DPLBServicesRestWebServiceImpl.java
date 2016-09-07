package com.airchina.xn.rest.webservice.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.airchina.xn.model.Aircraft;
import com.airchina.xn.model.Logs;
import com.airchina.xn.model.Parameters;
import com.airchina.xn.rest.webservice.DPLBServicesRestWebService;

@Service("dplbServicesRestWebService")
public class DPLBServicesRestWebServiceImpl implements DPLBServicesRestWebService {

	@Override
	public Aircraft getAircraftByRegNo(String regno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aircraft> getAircraftByType(String typecatalog, String typeafaircraft) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newAircraft(Aircraft ac) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateAircraft(Aircraft ac) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteAircraft(Aircraft ac) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newLog(Logs l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Logs> getLogs(Logs l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newParameter(Parameters p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateParameter(Parameters p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteParameter(Parameters p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Parameters> getParameters(Parameters p) {
		// TODO Auto-generated method stub
		return null;
	}

}
