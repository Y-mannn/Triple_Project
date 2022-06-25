package com.triple.backend.controller;

import lombok.Data;

@Data
public class DataResponse {
	// 상태 코드
	private int Status;
	// 메세지
	private String code;
	// 데이터
	private Object data;

}
