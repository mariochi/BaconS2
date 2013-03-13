package controladores;

import central.Starter;

public class Logger {
	public boolean efetua_login(String nome,String senha){
		return Globais.livraria.entra_login(nome, senha);
	}
	public Logger(){}
}
