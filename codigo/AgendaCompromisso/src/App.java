import java.io.*;
import java.util.List;
import java.util.ArrayList;


	/** Classe app simples para fundamentos de POO */
public class App {
	
	 /** Classe inicial para marcar compromissos. */
	public static void main(String[] args) {
		System.out.println("----------------------AGENDAR COMPROMISSO-------------------------------");
		System.out.println("");
		 System.out.println("Voc� deseja criar um compromisso?");
		 System.out.println("1 - SIM");
		 System.out.println("2 - N�O");
		 
		 
	 /** Estrutura de repetição para personalizar o compromisso. */ 
		int escolha = MyIO.readInt();
		List<Compromisso> compromisso = new ArrayList<Compromisso>();
			while(escolha == 1) {
			System.out.println("------------------------NOME COMPROMISSO--------------------------------");
			System.out.print("Digite o nome do compromisso: ");
			String nome = MyIO.readLine();
			
			System.out.println("------------------------DIA COMPROMISSO--------------------------------");
			System.out.print("Digite o dia do seu compromisso: ");
			int dia = MyIO.readInt();
			System.out.println("------------------------MÊS COMPROMISSO--------------------------------");
			System.out.print("Digite o m�s do seu compromisso: ");
			int mes = MyIO.readInt();
			
			System.out.println("------------------------FREQUÊNCIA COMPROMISSO--------------------------------");
			System.out.print("Digite de quantos em quantos dias ele vai se repetir: ");
			int frequencia = MyIO.readInt();
			frequencia = frequencia < 1 ? 1 : frequencia;
			
			System.out.println("------------------------REPETIR FREQUÊNCIA COMPROMISSO--------------------------------");
			System.out.print("Digite por quantas vezes ele vai se repetir: ");
			int quantidadeFrequencia = MyIO.readInt();
			quantidadeFrequencia = quantidadeFrequencia < 1 ? 1 : quantidadeFrequencia;
			
			
	/** Definir a frequência que o compromisso será realizado. */
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
			System.out.println("--------------------------------------------------------");
			System.out.println("Seu compromisso " + nome + " foi agendado com sucesso!");
			System.out.println("--------------------------------------------------------");
			
			System.out.println("");
			 System.out.println("1 - CRIAR OUTRO COMPROMISSO");
			 System.out.println("2 - CANCELAR");
			 System.out.println("3 - GERAR RELAT�RIO");
			 escolha = MyIO.readInt();
			 
			 
	 /** Gerar relatório para o usuário dos compromissos agendados. */
			 if(escolha == 3) {
				 System.out.println("------------------------DATA INICIO RELATÓRIO--------------------------------");
				 System.out.print("Digite o dia de inicio do relat�rio: ");
					int diaInicio = MyIO.readInt();
					System.out.print("Digite o m�s de inicio do relat�rio: ");
					int mesInicio = MyIO.readInt();
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("------------------------DATA FIM RELATÓRIO--------------------------------");
					System.out.print("Digite o dia de termino do relat�rio: ");
					int diaFim = MyIO.readInt();
					System.out.print("Digite o m�s de termino do relat�rio: ");
					int mesFim = MyIO.readInt();
					System.out.println("--------------------------------------------------------------------------");
					
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
