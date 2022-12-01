package com.jiwon.membership.repository;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.jiwon.membership.model.*;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Repository
public class PointRepo {
	private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	private final PointHistoryRM pointHistoryRM;
	
	public PointRepo(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
		this.pointHistoryRM = new PointHistoryRM();
	}
	
	public PointHistory addPoint(PointHistory pointHistory){
		MemberPoint memberpoint = new MemberPoint();
		String query = "insert into membership.MEMBER_INFO(mbs_barcode, name) values( CONCAT('B', LPAD(cast(nextval('memberid_seq') as char(9)),'9','0')),:name)";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(name);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		namedParameterJdbcTemplate.update(query, param, keyHolder);
		
		log.debug("findList query = {}", query);

		Integer id = keyHolder.getKey().intValue();
		
		memberInfo.setUser_id(id);;
		
		return memberInfo;
	}
}