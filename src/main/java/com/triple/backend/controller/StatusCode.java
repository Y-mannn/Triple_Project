package com.triple.backend.controller;

import lombok.Getter;

@Getter
public enum StatusCode {
	OK(200, "OK"),
	BAD_REQUEST(400, "BAD_REQUEST"),
    NOT_FOUND(404, "NOT_FOUND");
	
	private int status;
	private String code;
	
	StatusCode(int status, String code) {
		this.status = status;
		this.code = code;
	}

}
