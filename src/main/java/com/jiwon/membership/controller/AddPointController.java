package com.jiwon.membership.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.*;
import com.jiwon.membership.model.*;
import com.jiwon.membership.service.MemberService;
import com.jiwon.membership.service.PointService;

@Slf4j
@RestController
public class AddPointController{
	
	private MemberService pointService;
	
	@Autowired
	public AddPointController(PointService pointService) {
		this.pointService = pointService;
	}
	
	
	@PostMapping(value="/member/Add")
	public ResponseEntity<PointHistory> memberAdd(@RequestBody PointHistory pointHistory){
		try {
			log.debug("/member/Add start", pointHistory.toString());
			return new ResponseEntity<>(pointService.addPoint(pointHistory), HttpStatus.OK);
		}catch (Exception e) {
			log.error(e.toString());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
