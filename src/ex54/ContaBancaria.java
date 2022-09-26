package ex54;

public class ContaBancaria {
	String agencia;
	String numero;
	double saldo;
	
	
	// construtor nao padrao
	ContaBancaria(String agencia, String numero, double saldo){
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
}
