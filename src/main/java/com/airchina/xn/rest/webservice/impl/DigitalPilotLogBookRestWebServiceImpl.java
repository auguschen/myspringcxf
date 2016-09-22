package com.airchina.xn.rest.webservice.impl;

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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airchina.xn.entities.LicensesRatingResp;
import com.airchina.xn.model.Flightcheck;
import com.airchina.xn.model.Flighttraining;
import com.airchina.xn.model.Licensesratingsrecord;
import com.airchina.xn.model.Pilot;
import com.airchina.xn.model.Routineflight;
import com.airchina.xn.model.Simulatortraining;
import com.airchina.xn.model.Summaryoflogbooks;
import com.airchina.xn.rest.webservice.DigitalPilotLogBookRestWebService;
import com.airchina.xn.service.LicensesRatingService;
import com.airchina.xn.service.PilotService;

@Service("DigitalPilotLogBookRestWebService")
@Path("/")
public class DigitalPilotLogBookRestWebServiceImpl implements DigitalPilotLogBookRestWebService {

	@Autowired
	private PilotService pilotservice;
	
	@Autowired
	private LicensesRatingService licensesratingservice;
		
	public LicensesRatingService getLicensesratingservice() {
		return licensesratingservice;
	}

	public void setLicensesratingservice(LicensesRatingService licensesratingservice) {
		this.licensesratingservice = licensesratingservice;
	}

	public PilotService getPilotservice() {
		return pilotservice;
	}

	public void setPilotservice(PilotService pilotservice) {
		this.pilotservice = pilotservice;
	}

	//	飞行员基础信息
	@Override
	@GET
	@Path("/p/get/n={name}")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Pilot> pilotsbyname(@PathParam("name") String name) {
		return pilotservice.getPilotsByName(name);
	}

	@Override
	@GET
	@Path("/p/get")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Pilot> pilots() {
		return pilotservice.getPilots();
	}

	@Override
	@GET
	@Path("/p/get/i={id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Pilot pilotbyid(@PathParam("id") Integer id) {
		return pilotservice.getPilotById(id);
	}

	@Override
	@GET
	@Path("/p/get/s={staffNumber}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Pilot pilotbystaffnumber(@PathParam("staffNumber") String staffNumber) {
		return pilotservice.getPilotsByStaffNumber(staffNumber);
	}

	@Override
	@GET
	@Path("/p/get/l={licenseNo}")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Pilot> pilotsbylicenseno(@PathParam("licenseNo") String licenseNo) {
		return pilotservice.getPilotsByLicenseNo(licenseNo);
	}

	@Override
	@POST
	@Path("/p/new")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Pilot newpilot(Pilot p) {
		return pilotservice.newPilot(p);
	}

	@Override
	@PUT
	@Path("/p/upd")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Pilot updatepilot(Pilot p) {
		return pilotservice.updatePilot(p);
	}

	@Override
	@DELETE
	@Path("/p/del")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Boolean deletepilot(Pilot p) {
		return pilotservice.deletePilot(p);
	}

	
//	执照等级记录
	@Override
	@GET
	@Path("/lr/get/{pilot_id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Licensesratingsrecord> pilotlicenseratingsrecordbypilot(@PathParam("pilot_id") Integer pilot_id) {
		return licensesratingservice.getLicensesRatingByPilotId(pilot_id);
	}

	@Override
	@POST
	@Path("/lr/new/{pilot_id}")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public LicensesRatingResp newpilotlicenseratingsrecord(@PathParam("pilot_id") Integer pilot_id, List<Licensesratingsrecord> licenseratingsrecordList) {
		return licensesratingservice.newLicensesRating(pilot_id, licenseratingsrecordList);
	}

	@Override
	@PUT
	@Path("/lr/upd/{pilot_id}")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public LicensesRatingResp updatepilotlicenseratingsrecord(@PathParam("pilot_id") Integer pilot_id, List<Licensesratingsrecord> licenseratingsrecordList) {
		return licensesratingservice.updateLicensesRating(pilot_id, licenseratingsrecordList);
	}

	@Override
	@DELETE
	@Path("/lr/del/{pilot_id}")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public LicensesRatingResp deletepilotlicenseratingsrecord(@PathParam("pilot_id") Integer pilot_id, List<Licensesratingsrecord> licenseratingsrecordList) {
		return licensesratingservice.deleteLicensesRating(pilot_id, licenseratingsrecordList);
	}

//	飞行累积信息
	@Override
	public List<Summaryoflogbooks> summaryoflogbooksbypilot(@PathParam("pilot_id") Integer pilot_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newsummaryoflogbooks(@PathParam("pilot_id") Integer pilot_id, List<Summaryoflogbooks> summaryoflogbooksList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updatesummaryoflogbooks(@PathParam("pilot_id") Integer pilot_id, List<Summaryoflogbooks> summaryoflogbooksList) {
		// TODO Auto-generated method stub
		return null;
	}

//	日常飞行
	@Override
	public List<Routineflight> routineFlightbyPilotid(@PathParam("pilot_id") Integer pilot_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newRoutineflight(@PathParam("pilot_id") Integer pilot_id, List<Routineflight> routineflgihtList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateRoutineflight(@PathParam("pilot_id") Integer pilot_id, List<Routineflight> routineflgihtList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteRoutineflight(@PathParam("pilot_id") Integer pilot_id, List<Routineflight> routineflgihtList) {
		// TODO Auto-generated method stub
		return null;
	}

//	飞行训练
	@Override
	public List<Flighttraining> flightTrainingbyPilotid(@PathParam("pilot_id") Integer pilot_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newFlightraining(@PathParam("pilot_id") Integer pilot_id, List<Flighttraining> flighttrainingList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateFlightraining(@PathParam("pilot_id") Integer pilot_id, List<Flighttraining> flighttrainingList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteFlightraining(@PathParam("pilot_id") Integer pilot_id, List<Flighttraining> flighttrainingList) {
		// TODO Auto-generated method stub
		return null;
	}

//	飞行检查
	@Override
	public List<Flightcheck> flightCheckbyPilotid(@PathParam("pilot_id") Integer pilot_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newFlightcheck(@PathParam("pilot_id") Integer pilot_id, List<Flightcheck> flightcheckList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateFlightcheck(@PathParam("pilot_id") Integer pilot_id, List<Flightcheck> flightcheckList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteFlightcheck(@PathParam("pilot_id") Integer pilot_id, List<Flightcheck> flightcheckList) {
		// TODO Auto-generated method stub
		return null;
	}

//	模拟机训练
	@Override
	public List<Simulatortraining> simulatorTrainingbyPilotid(@PathParam("pilot_id") Integer pilot_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newSimulatortraining(@PathParam("pilot_id") Integer pilot_id, List<Simulatortraining> simulatortrainingList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateSimulatortraining(@PathParam("pilot_id") Integer pilot_id, List<Simulatortraining> simulatortrainingList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteSimulatortraining(@PathParam("pilot_id") Integer pilot_id, List<Simulatortraining> simulatortrainingList) {
		// TODO Auto-generated method stub
		return null;
	}

}
