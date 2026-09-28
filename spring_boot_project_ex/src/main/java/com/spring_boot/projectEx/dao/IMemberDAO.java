package com.spring_boot.projectEx.dao;

import java.util.HashMap;

import com.spring_boot.projectEx.dto.MemberDTO;

public interface IMemberDAO {
	//public String loginCheck(HashMap<String, Object> map);
	public String loginCheck(String id);
	public void insertMember(MemberDTO dto);
	public String idCheck(String id);

}
