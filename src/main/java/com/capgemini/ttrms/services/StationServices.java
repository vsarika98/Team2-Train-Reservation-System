package com.capgemini.ttrms.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.ttrms.model.Station;
import com.capgemini.ttrms.repository.StationRepository;
@Service
public class StationServices {
	@Autowired
	private StationRepository stationRepository;
	
	public Station createStation(Station station) {
		return stationRepository.save(station);	
	}
	
	public Station updateStation(Station station) {
		// TODO Auto-generated method stub
		return stationRepository.save(station);
	}

	public java.util.List<Station> getAllStation() {
		// TODO Auto-generated method stub
		return stationRepository.findAll();
	}

	public List getStationDetailsByStationName(String stationName) {
		// TODO Auto-generated method stub
		return stationRepository.findByStationName(stationName);
	}


//	public Optional<Station> getStationDetailsByTrainName(String trainName) {
//		// TODO Auto-generated method stub
//		return stationRepository.findByTrainName(trainName);
//	}

	
}
