package controladores;

import central.Livraria;
import central.Starter;

public class Buscador {
	public void dados_busca(String nome){
		Livraria l;
		l = Starter.getLivraria();
		l.busca_nome(nome);
	}
	public void dados_busca(int num){
		Livraria l;
		l = Starter.getLivraria();
		l.busca_num(num);
	}
	public Buscador(){}
}
