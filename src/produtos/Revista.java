package produtos;

public class Revista extends DescritorProduto {
	private String editora;
	private int mes;
	private int ano;
	public void imprimir(){
		//imprimir todas as coisas
	}
	public Revista(String nome,int cod,int preco,String editora,int mes,int ano){
		this.nome=nome;
		this.codigo=cod;
		this.preco=preco;
		this.editora=editora;
		this.mes=mes;
		this.ano=ano;
		
	}
}
