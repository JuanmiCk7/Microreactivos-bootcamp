package com.nttdata.rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class App {
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main( String[] args ) {
    	
        Observable<String> messageSender = Observable.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
        
        messageSender.subscribe(new Observer() {

			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("Observer1, Subscribed...");
			}

			@Override
			public void onNext(Object t) {
				System.out.println("Observer1, Received" + t);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Observer1, Error..."+e.getMessage());
			}

			@Override
			public void onComplete() {
				System.out.println("Observer1, Complete...");
			}
        	
        });
        
        messageSender.subscribe(new Observer() {

			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("Observer2, Subscribed...");
			}

			@Override
			public void onNext(Object t) {
				System.out.println("Observer2, Next..." + t);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Observer2, Error:"+e.getMessage());
			}

			@Override
			public void onComplete() {
				System.out.println("Observer2, Complete...");
			}
        	
        });
        
      
        
        
    }
}
