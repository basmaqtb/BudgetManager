package Bmanager.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
		
		@RequestMapping("/home")
		public String home(Model model) {			
			model.addAttribute("name","Youssef Zemzem");
			model.addAttribute("id",1234);
			LocalDateTime now = LocalDateTime.now();
			model.addAttribute("time",now);
			
			List<String> friends= new ArrayList<String>();
			friends.add("Vandan");
			friends.add("Roshi");
			friends.add("ABC");
			
			
			model.addAttribute("f",friends);
			return "index";
		}
		
		@RequestMapping("/dream")
		public String dream() {
			System.out.println("l7lawi");
			return "dream";
		}
		
		@RequestMapping("/")
		public String Fpage() {
			return "Fpage";
		}


}
