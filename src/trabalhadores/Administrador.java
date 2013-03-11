package trabalhadores;

import controladores.Livraria;
import central.Starter;

public class Administrador extends Funcionario{
	public void criar_livro(String nome,int cod,int preco,String autor,int ano,String editora){
		Starter.livraria.novo_livro(nome, cod, preco, autor, ano, editora);
	}
	public void criar_revista(String nome,int cod,int preco,String editora,int mes,int ano){
		Starter.livraria.nova_revista(nome, cod, preco, mes, ano, editora);
		
	}
	public void criar_caderno(int codigo,int preco){
		Starter.livraria.novo_caderno(codigo, preco);
	}
	public void remover_produto(int cod){
		Livraria l;
		l = Starter.livraria;
		l.remover(cod);
	}
}
