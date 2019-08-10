package com.dbs.hacktron.queuechallenge.controller;

import org.springframework.http.ResponseEntity;

import com.dbs.hacktron.queuechallenge.vo.Queue;

public interface BaseController {

	public ResponseEntity<?> add(Queue queue);
	public ResponseEntity<?> remove();
	public ResponseEntity<?> browse();
	
	
}
