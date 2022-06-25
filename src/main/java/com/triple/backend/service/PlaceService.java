package com.triple.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triple.backend.domain.Place;
import com.triple.backend.repository.PlaceRepository;

@Service
public class PlaceService {
	
	@Autowired
	PlaceRepository placeRepository;
	
	public Place findByPlaceId(String placeId) {
		return placeRepository.findByPlaceId(placeId);
	}

}
