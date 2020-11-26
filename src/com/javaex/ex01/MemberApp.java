package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member member = new Member();
		
		member.setMember("정우성");
		member.setName("jws");
		member.setPoint(50000);
		
		member.showInfo();
		
		Member member01 = new Member();
		
		member01.setMember("유재석");
		member01.setName("yjs");
		member01.setPoint(30000);
		
		member01.showInfo();
		
		Member member02= new Member();
		
		member02.setMember("이효리");
		member02.setName("lhr");
		member02.setPoint(40000);
		
		member02.showInfo();
		
	}

}
