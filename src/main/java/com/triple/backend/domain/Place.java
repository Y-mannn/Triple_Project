package com.triple.backend.domain;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Place {
	
	@OneToMany(mappedBy = "place")
	private List<Review> reviews;
	
	@Id
	private UUID placeId;

}
