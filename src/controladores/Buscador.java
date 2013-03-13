package controladores;

import central.Starter;

public class Buscador {
	public void dados_busca(String nome){
		Livraria l;
		l = Globais.livraria;
		l.busca_nome(nome);
	}
	public void dados_busca(int num){
		Livraria l;
		l = Globais.livraria;
		l.busca_num(num);
	}
	public Buscador(){}
}
