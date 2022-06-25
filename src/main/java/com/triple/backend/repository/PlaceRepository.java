package com.triple.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triple.backend.domain.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, String>{
	
	public Place findByPlaceId(String placeId);

}
