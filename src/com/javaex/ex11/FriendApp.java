package com.javaex.ex11;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Friend[] friend= new Friend[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요");
		
		for(int i=0; i<friend.length;i++) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("휴대폰: ");
			String hp = sc.nextLine();
			System.out.print("학교: ");
			String school = sc.nextLine();
			System.out.println("====================");
			
			Friend fd= new Friend();
			fd.setName(name);
			fd.setHp(hp);
			fd.setSchool(school);
			
			friend[i] = fd;
		}		
		
		for(int i=0; i<friend.length;i++) {
			friend[i].showInfo();
		}
		
		
		
		
		

	}

}
