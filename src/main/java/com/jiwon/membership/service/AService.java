package com.jiwon.membership.service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jiwon.membership.model.*;
import com.jiwon.membership.repository.*;

@Service
public class AService {
	@Autowired
	private final MembershipRepo membershipRepo;
	
	// spring 4.2 이상은 @Autowired 생략 가능
	@Autowired 
	public AService(MembershipRepo membershipRepo) {
		this.membershipRepo = membershipRepo;
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
	
	public List<MemberInfo> getMemberList() {
		return this.membershipRepo.findList();
	}
}
