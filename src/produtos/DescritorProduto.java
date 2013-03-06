package produtos;

import java.util.List;

public class DescritorProduto {
	protected String nome;
	protected int codigo;
	protected int preco;
	protected List<Item> listaDeitem;
	
	public boolean verifica_estoque(int qtde){
		boolean teste;
		teste = this.listaDeitem.size()>=qtde;
		return teste;
	}
	public String getNome(){
		return this.nome;
	}
	public void imprimir(){
		//impressão cód e preço
	}
	
	
	public DescritorProduto(){
		
	}
	public int getCodigo() {
		return this.codigo;
	}

}
