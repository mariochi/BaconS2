package produtos;

import java.util.ArrayList;
import java.util.List;

public class DescritorProduto {
	protected String nome;
	protected int codigo;
	protected int preco;
	protected List<Item> listaDeitem;
	
	public void alta(int qtde){
		Item x;
		for(int i = 1;i<=qtde;i++){
			x = new Item();
			this.listaDeitem.add(x);
		}
	}
	public void baixaEstoque(int qtde){
		for(int i = 1;i<=qtde;i++){
			listaDeitem.remove(0);
		}
	}
	public boolean verifica_estoque(int qtde){
		boolean teste;
		teste = this.listaDeitem.size()>=qtde;
		return teste;
	}
	public String getNome(){
		return this.nome;
	}
	public void imprimir(){
		//impressão cód e preço

		System.out.print(this.codigo);
		System.out.print("  ");
		System.out.println(this.preco);
	}
	
	public DescritorProduto(){
		
	}
	public DescritorProduto(int cod, int preco){
		this.codigo = cod;
		this.preco = preco;
		this.listaDeitem = new ArrayList();
		
	}
	public int getCodigo() {
		return this.codigo;
	}
	public int getPreco(){
		return this.preco;
	}
	

}
