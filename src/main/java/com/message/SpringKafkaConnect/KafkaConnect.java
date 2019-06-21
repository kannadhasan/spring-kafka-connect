package com.message.SpringKafkaConnect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@EnableAutoConfiguration
public class KafkaConnect {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	//EnabledAutoConfiguration for property
	@KafkaListener(topics = "${topic}")
	public void listen(String message) {
		System.out.println("Received Messasge in group - group-id: " + message);
	}

	public void run(ApplicationArguments args) throws Exception {
		sendMessage("Hi Welcome to Spring For Apache Kafka");
	}

	public void sendMessage(String msg) {
		//topic ,message
		kafkaTemplate.send("test", msg);
	}
}
