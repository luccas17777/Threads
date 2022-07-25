package com.luccas.threads;

public class MinhaThread extends Thread{
	
	private String nome;
	private int temp;
	
	public MinhaThread(String nome, int temp) {
		this.nome = nome;
		this.temp = temp;
		start();
	}
	
	public void run() {
		try {
		for(int i = 0; i<6; i++) {
			System.out.println(nome+ "contador"+i);
				Thread.sleep(temp);
		}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
