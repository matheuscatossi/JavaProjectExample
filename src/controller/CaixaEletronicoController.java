package controller;

import model.ContaModel;

public class CaixaEletronicoController {

	ContaModel contaModel = new ContaModel();
	
	public double consultarSaldo() {
		return contaModel.getSaldo();
	}
	
	public double sacar(double valorSaque) {
		contaModel.setSaldo(contaModel.getSaldo() - valorSaque);
		return contaModel.getSaldo();
	}
	
}
