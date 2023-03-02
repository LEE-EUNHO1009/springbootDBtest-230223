package com.eunocompany.home.dto;

import java.security.Timestamp;

public class MemberDto {
	
	private String mid;
	private String mpw;
	private String mname;
	private String memail;
	private String mdate;
	private Timestamp mbirth;
	
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String mid, String mpw, String mname, String memail, String mdate, Timestamp mbirth) {
		super();
		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
		this.memail = memail;
		this.mdate = mdate;
		this.mbirth = mbirth;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpw() {
		return mpw;
	}

	public void setMpw(String mpw) {
		this.mpw = mpw;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getMdate() {
		return mdate;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}

	public Timestamp getMbirth() {
		return mbirth;
	}

	public void setMbirth(Timestamp mbirth) {
		this.mbirth = mbirth;
	}
	
	
	
}