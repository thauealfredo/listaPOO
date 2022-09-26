package ex54;

public class Cliente {

	int id;
	String nome;
	int idade;
	String email;
	ContaBancaria conta;

	
	// construtor nao padrao -> recebe assinaturas
	Cliente(int id, String nome, String email,  int idade, ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.conta = conta;
	}


	// construtor padrao
	Cliente() {}


	void atualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}

	String exibirNomeIdade() {
		return "Nome: " + this.nome + " - " + "Idade: " + this.idade;
	}
	
	String exibirDadosConta() {
		ContaBancaria _conta = this.conta;
		return "AG: " + _conta.agencia + " - " + "N°: " + _conta.numero + " - " + "Saldo: " + _conta.saldo;
	}
}
