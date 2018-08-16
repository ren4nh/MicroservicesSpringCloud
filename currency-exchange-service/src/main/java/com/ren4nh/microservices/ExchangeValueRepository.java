package com.ren4nh.microservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ren4nh.microservices.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	ExchangeValue findByFromAndTo(String from, String to);
}
