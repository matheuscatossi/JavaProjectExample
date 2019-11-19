package model;

public class Historico {

	private double valorAnterior;
	private double valorAtual;
	private String dataTransferencia;
	private double valor;
	
	public Historico(double valor, double valorAnterior, double valorAtual, String dataTransferencia) {
		this.valor =  valor;
		this.valorAnterior = valorAnterior;
		this.valorAtual = valorAtual;
		this.dataTransferencia = dataTransferencia;
	}
	
	
	public double getValorAnterior() {
		return valorAnterior;
	}
	public void setValorAnterior(double valorAnterior) {
		this.valorAnterior = valorAnterior;
	}
	public double getValorAtual() {
		return valorAtual;
	}
	public void setValorAtual(double valorAtual) {
		this.valorAtual = valorAtual;
	}
	public String getDataTransferencia() {
		return dataTransferencia;
	}
	public void setDataTransferencia(String dataTransferencia) {
		this.dataTransferencia = dataTransferencia;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
