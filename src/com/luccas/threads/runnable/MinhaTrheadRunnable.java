package com.luccas.threads.runnable;

public class MinhaTrheadRunnable implements Runnable {

	private String nome;
	private int temp;
	
	public MinhaTrheadRunnable(String nome, int temp) {
		this.nome = nome;
		this.temp = temp;
		Thread t1 = new Thread(this);
		t1.start();
	}
	@Override
	public void run() {
		try {
		for(int i = 0; i<6; i++) {
			System.out.println(nome+" contador "+ i);
				Thread.sleep(temp);
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Terminou");
		}
	}


