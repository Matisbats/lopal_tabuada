package br.com.matheusmatos.tabuada.model;

public class Tabuada {

	private double multiplicando;
	private double menorMultiplicador;
	private double maiorMultiplicador;
	
	public double getMultiplicando() {
		return multiplicando;
	}
	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}
	public double getMenorMultiplicador() {
		return menorMultiplicador;
	}
	public void setMenorMultiplicador(double menorMultiplicador) {
		this.menorMultiplicador = menorMultiplicador;
	}
	public double getMairMultiplicador() {
		return maiorMultiplicador;
	}
	public void setMairMultiplicador(double mairMultiplicador) {
		this.maiorMultiplicador = mairMultiplicador;
	}
	
	public Object[] exibirTabuada() {
		
		if(menorMultiplicador > maiorMultiplicador) {
			double temp = maiorMultiplicador;
			maiorMultiplicador = menorMultiplicador;
			menorMultiplicador = temp;
		}
		
		int tamanhoVetor = (int) (maiorMultiplicador - menorMultiplicador + 1);
		
		String tabuada[] = new String[tamanhoVetor];
		
		int i = 0;
		while(menorMultiplicador <= maiorMultiplicador) {
			double produto = multiplicando * menorMultiplicador;
			// multiplicando X menorMultiplicador = produto
			tabuada[i] = multiplicando + "X" + menorMultiplicador + "=" + produto;
			//System.out.printf("$s X $s = $s\n", multiplicando, menorMultiplicador, produto);
			menorMultiplicador++;
			i++;
		}
		
		return tabuada;
		
	}
}