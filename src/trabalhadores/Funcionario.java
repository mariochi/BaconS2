package trabalhadores;

import produtos.DescritorProduto;
import central.Starter;
import controladores.Globais;
import controladores.Livraria;
import controleEstoque.Venda;

public class Funcionario {
	protected String nome;
	protected String login;
	protected String senha;
	protected Venda v;
	public void insere_produto(int cod,int qtde,Livraria livraria)
	{
		Livraria l;
		DescritorProduto p;
		l = livraria;
		p = l.descritor(cod);
		if(p==null){
			//mensagem de erro
		}
		else
		{
			this.v.addItem(p,qtde);
		}
	}
	public void finaliza_venda(Livraria livraria){
		if(!livraria.existeRelatorio(Starter.semana)){
			livraria.novo_relatorio();
		}
		this.v.fecha_conta();
	}
	public void alta_estoque(int cod,int qtde, Livraria livraria){
		livraria.alta(cod, qtde);
	}
	public void relatorio_semanal(long semana, Livraria livraria){
		livraria.apresentaRelatorio(semana);
	}
	public void confirmar_impressao(boolean conf,Livraria livraria){
		if(conf)
			livraria.apresentaRelatorio(Starter.semana);
		
	}
	public void confirmar_pagamento(Livraria livraria){
		this.v.pagamento_validado();
		livraria.addRelatorio(v);
	}
	public boolean verifica_senha(String senha){
		if(this.senha == senha){
			return true;
		}
		return false;
	}
	public void inicia_venda(){
		this.v = new Venda();
	}
	public Venda pegaVenda(){
		return this.v;
	}
	public String getNome(){
		return this.nome;
	}
	public Funcionario(String nome,String login,String senha){
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	public String getSenha() {
		return this.senha;
	}
	public String getLogin() {
		// TODO Auto-generated method stub
		return this.login;
	}
	public void criar_livro(String nome,int cod,int preco,String autor,int ano,String editora,Livraria livraria){

	}
	public void criar_revista(String nome,int cod,int preco,String editora,int mes,int ano, Livraria livraria){
		
	}
	public void criar_caderno(int codigo,int preco, Livraria livraria){
		
	}
	public void remover_produto(int cod, Livraria livraria){
	}

	
}
