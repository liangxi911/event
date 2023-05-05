package com.strategy.event.bean;

import java.sql.Timestamp;

public class TestBean {
	private String id;
	private String english;
	private String phonetics;
	private String chinese;
	private String length;
	private String remark;
	private Timestamp gmt_modified;
	private Timestamp gmt_create;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getPhonetics() {
		return phonetics;
	}
	public void setPhonetics(String phonetics) {
		this.phonetics = phonetics;
	}
	public String getChinese() {
		return chinese;
	}
	public void setChinese(String chinese) {
		this.chinese = chinese;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Timestamp getGmt_modified() {
		return gmt_modified;
	}
	public void setGmt_modified(Timestamp gmt_modified) {
		this.gmt_modified = gmt_modified;
	}
	public Timestamp getGmt_create() {
		return gmt_create;
	}
	public void setGmt_create(Timestamp gmt_create) {
		this.gmt_create = gmt_create;
	}
	@Override
	public String toString() {
		return "EnglishBean [id=" + id + ", english=" + english + ", phonetics=" + phonetics + ", chinese=" + chinese
				+ ", length=" + length + ", remark=" + remark + ", gmt_modified=" + gmt_modified + ", gmt_create="
				+ gmt_create + "]";
	}
}
