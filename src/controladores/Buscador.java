package controladores;

import produtos.DescritorProduto;
import central.Starter;

public class Buscador {
	public static void dados_busca(String nome, Livraria l){
		l.busca_nome(nome);
	}
	public static DescritorProduto dados_busca(int num, Livraria l){
		return l.busca_num(num);
	}
	public Buscador(){}
}
