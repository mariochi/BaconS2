package controladores;

public class Globais {
	
	private Livraria livraria;

	public Globais(){
		setLivraria(new Livraria());
		
	}

	public Livraria getLivraria() {
		return livraria;
	}

	public void setLivraria(Livraria livraria) {
		this.livraria = livraria;
	}
}
