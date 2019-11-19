package model;

public class ContaModel {

	private double saldo = 450.00;
	private int numeroConta = 123;
	private String nomePessoa = "AAAB";

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
}
