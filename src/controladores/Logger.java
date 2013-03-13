package controladores;

import central.Starter;

public class Logger {
	public boolean efetua_login(String nome,String senha, Livraria livraria)
	{
		return livraria.entra_login(nome, senha);
	}
	public Logger()
	{
		
	}
}
