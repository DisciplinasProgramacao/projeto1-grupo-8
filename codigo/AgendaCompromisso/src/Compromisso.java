
public class Compromisso {
	private Data data;
	private int frequencia;
	private int quantidadeFrequencia;
	private String nome;
	private String descricao;


	public Compromisso() {
	}

	public Compromisso(Data data, int frequencia, int quantidadeFrequencia, String nome, String descricao) {
		this.data = data;
		this.frequencia = frequencia;
		this.quantidadeFrequencia = quantidadeFrequencia;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public int getFrequencia() {
		return this.frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	public int getQuantidadeFrequencia() {
		return this.quantidadeFrequencia;
	}

	public void setQuantidadeFrequencia(int quantidadeFrequencia) {
		this.quantidadeFrequencia = quantidadeFrequencia;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String calcularDataFim(){
		if(getFrequencia() > 0){
			
		}
		return getData().dataFormatada();
	}

	public void gerarRelatorio(){
			System.out.println("Nome:" + getNome());
			System.out.println("Data:" + getData());
			System.out.println("Data Fim:" + calcularDataFim());
			System.out.println("Descrição:" + getDescricao());
	}
}
