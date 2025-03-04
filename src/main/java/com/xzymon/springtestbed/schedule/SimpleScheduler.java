package com.xzymon.springtestbed.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SimpleScheduler {
	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleScheduler.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 5 * 1000)
	public void reportCurrentTime() {
		LOGGER.info("The time is now {}", dateFormat.format(new Date()));
	}
}
