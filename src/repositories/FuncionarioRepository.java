package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

	public void exportarDados(Funcionario funcionario) {
		
		try {
			
			//criando um arquivo de texto em modo 'append'
			var fileWriter = new FileWriter("c:\\temp\\funcionarios.txt", true);
			var printWriter = new PrintWriter(fileWriter);
			
			//escrevendo conteúdo no arquivo
			printWriter.write("\nId do funcionário....: " + funcionario.getId());
			printWriter.write("\nNome.................: " + funcionario.getNome());
			printWriter.write("\nMatrícula............: " + funcionario.getMatricula());
			printWriter.write("\nData de admissão.....: " + funcionario.getDataAdmissao());
			printWriter.write("\nTipo de contratação..: " + funcionario.getTipo());
			printWriter.write("\n");
			
			//fechando o arquivo
			printWriter.close();
			
			//exibindo mensagem de sucesso:
			System.out.println("\nDados gravados com sucesso!");
		}
		catch(Exception e) {
			//exibindo mensagem de erro:
			System.out.println("\nErro ao cadastrar funcionário: " + e.getMessage());
		}
	}
}
