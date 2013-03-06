package central;

import java.util.List;

import produtos.DescritorProduto;

import controleEstoque.Relatorio;
import controleEstoque.Venda;

import trabalhadores.Funcionario;

public class Livraria {
	private List<Funcionario> listaDeFuncionarios;
	private List<Relatorio> listaDeRelatorios;
	private List<DescritorProduto> listaDeProdutos;
	
	public void novo_relatorio(){}
	public DescritorProduto descritor(int cod){
		DescritorProduto d = new DescritorProduto();
		return d;
	}
	public void addRelatorio(Venda v){}
	public void alta(int cod,int qtde){}
	public void apresentaRelatorio(int semana){}
	public void novo_livro(String nome,int cod,int preco,String autor,int ano,String editora){}
	public void nova_revista(String nome,int cod,int preco,int mes,int ano,String editora){}
	public void novo_caderno(int cod,int preco){}
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
	public void busca_num(int num){
		for(DescritorProduto p : this.listaDeProdutos){
			if(p.getCodigo()==num){
				p.imprimir();
				//break;
			}
	}	
	}
	public Livraria(){}

}
