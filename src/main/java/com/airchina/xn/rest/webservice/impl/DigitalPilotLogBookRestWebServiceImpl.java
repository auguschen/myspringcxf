package com.airchina.xn.rest.webservice.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.airchina.xn.model.Flightcheck;
import com.airchina.xn.model.Flighttraining;
import com.airchina.xn.model.Licensesratingsrecord;
import com.airchina.xn.model.Pilot;
import com.airchina.xn.model.Routineflight;
import com.airchina.xn.model.Simulatortraining;
import com.airchina.xn.model.Summaryoflogbooks;
import com.airchina.xn.rest.webservice.DigitalPilotLogBookRestWebService;

@Service("DigitalPilotLogBookRestWebService")
public class DigitalPilotLogBookRestWebServiceImpl implements DigitalPilotLogBookRestWebService {

	@Override
	public List<Pilot> pilotsbyname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pilot pilotbyid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pilot> pilotsbylicenseno(String licenseNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newpilot(Pilot p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updatepilot(Pilot p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deletepilot(Pilot p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Routineflight> routineFlightbyPilotid(Pilot p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newRoutineflight(Pilot p, List<Routineflight> routineflgihtList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateRoutineflight(Pilot p, List<Routineflight> routineflgihtList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteRoutineflight(Pilot p, List<Routineflight> routineflgihtList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flighttraining> flightTrainingbyPilotid(Pilot p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newFlightraining(Pilot p, List<Flighttraining> flighttrainingList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateFlightraining(Pilot p, List<Flighttraining> flighttrainingList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteFlightraining(Pilot p, List<Flighttraining> flighttrainingList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flightcheck> flightCheckbyPilotid(Pilot p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newFlightcheck(Pilot p, List<Flightcheck> flightcheckList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateFlightcheck(Pilot p, List<Flightcheck> flightcheckList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteFlightcheck(Pilot p, List<Flightcheck> flightcheckList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Simulatortraining> simulatorTrainingbyPilotid(Pilot p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newSimulatortraining(Pilot p, List<Simulatortraining> simulatortrainingList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateSimulatortraining(Pilot p, List<Simulatortraining> simulatortrainingList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteSimulatortraining(Pilot p, List<Simulatortraining> simulatortrainingList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Licensesratingsrecord> pilotlicenseratingsrecordbypilot(Pilot p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newpilotlicenseratingsrecord(Pilot p, List<Licensesratingsrecord> licenseratingsrecordList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updatepilotlicenseratingsrecord(Pilot p, List<Licensesratingsrecord> licenseratingsrecordList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deletepilotlicenseratingsrecord(Pilot p, List<Licensesratingsrecord> licenseratingsrecordList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Summaryoflogbooks> summaryoflogbooksbypilot(Pilot p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean newsummaryoflogbooks(Pilot p, List<Summaryoflogbooks> summaryoflogbooksList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updatesummaryoflogbooks(Pilot p, List<Summaryoflogbooks> summaryoflogbooksList) {
		// TODO Auto-generated method stub
		return null;
	}

}
