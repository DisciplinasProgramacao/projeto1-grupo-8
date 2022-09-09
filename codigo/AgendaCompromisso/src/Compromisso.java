
/** Classe data simples para fundamentos de POO */
public class Compromisso {
	
	// atributos
	private String nome;
	private Data data;
	
	/**
     * Construtor para criar compromisso
     */
	public Compromisso() {
	}
	
	/**
     * Construtor completo: recebe nome e data.
     * @param String nome para o compromisso.
     * @param Data data para a data do compromisso.
     */
	public Compromisso(String nome, Data data) {
		this.data = data;
		this.nome = nome;
	}
	
	/**
     * Retorna a data.
     * @return Data com o data.
     */
	public Data getData() {
		return this.data;
	}
	
	/**
     * Cria a data de compromisso.
     */
	public void setData(Data data) {
		this.data = data;
	}
	
	/**
     * Retorna a nome.
     * @return String com o nome.
     */
	public String getNome() {
		return this.nome;
	}

	/**
     * Cria o nome do compromisso.
     */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	/**
     * Gera o relatório dos compromissos marcados.
     */
	public void gerarRelatorio(){
			System.out.println("-----------------------------RELATÓRIO----------------------------------");
			System.out.println("Nome:" + getNome());
			System.out.println("Data:" + getData().dataFormatada());
	}
}
