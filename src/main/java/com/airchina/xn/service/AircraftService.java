package com.airchina.xn.service;

import java.util.List;

import com.airchina.xn.model.Aircraft;

public interface AircraftService {

	public List<Aircraft> getAllAircraft();
	
	public Aircraft getAircraftByRegNo(String regno);

	public List<Aircraft> getAircraftsByType(String typecatalog, String typeafaircraft);
	
}
