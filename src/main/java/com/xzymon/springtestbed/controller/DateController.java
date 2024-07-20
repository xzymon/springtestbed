package com.xzymon.springtestbed.controller;

import com.xzymon.springtestbed.dto.DateDTO;
import com.xzymon.springtestbed.service.DateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/date")
public class DateController {
	private final DateService dateService;

	public DateController(DateService dateService) {
		this.dateService = dateService;
	}

	@GetMapping
	public ResponseEntity<DateDTO> getCurrentAsString() {
		DateDTO dateDTO = new DateDTO();
		dateDTO.setCurrentAsString(dateService.getCurrentAsString());
		return new ResponseEntity<>(dateDTO, HttpStatus.OK);
	}
}
