package br.com.rabbitmq.consumer.module.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import br.com.rabbitmq.consumer.module.exception.InvalidSalaryException;
import br.com.rabbitmq.consumer.module.model.Employee;

@Service
public class RabbitMQConsumer {

	private static final Logger logger = LoggerFactory.getLogger(RabbitMQConsumer.class);

	@RabbitListener(queues = "poc.queue")
	public void recievedMessage(Employee employee) throws InvalidSalaryException {
		logger.info("Recieved Message From RabbitMQ: " + employee);
		
		if (employee.getSalary() < 0) {
			throw new InvalidSalaryException();
		}
	}
}
