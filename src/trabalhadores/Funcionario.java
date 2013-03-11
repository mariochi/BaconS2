package trabalhadores;

import produtos.DescritorProduto;
import central.Starter;
import controladores.Livraria;
import controleEstoque.Venda;

public class Funcionario {
	protected String nome;
	protected String login;
	protected String senha;
	protected Venda v;
	public void insere_produto(int cod,int qtde)
	{
		Livraria l;
		DescritorProduto p;
		l = Starter.livraria;
		p = l.descritor(cod);
		if(p==null){
			//mensagem de erro
		}
		else
		{
			this.v.addItem(p,qtde);
		}
	}
	public void finaliza_venda(){
		if(!Starter.livraria.existeRelatorio(Starter.semana)){
			Starter.livraria.novo_relatorio();
		}
		this.v.fecha_conta();
	}
	public void alta_estoque(int cod,int qtde){
		Starter.livraria.alta(cod, qtde);
	}
	public void relatorio_semanal(long semana){
		Starter.livraria.apresentaRelatorio(semana);
	}
	public void confirmar_impressao(boolean conf){}
	public void confirmar_pagamento(){
		this.v.pagamento_validado();
		Starter.livraria.addRelatorio(v);
	}
	public boolean verifica_senha(String senha){
		return false;
	}
	public void inicia_venda(){
		this.v = new Venda();
	}
	public String getNome(){
		return this.nome;
	}
	public Funcionario(){}
	public String getSenha() {
		return this.senha;
	}
	
}
