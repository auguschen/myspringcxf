package com.airchina.xn.rest.webservice.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airchina.xn.model.Aircraft;
import com.airchina.xn.model.Logs;
import com.airchina.xn.model.Parameters;
import com.airchina.xn.rest.webservice.DPLBServicesRestWebService;
import com.airchina.xn.service.AircraftService;

@Service("dplbServicesRestWebService")
@Path("/")
public class DPLBServicesRestWebServiceImpl implements DPLBServicesRestWebService {
	
	private static Logger log = Logger.getLogger(DPLBServicesRestWebServiceImpl.class);
	
	@Autowired
	private AircraftService aircraftservice;

	public AircraftService getAircraftservice() {
		return aircraftservice;
	}

	public void setAircraftservice(AircraftService aircraftservice) {
		this.aircraftservice = aircraftservice;
	}

	@Override
	@GET
	@Path("/ac/get/{regno}")
	@Produces({MediaType.APPLICATION_JSON})
	public Aircraft getAircraftByRegNo(@PathParam("regno") String regno) {
		Aircraft ac = aircraftservice.getAircraftByRegNo(regno);
		return ac!=null?ac:new Aircraft();
	}

	@Override
	@GET
	@Path("/ac/get/{tc},{ta}")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Aircraft> getAircraftByType(String typecatalog, String typeafaircraft) {
		List<Aircraft> acList = aircraftservice.getAircraftsByType(typecatalog, typeafaircraft);
		return acList!=null?acList:new ArrayList<Aircraft>();
	}

	@Override
	@POST
	@Path("/ac/new")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Boolean newAircraft(Aircraft ac) {
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
