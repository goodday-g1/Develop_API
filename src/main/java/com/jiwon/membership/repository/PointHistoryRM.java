package com.jiwon.membership.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jiwon.membership.model.MemberInfo;
import com.jiwon.membership.model.PointHistory;


public class PointHistoryRM implements RowMapper<PointHistory>{
	@Override
	public PointHistory mapRow(ResultSet rs, int rowNum) throws SQLException {
		PointHistory pointhistory = new PointHistory();
		pointhistory.setStore_id(rs.getInt("store_id"));
		pointhistory.setMbs_barcode(rs.getString("mbs_barcode"));
		pointhistory.setPoint(rs.getInt("point"));
		pointhistory.setCubun(rs.getstring("cubun"));
		pointhistory.setCubun(rs.getString("req_tm"));
		return pointhistory;
	}
}
