package controleEstoque;

import java.util.List;

import produtos.DescritorProduto;

public class Venda {
	private boolean validacao_de_pagamento;
	private List<ProdutoVendido> produtosVendidos;
	
	public void fecha_conta(){}
	public void addItem(DescritorProduto d,int qtde){
		ProdutoVendido p;
		p = new ProdutoVendido(d,qtde);
	}
	public void pagamento_validado(){}
	public int total_geral(){
		return 0;
	}
	public Venda(){
		this.validacao_de_pagamento = false;
	}

}
