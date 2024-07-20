package com.xzymon.springtestbed.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DateServiceImpl implements DateService {
	private static final Logger LOGGER = LoggerFactory.getLogger(DateServiceImpl.class);

	@Override
	public String getCurrentAsString() {
		LOGGER.info("getCurrentAsString");
		String pattern = "yyyy-MM-dd^HH:mm:ss.SSS";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.format(new Date());
	}
}
