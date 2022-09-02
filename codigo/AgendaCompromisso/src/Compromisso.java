
public class Compromisso {
	private String nome;
	private Data data;
	

	public Compromisso() {
	}

	public Compromisso(String nome, Data data) {
		this.data = data;
		this.nome = nome;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data dataInicio) {
		this.data = data;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void gerarRelatorio(){
			System.out.println("Nome:" + getNome());
			System.out.println("Data:" + getData().dataFormatada());
	}
}
