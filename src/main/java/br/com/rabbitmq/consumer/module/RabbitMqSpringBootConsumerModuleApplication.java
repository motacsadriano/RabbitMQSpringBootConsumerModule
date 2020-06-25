package br.com.rabbitmq.consumer.module;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitMqSpringBootConsumerModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqSpringBootConsumerModuleApplication.class, args);
	}
	
	@Bean
	public Jackson2JsonMessageConverter converter() {
		return new Jackson2JsonMessageConverter();
	}

}
