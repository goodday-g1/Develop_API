package com.jiwon.membership.model;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberPoint {
	private String mbs_barcode;
	private char store_type;
	private Integer point;
	private Timestamp update_tm;
}
