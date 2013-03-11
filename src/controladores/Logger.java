package controladores;

import central.Starter;

public class Logger {
	public boolean efetua_login(String nome,String senha){
		return Starter.livraria.entra_login(nome, senha);
	}
	public Logger(){}
}
