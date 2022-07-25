package com.luccas.threads.seconds;

import java.time.LocalTime;

public class Mensagem implements Runnable{
	private int hora;
	
	public Mensagem(int hora) {
		this.hora = hora;
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		System.out.println(LocalTime.now());
		try {
			Thread.sleep(hora);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(LocalTime.now());
		
		
	}
	
	
	
}
