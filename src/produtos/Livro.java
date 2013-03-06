package produtos;

public class Livro extends DescritorProduto {
	private String editora;
	private String autor;
	private int ano;
	
	public void imprimir(){
		//imprimir todas as coisas
	}
	
	public Livro(int codigo,int preco,int ano,String nome,String editora,String autor){
		this.codigo = codigo;
		this.preco = preco;
		this.ano = ano;
		this.nome = nome;
		this.editora = editora;
		this.autor = autor;
		
	}

}
