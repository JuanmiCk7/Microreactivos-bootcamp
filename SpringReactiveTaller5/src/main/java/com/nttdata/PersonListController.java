package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

@Controller
public class PersonListController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/person-list")
	public String personList(final Model model) {
		
		Flux<Person> personlist = personService.allPersons();
		
		model.addAttribute("personlist", personlist);
		
		return "personList";
	}
	
}
