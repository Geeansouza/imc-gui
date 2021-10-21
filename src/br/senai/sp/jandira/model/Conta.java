package br.senai.sp.jandira.model;

import br.senai.sp.jandira.Tela;

public class Conta {
	private double resultado;
	
	
	public void calcular(double peso,double altura) {
		resultado = peso / (altura * altura);
	}
	public double getResultado() {
		return this.resultado; 
	}
	
}
