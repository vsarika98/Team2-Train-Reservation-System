package com.capgemini.ttrms.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.ttrms.model.Station;



@Repository
public interface StationRepository extends JpaRepository<Station, Integer>{
	public List<Station> findByStationName(String tName);


}
