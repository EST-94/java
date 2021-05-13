package com.kopo.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("textValue", "aaa");
		return "home";
	}
	
	@RequestMapping(value = "/testpage", method = RequestMethod.GET)
	public String page(Locale locale, Model model) {
		model.addAttribute("textValue", "tada");
		return "home2";
	}
	
	@RequestMapping(value = "/createStu1", method = RequestMethod.GET)
	public String db1page(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/s.db", "student1");
		// select db(dbname, tablename)
		db.createTable(new Student());
		// create db
		model.addAttribute("textValue", "created student1!");
		return "home2";
		// return textpage
	}
	
	@RequestMapping(value = "/createStu2", method = RequestMethod.GET)
	public String db2page(Locale locale, Model model) {
		DBCommon<Student2> db = new DBCommon<Student2>("c:/tomcat/scores.db", "scores");
		// select db(dbname, tablename)
		db.createTable(new Student2());
		// create db
		model.addAttribute("textValue", "created scores db!");
		return "home2";
		// return textpage
	}
	
	@RequestMapping(value = "/insertStu1", method = RequestMethod.GET)
	public String db1insert(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/s.db", "student1");
		// select db(dbname, tablename)
		db.insertData(new Student("test", 220));
		// insert to db
		model.addAttribute("textValue", "inserted to student1!");
		return "home2";
		// return textpage
	}
	
	@RequestMapping(value = "/insertStu2", method = RequestMethod.GET)
	public String db2insert(Locale locale, Model model) {
		return "insert";
		// return textpage
	}
	
	@RequestMapping(value = "/insertStu2_action", method = RequestMethod.GET)
	public String db2insertact(Locale locale, Model model
			, @RequestParam("name") String name
			, @RequestParam("midscore") String middle
			, @RequestParam("finscore") String finals) {
		int middleNumber = Integer.parseInt(middle);
		int finalNumber = Integer.parseInt(finals);
		DBCommon<Student2> db = new DBCommon<Student2>("c:/tomcat/scores.db", "scores");

		db.insertData(new Student2(name, middleNumber, finalNumber));
		// insert to db
		
		model.addAttribute("textValue", "inserted to scores db!");
		return "insert";
		// return insert, it seems like reset screen
	}
	
}
