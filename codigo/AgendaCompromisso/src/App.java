import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		 System.out.println("Você deseja criar um compromisso?");
		 System.out.println("1 - SIM");
		 System.out.println("2 - NÃO");

		int escolha = MyIO.readInt();
		List<Compromisso> compromisso = new ArrayList<Compromisso>();
			while(escolha == 1) {
			System.out.print("Digite o nome do compromisso: ");
			String nome = MyIO.readLine();
			
			System.out.print("Digite o dia do seu compromisso: ");
			int dia = MyIO.readInt();
			System.out.print("Digite o mês do seu compromisso: ");
			int mes = MyIO.readInt();
			
			
			System.out.print("Digite o quanto ele vai se repetir: ");
			int frequencia = MyIO.readInt();
			
			System.out.print("Digite por quantas vezes ele vai se repetir: ");
			int quantidadeFrequencia = MyIO.readInt();
			
			
			
			for(int j = 0; j < quantidadeFrequencia; j++) {
				Data data = new Data(dia, mes, 2022);
				compromisso.add(new Compromisso(nome, data));
				dia += frequencia;
				int diaMaxMes = data.diaMes(mes);
				if(dia > diaMaxMes) {
					dia = dia - diaMaxMes;
					mes++;
				}
			}
			
			System.out.println("Seu compromisso " + nome + " foi agendado com sucesso!");
			
			
			 System.out.println("1 - CRIAR OUTRO COMPROMISSO");
			 System.out.println("2 - CANCELAR");
			 System.out.println("3 - GERAR RELATÓRIO");
			 escolha = MyIO.readInt();
			 
			 if(escolha == 3) {
				 System.out.print("Digite o dia de inicio do relatório: ");
					int diaInicio = MyIO.readInt();
					System.out.print("Digite o mês de inicio do relatório: ");
					int mesInicio = MyIO.readInt();
					
					System.out.print("Digite o dia de termino do relatório: ");
					int diaFim = MyIO.readInt();
					System.out.print("Digite o mês de termino do relatório: ");
					int mesFim = MyIO.readInt();
					
					for(int i = 0; i < compromisso.size(); i++) {
						if((compromisso.get(i).getData().obterDia() >= diaInicio && compromisso.get(i).getData().obterMes() >= mesInicio) && (compromisso.get(i).getData().obterDia() <= diaFim && compromisso.get(i).getData().obterMes() <= mesFim)) {
							compromisso.get(i).gerarRelatorio();
						}
						
					}
					break;
			 } else if(escolha == 2) {
				 break;
			 }
			 
			}
		} 
		
	}
