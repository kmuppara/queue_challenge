package com.dbs.hacktron.queuechallenge.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dbs.hacktron.queuechallenge.vo.Queue;

@Service
public class QueueService implements BaseService {

	List<Queue> queues = new ArrayList<>();

	@Override
	public String add(String qName, int maxSize) {
		if (!isExists(qName)) {
			Queue queue = new Queue(qName, maxSize);
			queues.add(queue);
			return "Success";
		} else
			return "Failure";

	}

	@Override
	public void remove(String qName) {
		

	}

	@Override
	public List<Queue> browse() {
		return queues;

	}

	private boolean isExists(String qName) {
		
		for (Queue q : queues) {
			if (q.getQueueName()!=null && q.getQueueName().equalsIgnoreCase(qName)) {
				return true;
			}
		}
		return false;
	}

}
