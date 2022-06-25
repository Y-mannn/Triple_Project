package com.triple.backend.controller;

import java.nio.charset.Charset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.triple.backend.domain.Review;
import com.triple.backend.service.PlaceService;
import com.triple.backend.service.ReviewService;
import com.triple.backend.service.UserService;

@RestController
public class TripleController {
	
	@Autowired
	PlaceService placeService;
	
	@Autowired
	ReviewService reviewService;
	
	@Autowired
	UserService userService;
	
	@PostMapping("/events")
	public ResponseEntity<DataResponse> method1(@RequestBody Review review, String type, String action, String userId, String placeId) {
		DataResponse dataResponse = new DataResponse();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
		
		if(action == "ADD") {
			reviewService.createReview(review);
		} else if (action == "MOD"){
			reviewService.updateReview(review);
		} else if(action == "DELETE") {
			reviewService.deleteReview(review);
		} else {
			// 예외
		}
		
		dataResponse.setStatus(StatusCode.OK.getStatus());
		dataResponse.setCode(StatusCode.OK.getCode());
		
		return new ResponseEntity<DataResponse>(dataResponse, headers, HttpStatus.OK);
	}
}
