package com.triple.backend.controller;

import lombok.Data;

@Data
public class DataResponse {
	// ���� �ڵ�
	private int Status;
	// �޼���
	private String code;
	// ������
	private Object data;

}
