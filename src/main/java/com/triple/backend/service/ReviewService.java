package com.triple.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triple.backend.domain.Review;
import com.triple.backend.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	ReviewRepository reviewRepository;
	
	public void createReview(Review review) {
		if(review.getContent().length() >= 1) {
			review.getUser().setPoint(review.getUser().getPoint() + 1);
		}
		if(review.getAttachedPhotoIds().length >= 1) {
			review.getUser().setPoint(review.getUser().getPoint() + 1);
		}
		if(review.getPlace().getReviews().size() == 0) {
			review.getUser().setPoint(review.getUser().getPoint() + 1);
		}
		reviewRepository.save(review);
	}
	
	public void updateReview(Review review) {
		reviewRepository.save(review);
	}
	
	public void deleteReview(Review review) {
		reviewRepository.delete(review);
	}

}
