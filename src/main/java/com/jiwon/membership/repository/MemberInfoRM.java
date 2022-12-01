package com.jiwon.membership.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jiwon.membership.model.MemberInfo;


public class MemberInfoRM implements RowMapper<MemberInfo>{
	@Override
	public MemberInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		MemberInfo memberinfo = new MemberInfo();
		memberinfo.setUser_id(rs.getInt("user_id"));
		memberinfo.setMbs_barcode(rs.getString("mbs_barcode"));
		memberinfo.setName(rs.getString("name"));
		return memberinfo;
	}
}
