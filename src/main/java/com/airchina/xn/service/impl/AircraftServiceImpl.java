package com.airchina.xn.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airchina.xn.dao.AircraftMapper;
import com.airchina.xn.model.Aircraft;
import com.airchina.xn.service.AircraftService;


@Service("aircraftService")
public class AircraftServiceImpl implements AircraftService {

	@Autowired
	private AircraftMapper aircraftmapper;
	
	public AircraftMapper getAircraftmapper() {
		return aircraftmapper;
	}

	public void setAircraftmapper(AircraftMapper aircraftmapper) {
		this.aircraftmapper = aircraftmapper;
	}

	@Override
	public List<Aircraft> getAllAircraft() {
		return aircraftmapper.selectAll();
	}

}
