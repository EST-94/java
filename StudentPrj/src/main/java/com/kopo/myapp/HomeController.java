package com.kopo.myapp;

import java.util.ArrayList;
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
	public String htmlTestPage(Locale locale, Model model) {
		return "mainHT";
	}
	
	@RequestMapping(value = "/testlist", method = RequestMethod.GET)
	public String htmlListPage(Locale locale, Model model) {
		DBCommon<Students> db = new DBCommon<Students>("c:/tomcat/stuScores.db", "scores");
		ArrayList<Students> student = db.selectArrayList(new Students());
		String htmlString = "";
		
		for (int i = 0; i < student.size(); i++) {
			htmlString = htmlString + "<tr>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).idx;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).name;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).middleScore;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).finalScore;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "</tr>";
		}
		model.addAttribute("list", htmlString);
		// 문자열을 만들어 치환시킴
		return "list";
	}
	
	@RequestMapping(value = "/listdbInsert", method = RequestMethod.GET)
	public String htmlInsertPage(Locale locale, Model model) {

		return "listInsert";
	}
	
	@RequestMapping(value = "/senddbInsert", method = RequestMethod.GET)
	public String insertact(Locale locale, Model model
			, @RequestParam("name") String name
			, @RequestParam("midscore") String middle
			, @RequestParam("finscore") String finals) {
		int middleNumber = Integer.parseInt(middle);
		int finalNumber = Integer.parseInt(finals);
		DBCommon<Students> db = new DBCommon<Students>("c:/tomcat/stuScores.db", "scores");

		db.insertData(new Students(name, middleNumber, finalNumber));

		return "listMessage";
	}
	
	@RequestMapping(value = "/listCreate", method = RequestMethod.GET)
	public String htmlCreatePage(Locale locale, Model model) {
		DBCommon<Students> db = new DBCommon<Students>("c:/tomcat/stuScores.db", "scores");
		db.createTable(new Students());

		return "listMessage";
	}
	
	@RequestMapping(value = "/listFix", method = RequestMethod.GET)
	public String htmlFixPage(Locale locale, Model model) {
		DBCommon<Students> db = new DBCommon<Students>("c:/tomcat/stuScores.db", "scores");
		ArrayList<Students> student = db.selectArrayList(new Students());
		String htmlString = "";

		for (int i = 0; i < student.size(); i++) {
			htmlString = htmlString + "<tr>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).idx;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).name;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).middleScore;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).finalScore;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "</tr>";
		}
		model.addAttribute("list", htmlString);
		return "listFixer";
	}
	
	@RequestMapping(value = "/senddbFix", method = RequestMethod.GET)
	public String fixact(Locale locale, Model model
			, @RequestParam("taIdx") String taidx
			, @RequestParam("name") String name
			, @RequestParam("midscore") String middle
			, @RequestParam("finscore") String finals) {
		int taNumber = Integer.parseInt(taidx);
		int middleNumber = Integer.parseInt(middle);
		int finalNumber = Integer.parseInt(finals);
		DBCommon<Students> db = new DBCommon<Students>("c:/tomcat/stuScores.db", "scores");
		ArrayList<Students> student = db.selectArrayList(new Students());
		String htmlString = "";
		
		Students selectUnit = db.detailsData(new Students(), taNumber);
		db.updateData(new Students(taNumber, name, middleNumber, finalNumber));
		
		for (int i = 0; i < student.size(); i++) {
			htmlString = htmlString + "<tr>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).idx;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).name;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).middleScore;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).finalScore;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "</tr>";
		}
		model.addAttribute("list", htmlString);
		return "listFixer";
	}
	
	@RequestMapping(value = "/listDel", method = RequestMethod.GET)
	public String htmlDelPage(Locale locale, Model model) {
		DBCommon<Students> db = new DBCommon<Students>("c:/tomcat/stuScores.db", "scores");
		ArrayList<Students> student = db.selectArrayList(new Students());
		String htmlString = "";

		for (int i = 0; i < student.size(); i++) {
			htmlString = htmlString + "<tr>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).idx;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).name;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).middleScore;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).finalScore;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "</tr>";
		}
		model.addAttribute("list", htmlString);
		return "listDell";
	}
	
	@RequestMapping(value = "/searchdbDel", method = RequestMethod.GET)
	public String delsearchact(Locale locale, Model model
			, @RequestParam("taIdx") String taidx) {
		int taNumber = Integer.parseInt(taidx);
		DBCommon<Students> db = new DBCommon<Students>("c:/tomcat/stuScores.db", "scores");
		ArrayList<Students> student = db.selectArrayList(new Students());
		String htmlString = "";
		String delString = "";
		
		Students selectUnit = db.detailsData(new Students(), taNumber);
		
		if (selectUnit != null) {
			htmlString = "<tr><td>" + selectUnit.idx
					+ "</td><td>" + selectUnit.name
					+ "</td><td>" + selectUnit.middleScore
					+ "</td><td>" + selectUnit.finalScore
					+ "</td></tr>";
			delString = "<form action='actdbDel' method = 'GET'>" + 
						"<input type='hidden' name='taIdx' value='" + selectUnit.idx + "'><br>"+
						"if you want to delete data which you searched, press 'delete' down below." +
						"<input type='submit' value='delete'>" + 
						"</form>";
		}
		else {
			htmlString = "\n\nno data found.";
		}
		
		
		model.addAttribute("list", htmlString);
		model.addAttribute("delbutton", delString);
		return "listDell";
	}
	
	@RequestMapping(value = "/actdbDel", method = RequestMethod.GET)
	public String delact(Locale locale, Model model
			, @RequestParam("taIdx") String taidx) {
		int taNumber = Integer.parseInt(taidx);
		DBCommon<Students> db = new DBCommon<Students>("c:/tomcat/stuScores.db", "scores");
		ArrayList<Students> student = db.selectArrayList(new Students());
		String htmlString = "failed.";
		
		Students selectUnit = db.detailsData(new Students(), taNumber);
		
		if (selectUnit != null) {
			db.resetIdx(selectUnit);
			db.deleteData(selectUnit);
			htmlString = "\n\nSuccess!";
		}
		
		
		model.addAttribute("list", htmlString);
		return "listDell";
	}

}
