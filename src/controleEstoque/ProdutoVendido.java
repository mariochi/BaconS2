package controleEstoque;

import produtos.DescritorProduto;

public class ProdutoVendido {
	private DescritorProduto p;
	private int quantidade;
	
	public int fecha_conta(){
		return this.p.getPreco()*this.quantidade;
	}
	public void elimina(){
		this.p.baixaEstoque(this.quantidade);
		
	}
	public int codigo(){
		return p.getCodigo();
	}
	public int getQtde(){
		return this.quantidade;
	}
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
