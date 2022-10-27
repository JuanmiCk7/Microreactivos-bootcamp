package com.nttdata;

import java.time.Duration;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {
	
	Random random = new Random();
	
	@GetMapping("/person-list-1")
	public Flux<Person> personList1() {
		Flux<Person> flux = Flux.just(new Person("p1", "p1a",22)).delayElements(Duration.ofSeconds(random.nextInt(4)));
		
		return flux;
	}
	
	@GetMapping("/person-list-2")
	public Flux<Person> personList2() {
		Flux<Person> flux = Flux.just(new Person("p2", "p2a",22)).delayElements(Duration.ofSeconds(random.nextInt(4)));
		
		return flux;
	}
	
	@GetMapping("/person-list-3")
	public Flux<Person> personList3() {
		Flux<Person> flux = Flux.just(new Person("p3", "p3a",22)).delayElements(Duration.ofSeconds(random.nextInt(4)));
		
		return flux;
	}
	
	@GetMapping("/person-list-4")
	public Flux<Person> personList4() {
		Flux<Person> flux = Flux.just(new Person("p4", "p4a",22)).delayElements(Duration.ofSeconds(random.nextInt(4)));
		
		return flux;
	}
	
}
