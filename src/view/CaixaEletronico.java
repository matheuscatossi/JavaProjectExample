package view;

import java.util.Scanner;
import controller.CaixaEletronicoController;

public class CaixaEletronico {

	Scanner scanner;
	CaixaEletronicoController caixaEletronicoController;

	public CaixaEletronico() {
		scanner = new Scanner(System.in);
		caixaEletronicoController = new CaixaEletronicoController();
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
