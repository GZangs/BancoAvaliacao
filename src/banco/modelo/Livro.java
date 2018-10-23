package banco.modelo;

public class Livro {
	private int id;
	private String Livro;
	private int anoPublicacao;
	private String editora;
	private Autor autor;
	
	public Livro() { }
	
	public Livro(int id, String livro, int anoPublicacao, String editora, Autor autor) {
		super();
		this.id = id;
		Livro = livro;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLivro() {
		return Livro;
	}

	public void setLivro(String livro) {
		Livro = livro;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
