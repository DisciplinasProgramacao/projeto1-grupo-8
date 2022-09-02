import java.io.*;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		 System.out.println("Você deseja criar um compromisso?");
		 System.out.println("1 - SIM");
		 System.out.println("2 - NÂO");

		Scanner s = new Scanner(System.in);

		int escolha = s.nextInt();
		
		if(escolha == 1) {
			System.out.println("Quantos compromissos você deseja cadastrar?");
			int qtd = s.nextInt();
			Compromisso[] compromisso = new Compromisso[qtd];
			
		for(int i = 0; i < compromisso.length; i++){
			System.out.println("Digite o nome do compromisso:");
			String nome = s.nextLine();
			
			System.out.println("Digite a data do seu compromisso:");
			int diaInicio = s.nextInt();
			System.out.print("/");
			int mesInicio = s.nextInt();
			System.out.print("/");
			int anoInico = s.nextInt();
			Data data = new Data(diaInicio, mesInicio, anoInico);
			
			System.out.println("Digite o quanto ele vai se repetir:");
			int frequencia = s.nextInt();
			
			System.out.println("Digite por quantas vezes ele vai se repetir:");
			int quantidadeFrequencia = s.nextInt();
			
			for(int j = 0; i < quantidadeFrequencia; j++) {
				compromisso[j] = new Compromisso(nome, data);
				System.out.println("Seu compromisso " + compromisso[i].getNome() + " foi agendado com sucesso!");
			}
			}
		
		System.out.println("Digite a data inicio e a data fim do relatório");
		} 
		
	}

}
