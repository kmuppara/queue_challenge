package com.dbs.hacktron.queuechallenge.component;

import java.util.ArrayList;
import java.util.List;

import com.dbs.hacktron.queuechallenge.vo.Queue;

public interface BaseService {
	
	List<Queue> queues = new ArrayList<>();

	public String add(String qName,int maxSize);
	public void remove(String qName);
	public List<Queue> browse();
}
