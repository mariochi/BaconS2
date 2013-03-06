package trabalhadores;

import central.Livraria;
import central.Starter;

public class Administrador extends Funcionario{
	public void criar_livro(){}
	public void criar_revista(){}
	public void criar_caderno(){}
	public void remover_produto(int cod){
		Livraria l;
		l = Starter.getLivraria();
		l.remover(cod);
	}
}
