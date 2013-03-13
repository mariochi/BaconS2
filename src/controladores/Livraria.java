package controladores;

import java.util.ArrayList;
import java.util.List;

import central.Starter;

import produtos.DescritorProduto;
import produtos.Livro;
import produtos.Revista;

import controleEstoque.Relatorio;
import controleEstoque.Venda;

import trabalhadores.Administrador;
import trabalhadores.Funcionario;

public class Livraria {
	private List<Funcionario> listaDeFuncionarios;
	private List<Relatorio> listaDeRelatorios;
	private List<DescritorProduto> listaDeProdutos;
	
	public void novo_relatorio(){
		Relatorio r = new Relatorio(Starter.semana);
	}
	public boolean existeRelatorio(long semana){
		for(Relatorio r:this.listaDeRelatorios)
		{
			if(r.getSemana()==semana)
			{
				return true;
			}
		}
		return false;
	}
	public DescritorProduto descritor(int cod){
		for(DescritorProduto d : this.listaDeProdutos){
			if(d.getCodigo() == cod){
				return d;
			}			
		}
		return null;
	}
	public void addRelatorio(Venda v){
		Relatorio r;
		r = this.listaDeRelatorios.get(this.listaDeRelatorios.size());
		r.add(v);
	}
	public void alta(int cod,int qtde){
		for(DescritorProduto p:this.listaDeProdutos){
			if(p.getCodigo()==cod){
				p.alta(qtde);
			}
		}
	}
	public void apresentaRelatorio(long semana){
		for(Relatorio r:this.listaDeRelatorios){
			if(r.getSemana()==semana){
				r.apresentar(this);
			}
		}
	}
	public void novo_livro(String nome,int cod,int preco,String autor,int ano,String editora){
		Livro l = new Livro(editora,preco,ano,nome,cod,autor);
		this.listaDeProdutos.add(l);
		
	}
	public void nova_revista(String nome,int cod,int preco,int mes,int ano,String editora){
		Revista r = new Revista(nome,cod,preco,editora,mes,ano);
		this.listaDeProdutos.add(r);
		
	}
	public void novo_caderno(int cod,int preco){
		
		this.listaDeProdutos.add(new DescritorProduto(cod,preco));
		
	}
	public void remover(int cod){
		for(DescritorProduto p : this.listaDeProdutos){
			if(p.getCodigo()==cod){
				this.listaDeProdutos.remove(p);
				
			}
		}
	}
	
	public void busca_nome(String nome){
		for(DescritorProduto p : this.listaDeProdutos){
			if((p.getClass().getName()=="Livro" || p.getClass().getName()=="Revista")){
				if (p.getNome() == nome){
					p.imprimir();
					//break;
				}
				
			}
		}
		
	}
	public DescritorProduto busca_num(int num){
		for(DescritorProduto p : this.listaDeProdutos){
			if(p.getCodigo()==num){
				p.imprimir();
				//break;
				return p;
			}
		}
		return null;
	}
	public boolean entra_login(String login, String senha){
		for(Funcionario f:this.listaDeFuncionarios){
			if(f.getLogin().equals(login))
			{
				if(f.getSenha().equals(senha))
				{
					return true;
				}
			}
		}
		return false;
	}
	public Funcionario logar(String login){
		
		for(Funcionario f:this.listaDeFuncionarios)
		{
			if(f.getLogin().equals(login))
				return f;
		}
		return null;
	}
	
	public Livraria(){
		this.listaDeFuncionarios = new ArrayList();
		Funcionario func = new Funcionario("Usuario","user","senha");
		Administrador adm = new Administrador("Administrador","admin","admin");
		this.listaDeFuncionarios.add(func);
		this.listaDeFuncionarios.add(adm);
		this.listaDeProdutos = new ArrayList();
		this.listaDeRelatorios = new ArrayList();
	}

}
