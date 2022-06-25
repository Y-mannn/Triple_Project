package com.triple.backend.controller;

import lombok.Getter;

@Getter
public enum EventType {
	REVIEW_ADD("REVIEW", "ADD"),
	REVIEW_MOD("REVIEW", "MOD"),
	REVIEW_DELETE("REVIEW", "DELETE");
	
	private String type;
	private String action;
	
	EventType(String type, String action) {
		this.type = type;
		this.action = action;
	}
	
}
