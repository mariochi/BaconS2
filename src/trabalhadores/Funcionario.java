package trabalhadores;

import controleEstoque.Venda;

public class Funcionario {
	protected String nome;
	protected String login;
	protected String senha;
	protected Venda v;
	
	public void insere_produto(int cod,int qtde){}
	public void finaliza_venda(){}
	public void alta_estoque(int cod,int qtde){}
	public void relatorio_semanal(){}
	public void confirmar_impressao(boolean conf){}
	public boolean verifica_senha(String senha){
		return false;
	}
	public void inicia_venda(){}
	public Funcionario(){}
	
}
