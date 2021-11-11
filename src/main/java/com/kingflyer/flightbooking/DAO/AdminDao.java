package com.kingflyer.flightbooking.dao;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

public interface AdminDao {

	void save(Admin location);

}
