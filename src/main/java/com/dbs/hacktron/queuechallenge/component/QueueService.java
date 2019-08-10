package com.dbs.hacktron.queuechallenge.component;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dbs.hacktron.queuechallenge.vo.Queue;

@Service
public class QueueService implements BaseService {

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
	public String remove(String qName) {
		if (isExists(qName)) {
			for (Queue q : queues) {
				if (q.getQueueName() != null && q.getQueueName().equalsIgnoreCase(qName)) {
					queues.remove(q);
				}
			}
			return "Success";
		} else
			return "Failure";
	}

	@Override
	public List<Queue> browse() {
		return queues;

	}

	private boolean isExists(String qName) {

		for (Queue q : queues) {
			if (q.getQueueName() != null && q.getQueueName().equalsIgnoreCase(qName)) {
				return true;
			}
		}
		return false;

		/*
		 * Object obj =
		 * queues.stream().filter(p->p.getQueueName().equalsIgnoreCase(qName));
		 * return obj!=null ? true : false;
		 */
	}

}
