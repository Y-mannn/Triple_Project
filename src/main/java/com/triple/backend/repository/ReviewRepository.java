package com.triple.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triple.backend.domain.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, String>{

}
