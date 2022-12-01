package com.jiwon.membership.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.*;
import com.jiwon.membership.model.*;
import com.jiwon.membership.service.AService;

@Slf4j
@RestController
public class AController{
	
	private AService aService;
	
	@Autowired
	public AController(AService aService) {
		this.aService = aService;
	}
	
		
	@GetMapping("/")
    public String userAccess() {
        //Authentication 객체를 통해 유저 정보를 가져올 수 있다.
       
        return "welcome";
    }
}
