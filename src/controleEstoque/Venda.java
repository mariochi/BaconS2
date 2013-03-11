package controleEstoque;

import java.util.List;

import produtos.DescritorProduto;

public class Venda {
	private boolean validacao_de_pagamento;
	private List<ProdutoVendido> produtosVendidos;
	
	public List<ProdutoVendido> getProdutos(){
		return this.produtosVendidos;
	}
	public void fecha_conta(){
		int acumulado = 0;
		for(ProdutoVendido p:this.produtosVendidos)
		{
			acumulado += p.fecha_conta();
			//imprimir preço por item
		}
		//imprimir preço total
	}
	public void addItem(DescritorProduto d,int qtde){
		ProdutoVendido p;
		p = new ProdutoVendido(d,qtde);
	}
	public List<Integer> vendidos(){
		List<Integer> aux = null;
		for(ProdutoVendido p:this.produtosVendidos){
			aux.add(p.codigo());
		}
		return null;
		
	}
	public void pagamento_validado(){
		for(ProdutoVendido p:produtosVendidos){
			p.elimina();
		}
	}
	public int total_geral(){
		return 0;
	}
	public Venda(){
		this.validacao_de_pagamento = false;
	}

}
