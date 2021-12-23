package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DemoData;

@Repository
public interface DemoDataRepository extends JpaRepository <DemoData, String> {
	
	public List<DemoData> findAll();
	
	public List<DemoData> save (String insertVal);
	
	//public String save(String name); cannot convert type (different generic)
	
}
