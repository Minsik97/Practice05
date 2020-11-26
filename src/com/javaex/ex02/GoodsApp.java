package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		
		Goods cup = new Goods("머그컵", 2000);
		
		Goods camera = new Goods("니콘", 400000);
		
		
		
		camera.showInfo();
		cup.showInfo();
		
	}

}


