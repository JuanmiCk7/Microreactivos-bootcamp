package com.nttdata.reactor_ejemplo;

import reactor.core.publisher.Flux;

public class App {
    public static void main( String[] args ) {
        
    	Flux<String> messageSender = Flux.just("Mensaje1", "Mensaje2", "Mensaje3");
    	
    	/*messageSender.subscribe(next -> System.out.println("Observer 1, received:"+next),
    							error -> System.out.println("Observer 1, error:"+error),
    							completed -> System.out.println("Observe 1, completed:"));*/
    	
    }
}
