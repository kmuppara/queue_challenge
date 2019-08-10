package com.dbs.hacktron.queuechallenge.controller;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueueController implements BaseController{
	
	private Logger logger = Logger.getLogger("QueueController");

	@Override
	@PostMapping("/queue/{qName}")
	public ResponseEntity<?> add(@PathVariable("qName") String qName) {
		logger.info("In QueueController add method() ");
		
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
	
	@Override
	@DeleteMapping("/queue/{qName}")
	public ResponseEntity<?> remove() {
		logger.info("In QueueController remove method() ");
		
		return new ResponseEntity<String>("", HttpStatus.OK);
	}

	@Override
	@GetMapping("/queues/")
	public ResponseEntity<?> browse() {
		logger.info("In QueueController browse method() ");
		
		return new ResponseEntity<String>("", HttpStatus.OK);
	}

}
