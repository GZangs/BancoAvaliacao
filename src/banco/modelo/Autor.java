package banco.modelo;

public class Autor implements Imprimivel {
	private int id;
	private String nome;
	private Long cpf;
	
	public Autor() { }
	
	public Autor(int id, String nome, Long cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nNome: " + getNome();
	}

	@Override
	public String imprimeEmLista() {
		return String.format("%d\t%s\t%s", getId(), getNome(), getCpf());
	}

	@Override
	public String[] getColunas() {
		String[] colunas = {"id", "Nome", "CPF"};
		return colunas;
	}
}
