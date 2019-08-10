package com.dbs.hacktron.queuechallenge.controller;

import org.springframework.http.ResponseEntity;

public interface BaseController {

	public ResponseEntity<?> add(String qName);
	public ResponseEntity<?> remove();
	public ResponseEntity<?> browse();
	
	
}
