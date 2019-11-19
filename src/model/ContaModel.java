package model;

import java.util.ArrayList;

public class ContaModel {

	private double saldo = 450.00;
	private int numeroConta = 123;
	private String nomePessoa = "AAAB";
	private ArrayList<Historico> historico;

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo ;
	}

	public void aumentarSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	public void subtrairSaldo(double saldo) {
		this.saldo -= saldo;
	}

	public ArrayList<Historico> getHistorico() {
		return historico;
	}

	public void setHistorico(ArrayList<Historico> historico) {
		this.historico = new ArrayList<Historico>();
		this.historico = historico;
	}
	
	public void setItemHistorico(Historico item) {
		if(this.historico == null) {
			this.historico = new ArrayList<Historico>();
		}
		
		this.historico.add(item);
	}	
	
}
