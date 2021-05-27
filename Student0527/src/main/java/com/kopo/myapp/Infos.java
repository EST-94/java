package com.kopo.myapp;

public class Infos {
	int idx;
	String name;
	String gender;
	String address;
	String category;
	
	Infos(){
		
	}
	
	Infos (String name, String gender, String address, String category){
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.category = category;
		
	}
	
	Infos (int idx, String name, String gender, String address, String category){
		this.idx = idx;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.category = category;
		
	}
}
