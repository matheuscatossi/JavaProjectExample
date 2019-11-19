package view;

import java.util.Scanner;

import controller.CaixaEletronicoController;
import model.ContaModel;

public class CaixaEletronico {

	Scanner scanner;
	CaixaEletronicoController caixaEletronicoController;
	ContaModel contaModel;
	public CaixaEletronico() {
		contaModel = new ContaModel();
		scanner = new Scanner(System.in);
		caixaEletronicoController = new CaixaEletronicoController(contaModel);
	}
	
	public void transferencia() {
		ContaModel contaLuigi = new ContaModel();
		contaLuigi.setSaldo(1500);
		ContaModel contaRodrigo = new ContaModel();
		contaRodrigo.setSaldo(100);
		
		caixaEletronicoController = new CaixaEletronicoController(contaLuigi);
		contaRodrigo = caixaEletronicoController.transferenciaPara(contaRodrigo, 5);
		contaRodrigo = caixaEletronicoController.transferenciaPara(contaRodrigo, 10);
		contaRodrigo = caixaEletronicoController.transferenciaPara(contaRodrigo, 21);
		
		System.out.println("Saldo Luigi: " + contaLuigi.getSaldo());
		System.out.println("Saldo Rodrigo: " + contaRodrigo.getSaldo());
		
		System.out.println("_____________");
		System.out.println("Extrato da conta do Luigi");
		for(int i = 0; i < contaLuigi.getHistorico().size(); i ++ ){
			System.out.println("Data da transação: " + contaLuigi.getHistorico().get(i).getDataTransferencia());
			System.out.println("Valor anterior: R$" + contaLuigi.getHistorico().get(i).getValorAnterior());
			System.out.println("Valor atual: R$" + contaLuigi.getHistorico().get(i).getValorAtual());
			System.out.println("Valor transferido: R$" + contaLuigi.getHistorico().get(i).getValor());
			System.out.println("_____________");
		}
		
		
	}
	
	public void iniciarSessao() {
		System.out.println("Qual operação deseja realizar? \n 1. Visualizar Saldo. \n 2.Sacar dinheiro.\n 3. Depositar \n 4.Sair");
		
		
		String operacao = scanner.next();

		switch (operacao) {
		case "1":
			consultarSaldo();
			break;
		case "2":
			sacar();
			break;
		case "3":
			depositar();
			break;
		case "4":
			System.out.println("Obrigado!");
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}
	
	private void depositar(){
		System.out.println("E ai man... quanto tu quer depositar?");
		double valor = scanner.nextDouble();
		
		
		caixaEletronicoController.depositar(valor);
		System.out.println(valor);
		
		consultarSaldo();
	}
	
	private void consultarSaldo() {
		System.out.println("Seu saldo atual é: " + caixaEletronicoController.consultarSaldo());
	}
	
	private void sacar() {
		System.out.println("Qual valor deseja sacar?");
		scanner = new Scanner(System.in);
		String valorSaque = scanner.next();
		try {
			caixaEletronicoController.sacar(Double.parseDouble(valorSaque));
		} catch (Exception e) {
			System.out.println("Opção inválida!");
			System.out.println(e);
		}
		
		System.out.println("Seu saldo atual após o saque é: " + caixaEletronicoController.consultarSaldo());
	}

}
