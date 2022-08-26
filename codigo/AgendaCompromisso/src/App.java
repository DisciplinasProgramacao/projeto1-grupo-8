import java.io.*;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// System.out.println("Você deseja criar um compromisso?");
		// System.out.println("1 - SIM");
		// System.out.println("2 - NÂO");

		// Scanner s = new Scanner(System.in);
		// String escolha = s.nextLine();

		Compromisso[] compromisso = new Compromisso[10];

		int i = 0;

		while(i < 3){
			Data data = new Data(01, 9, 2022);
			int frequencia = 7;
			int quantidadeFrequencia = 1;
			String nome = "Compromisso 1";
			String descricao = "Teste";
	
			compromisso[i] = new Compromisso(data, frequencia, quantidadeFrequencia, nome, descricao);
			System.out.println("Seu compromisso " + compromisso[i].getNome() + " foi agendado com sucesso!");

			compromisso[i].gerarRelatorio();
		}
		
		
		


		


	}

}
