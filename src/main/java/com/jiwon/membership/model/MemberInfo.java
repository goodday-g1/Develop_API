package com.jiwon.membership.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberInfo {
	private Integer user_id;
	private String mbs_barcode;
	private String name;
}