package com.dbs.hacktron.queuechallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class QueueManagerMain extends SpringBootServletInitializer{
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(QueueManagerMain.class);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(QueueManagerMain.class, args);
	}

}
