package com.example.springboot.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class QueueRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		from("direct:queueRoute")
			.log(">>Queue Route body: ${body}")
			//\.unmarshal().json(JsonLibrary.Jackson, Person.class)
			.to("jms:queue:activemq/queue/TestQueue");
	}
	
}
