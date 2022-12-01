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

@Slf4j
@RestController
public class MemberController{
	
	private MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@GetMapping("/member/List")
	public Object memberList() {
		log.debug("/member/List start");
		List<MemberInfo> memberList = memberService.getMemberList();
		return memberList;
	}
	
	@PostMapping(value="/member/Add")
	public ResponseEntity<MemberInfo> memberAdd(@RequestBody MemberInfo memberInfo){
		try {
			log.debug("/member/Add start", memberInfo.toString());
			return new ResponseEntity<>(memberService.addMember(memberInfo.getName()), HttpStatus.OK);
		}catch (Exception e) {
			log.error(e.toString());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
