package com.airchina.xn.rest.webservice.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
	@Path("/ac/get/{Type_Catalog},{Type_Of_Aircraft}")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Aircraft> getAircraftByType(@PathParam("Type_Catalog") String typecatalog, @PathParam("Type_Of_Aircraft") String typeafaircraft) {
		List<Aircraft> acList = aircraftservice.getAircraftByType(typecatalog, typeafaircraft);
		return acList!=null?acList:new ArrayList<Aircraft>();
	}

	@Override
	@GET
	@Path("/ac/get")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Aircraft> getAllAircraft() {
		return aircraftservice.getAllAircraft();
	}

	@Override
	@POST
	@Path("/ac/new")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Aircraft newAircraft(Aircraft ac) {
		return aircraftservice.newAircraft(ac);
	}

	@Override
	@PUT
	@Path("/ac/update")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Aircraft updateAircraft(Aircraft ac) {
		return aircraftservice.updateAircraft(ac);
	}

	@Override
	@DELETE
	@Path("/ac/delete")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Boolean deleteAircraft(Aircraft ac) {
		return aircraftservice.deleteAircraft(ac);
	}

	@Override
	@POST
	@Path("/logs/new")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Boolean newLog(Logs l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public List<Logs> getLogs(Logs l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@POST
	@Path("/param/new")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Parameters newParameter(Parameters p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PUT
	@Path("/param/update")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Parameters updateParameter(Parameters p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@DELETE
	@Path("/param/delete")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Boolean deleteParameter(Parameters p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GET
	@Path("/param/get")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Parameters> getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GET
	@Path("/param/get/{parametertype}")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Parameters> getParametersByType(@PathParam("parametertype") String parameterType) {
		return null;
	}

	@Override
	@GET
	@Path("/param/get/{parametername}")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Parameters> getParametersByName(@PathParam("parametername") String parameterName) {
		// TODO Auto-generated method stub
		return null;
	}

}
