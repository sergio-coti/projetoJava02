package principal;

import controllers.FuncionarioController;

public class Main {

	public static void main(String[] args) {

		// criando um objeto da classe de controle
		var funcionarioController = new FuncionarioController();

		// executando o cadastro do funcionário
		funcionarioController.cadastrarFuncionario();
	}
}
