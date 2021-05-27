package com.kopo.myapp;

import java.sql.SQLException;
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
public class HomeController { // 제출용!
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mainpage(Locale locale, Model model) {
		return "mainHT";
	}
	
	@RequestMapping(value = "/showlist", method = RequestMethod.GET)
	public String listPage(Locale locale, Model model) {
		UserDB db = new UserDB();
		String htmlString = db.selectData();
		
		model.addAttribute("list", htmlString);
		return "list";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String htmlUpdatePage(Locale locale, Model model
			, @RequestParam("idx") int idx) {
		UserDB db = new UserDB();
		
		Infos selectPeople = db.detailsData(idx);

		if (selectPeople != null) {
			model.addAttribute("idx", selectPeople.idx);
			model.addAttribute("name", selectPeople.name);
			model.addAttribute("gender", selectPeople.gender);
			model.addAttribute("address", selectPeople.address);
			model.addAttribute("category", selectPeople.category);
		}

		return "update";
	}
	
	@RequestMapping(value = "/update_send", method = RequestMethod.GET)
	public String htmlUpdatesendPage(Locale locale, Model model
			, @RequestParam("idx") int idx
			, @RequestParam("name") String name
			, @RequestParam("gender") String gender
			, @RequestParam("address") String address
			, @RequestParam("category") String category) {
		
		UserDB db = new UserDB();
		
		db.updateData(idx, name, gender, address, category);
		
		return "listMessage";
	}
	
	@RequestMapping(value = "/listCreate", method = RequestMethod.GET)
	public String htmlCreatePage(Locale locale, Model model) {
		
		UserDB db = new UserDB();
		db.createTable();

		return "listMessage";
	}
	
	@RequestMapping(value = "/listdbInsert", method = RequestMethod.GET)
	public String htmlInsertPage(Locale locale, Model model) {

		return "listInsert";
	}
	
	@RequestMapping(value = "/senddbInsert", method = RequestMethod.GET)
	public String insertact(Locale locale, Model model
			, @RequestParam("name") String name
			, @RequestParam("gender") String gender
			, @RequestParam("address") String address
			, @RequestParam("category") String category) {

		UserDB db = new UserDB();
		db.insertData(name, gender, address, category);
		
		return "listMessage";
	}
	
	@RequestMapping(value = "/listDel", method = RequestMethod.GET)
	public String htmlDelPage(Locale locale, Model model) {
		UserDB db = new UserDB();
		String htmlString = db.selectData();

		model.addAttribute("list", htmlString);
		return "listDell";
	}
	
	@RequestMapping(value = "/searchdbDel", method = RequestMethod.GET)
	public String delsearchact(Locale locale, Model model
			, @RequestParam("taIdx") String taidx) {
		int taNumber = Integer.parseInt(taidx);
		UserDB db = new UserDB();
		String htmlString = "";
		String delString = "";
		
		Infos selectUnit = db.detailsData(taNumber);
		
		if (selectUnit != null) {
			htmlString = "<tr><td>" + selectUnit.idx
					+ "</td><td>" + selectUnit.name
					+ "</td><td>" + selectUnit.gender
					+ "</td><td>" + selectUnit.address
					+ "</td><td>" + selectUnit.category
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
			, @RequestParam("taIdx") String taidx) throws SQLException {
		int taNumber = Integer.parseInt(taidx);
		UserDB db = new UserDB();
		String htmlString = "failed.";
		
		Infos selectUnit = db.detailsData(taNumber);
		
		if (selectUnit != null) {
			db.deleteData(taNumber);
			htmlString = "\n\nSuccess!";
		}
		else if (selectUnit == null){
			htmlString = "\n\nfailed to load data.";
		}
		
		
		model.addAttribute("list", htmlString);
		return "listDell";
	}
	
	@RequestMapping(value = "/listsearch", method = RequestMethod.GET)
	public String listsearchmain(Locale locale, Model model) {

		return "listSearch";
	}
	
	@RequestMapping(value = "/senddbSearch", method = RequestMethod.GET)
	public String listsearchsend(Locale locale, Model model
			, @RequestParam("name") String name) {
		UserDB db = new UserDB();
		String htmlString = db.searchData(name);
		
		model.addAttribute("list", htmlString);
		return "listSearch";
	}
}
