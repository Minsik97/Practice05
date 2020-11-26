package com.javaex.ex01;

public class Member {
	//
	private String member;
	private String name;
	private int point;
	
	
	//
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		System.out.println("회원정보: " + member + "(" + name + ")" + ", " + point + "점" );
	}
	
	
	
	
	
	

}
