package com.dbs.hacktron.queuechallenge.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.hacktron.queuechallenge.component.MessageService;
import com.dbs.hacktron.queuechallenge.component.QueueService;
import com.dbs.hacktron.queuechallenge.vo.Queue;

@RestController
@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
public class QueueController implements BaseController{
	
	private Logger logger = Logger.getLogger("QueueController");
	
	@Autowired
	QueueService queueService;
	
	@Autowired
	MessageService messageService;

	@Override
	@PostMapping("/queue/")
	public ResponseEntity<?> add(@RequestBody Queue queue) {
		logger.info("In QueueController add method() ");
		String resp = queueService.add(queue.getQueueName(), queue.getMaxSize());
		return new ResponseEntity<String>(resp, HttpStatus.OK);
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
		List<Queue> queues = queueService.browse();
		return new ResponseEntity<List<Queue>>(queues, HttpStatus.OK);
	}

}
