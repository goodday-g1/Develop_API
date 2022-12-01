package com.jiwon.membership.service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jiwon.membership.model.*;
import com.jiwon.membership.repository.*;

@Service
public class PointService {
	@Autowired
	private final PointRepo pointRepo;
	
	// spring 4.2 이상은 @Autowired 생략 가능
	@Autowired 
	public PointService(pointRepo pointRepo) {
		this.pointRepo = pointRepo;
	}
	
//	public MemberInfo getMemberInfo() {
//		
//		MemberInfo memberInfo = new MemberInfo();
//		memberInfo. = "preword";
//		memberInfo.author = "hello-bryan";
//		memberInfo.createdDate = new Date();
//		
//		return MemberInfo;
//	}
	
	public PointHistory addPoint(PointHistory pointHistory) {
		return this.pointRepo.createUser(pointHistory);
	}
}
