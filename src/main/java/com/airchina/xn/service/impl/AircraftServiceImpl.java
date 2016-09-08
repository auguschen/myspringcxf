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

	@Override
	public Aircraft getAircraftByRegNo(String regno) {		
		return aircraftmapper.selectByRegNo(regno);
	}

	@Override
	public List<Aircraft> getAircraftByType(String typecatalog, String typeafaircraft) {
		System.out.println("service-----------------------------------");
		System.out.println(typecatalog);
		System.out.println(typeafaircraft);
		System.out.println("-----------------------------------");

		return aircraftmapper.selectByType(typecatalog, typeafaircraft);
	}

	@Override
	public Boolean newAircraft(Aircraft ac) {
		Integer r_id = aircraftmapper.insertWithoutID(ac);
		System.out.println("service-----------------------------------");
		System.out.println(r_id);
		System.out.println("-----------------------------------");
		return r_id>0?true:false;
	}

	@Override
	public Aircraft newAircraftRetAircraft(Aircraft ac) {
		Integer r_id = aircraftmapper.insertWithoutID(ac);
		if (r_id > 0) { 
			// get saved Aircraft object, then return to upstream.
		}
		return null;
	}

}
