package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private static Logger logger = LoggerFactory.getLogger(TestController.class);

	@GetMapping(value = "/api/v1/test/{type}/{count}")
	public String getMethodName(@PathVariable("type") String type, @PathVariable("count") int count) {

		switch (type) {
		case "debug":
			logger.debug("Test :{} debug log printed",count);
			break;
		case "info":
			logger.info("Test :{} info log printed",count);

			break;
		case "warn":
			logger.warn("Test :{} warn log printed",count);

			break;
		case "error":
			logger.error("Test :{} error log printed",count);

			break;
		}
		return "your Test :"+count+" passed for Log - "+type;

	}

}
