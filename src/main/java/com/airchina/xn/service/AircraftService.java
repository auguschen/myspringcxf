package com.airchina.xn.service;

import java.util.List;

import com.airchina.xn.model.Aircraft;

public interface AircraftService {

	public List<Aircraft> getAllAircraft();
	
	public Aircraft getAircraftByRegNo(String regno);

	public List<Aircraft> getAircraftByType(String typecatalog, String typeafaircraft);

	public Boolean newAircraft(Aircraft ac);

	public Aircraft newAircraftRetAircraft(Aircraft ac);
	
}
