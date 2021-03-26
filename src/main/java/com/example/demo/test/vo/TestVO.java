package com.example.demo.test.vo;

public class TestVO {
	private Long memeberNo;
	private String id;
	private String name;
	
	public TestVO() {
		
	}
	
	public TestVO(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Long getMemeberNo() {
		return memeberNo;
	}
	public void setMemeberNo(Long memeberNo) {
		this.memeberNo = memeberNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
