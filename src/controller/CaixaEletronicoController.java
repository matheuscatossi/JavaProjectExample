package controller;

import model.ContaModel;
import model.Historico;

public class CaixaEletronicoController {

	ContaModel contaModel;
	

	public CaixaEletronicoController(ContaModel contaModel) {
		this.contaModel = contaModel;
	}

	public double consultarSaldo() {
		return contaModel.getSaldo();
	}

	public double sacar(double valorSaque) {
		contaModel.setSaldo(contaModel.getSaldo() - valorSaque);
		return contaModel.getSaldo();
	}

	public void depositar(double valor) {
		contaModel.aumentarSaldo(valor);
	}

	public ContaModel transferenciaPara(ContaModel contaModel, double valor) {

		if (valor > contaModel.getSaldo()) {
			System.out
					.println("O valor que você está querendo transferir é superior ao valor que você possui na conta!");
		} else {
			contaModel.subtrairSaldo(valor);
			
			double valorAnterior = this.contaModel.getSaldo();
			
			this.contaModel.aumentarSaldo(valor);
			this.contaModel.setItemHistorico(new Historico(valor, valorAnterior, this.contaModel.getSaldo(), "DATA XPTO"));
			
		}

		return contaModel;
	}
}
