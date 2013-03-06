package controleEstoque;

import produtos.DescritorProduto;

public class ProdutoVendido {
	private DescritorProduto p;
	private int quantidade;
	
	public int fecha_conta(){
		return 0;
	}
	public void elimina(){
		
	}
	public int codigo(){
		return 0; }
	public ProdutoVendido(DescritorProduto d, int qtde){
		boolean teste;
		this.p = d;
		teste = d.verifica_estoque(qtde);
		if(teste){
			this.quantidade = qtde;
		}
		else{
			this.quantidade = -1;
			//mensagem de erro;
		}
		
	}

}
