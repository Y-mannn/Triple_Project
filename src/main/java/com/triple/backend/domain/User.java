package com.triple.backend.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
	
	@OneToMany(mappedBy = "user")
	private List<Review> reviews;
	
	@Id
	private String userId;
	
	@NotNull
	private int point = 0;
	

}
