package trabalhadores;

import controladores.Globais;
import controladores.Livraria;
import central.Starter;

public class Administrador extends Funcionario{
	public Administrador(String nome, String login, String senha) {
		super(nome, login, senha);
		// TODO Auto-generated constructor stub
	}
	public void criar_livro(String nome,int cod,int preco,String autor,int ano,String editora){
		Globais.livraria.novo_livro(nome, cod, preco, autor, ano, editora);
	}
	public void criar_revista(String nome,int cod,int preco,String editora,int mes,int ano){
		Globais.livraria.nova_revista(nome, cod, preco, mes, ano, editora);
		
	}
	public void criar_caderno(int codigo,int preco){
		Globais.livraria.novo_caderno(codigo, preco);
	}
	public void remover_produto(int cod){
		Livraria l;
		l = Globais.livraria;
		l.remover(cod);
	}
}
