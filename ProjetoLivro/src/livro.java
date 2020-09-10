
public class livro implements publicacao {
	private String titulo;
	private String autor;
	private int tolPaginas;
	private int pagAtual = 0;
	private boolean aberto = false;
	private pessoas leitor;

	public livro(String titulo, String autor, int tolPaginas, pessoas leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.tolPaginas = tolPaginas;
		this.leitor = leitor;
	}

	public String detalhes() {
		return "livro\ntitulo=" + titulo + " 	autor=" + autor + "\ntolPaginas=" + tolPaginas + "	 pagAtual="
				+ pagAtual + "		aberto=" + aberto + "\nleitor=" + leitor.getIdade() + "		idade = "
				+ leitor.getIdade() + "	 sexo = " + leitor.getSexo();
	}

	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		if (p < pagAtual) {
			System.out.println("Livro menor que quantidade a ser folheada");
			this.pagAtual = 0;
		} else {
			this.pagAtual = p;
		}
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
	}

}
