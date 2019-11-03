package com.company.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.ExchangeValue;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/from")
@Slf4j
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;

	@GetMapping(value = "{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable(required = true, name = "from") String from,
			@PathVariable(required = true, name = "to") String to) {
		log.info("Inside Currency Exchange Controller. Convert Currency from :'{}' to : '{}'", from, to);
		return new ExchangeValue(1L, to, from, BigDecimal.valueOf(70),
				Integer.parseInt(environment.getProperty("local.server.port")));
	}

}
