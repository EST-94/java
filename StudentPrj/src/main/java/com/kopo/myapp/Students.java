package com.kopo.myapp;

public class Students {
	int idx;
	String name;
	int middleScore;
	int finalScore;
	
	Students() {
		
	}
	
	Students(String name, int middleScore, int finalScore){
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;
	}
	
	Students(int idx, String name, int middleScore, int finalScore){
		this.idx = idx;
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;
	}
	
}
