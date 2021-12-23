package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DemoData;
import com.example.demo.repository.DemoDataRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class DemoService {
		@Autowired
		DemoDataRepository demoDataRepository;
		
		public List <DemoData> listAll(){
			List<DemoData> members = new ArrayList<>();
			return demoDataRepository.findAll();
		}
		
		public void insertName(String names){
			DemoData demodata = new DemoData();
			demodata.setThisIsName(names);
			demoDataRepository.save(demodata);
		}
		
//		public List <DemoData> insertName(String names){
//			return demoDataRepository.save(names);
//		}
		
//		public String insertName(String names){
//		return demoDataRepository.save(names);
//	}
}
