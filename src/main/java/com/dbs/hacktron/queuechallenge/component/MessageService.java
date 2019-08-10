package com.dbs.hacktron.queuechallenge.component;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dbs.hacktron.queuechallenge.vo.Message;
import com.dbs.hacktron.queuechallenge.vo.Queue;

@Component
public class MessageService implements BaseService{


	@Override
	public String add(String qName, int maxSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(String qName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Queue> browse() {
		// TODO Auto-generated method stub
		return null;
	}


	private Queue getQueue(String queueName) {
		Queue queue = (Queue)queues.stream().filter(x -> x.getQueueName().equals(queueName));
		return queue;
	}
	
	public String addMessage(String qName, String msgContent) {
	
		try {
			Queue que = getQueue(qName);
			Message msg = new Message();
			if(que.getMessages().size()< que.getMaxSize()) {
				msg.setContent(msgContent);
				que.getMessages().add(msg);
				return "Success";
			}else {
				return "MAX Queue Size has been achived, no more messages can be added";
			}
		}catch (Exception e) {
				System.out.println("Exception Occured while adding Message to queue" + e);
				return "failed";	
		}
		
	}
	
	public String remove(String qName, String msgContent) {
		try {
			Queue que = getQueue(qName);
			for(Message msg: que.getMessages()) {
				if(msg.getContent().equalsIgnoreCase(msgContent)) {
					que.getMessages().remove(msg);
					System.out.println("Message has been removed successfully");
					return "Success";
				}
				
			}
			System.out.println("No Matching message found");
		}	catch (Exception exception) {
			System.out.println("Exception occured while removing message");
		}
		
		return "Failed";
	}	
	
	public List<Message> browseMessages(String qName) {
		return getQueue(qName).getMessages();
	}
}
