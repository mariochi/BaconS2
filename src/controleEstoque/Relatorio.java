package controleEstoque;

import java.util.List;

import controladores.Globais;
import controladores.Livraria;

import central.Starter;

public class Relatorio {
	private class TopVendidos{
		private int cod;
		private int qtde;
		public int getCod(){
			return this.cod;
		}
		public void aumentaQtde(int qtde){
			this.qtde+=qtde;
		}
		public int getQtde(){
			return this.qtde;
		}
		public TopVendidos(int cod,int qtde){
			this.cod = cod;
			this.qtde = qtde;
		}
	}
	private long semana;
	private List<Venda> listaDeVendas;
	public void add(Venda venda){
		this.listaDeVendas.add(venda);
	}
	public long getSemana(){
		return this.semana;
	}
	public void setSemana(){
		
	}
	public void apresentar(Livraria livraria){
		int acumulado = 0;
		int max;
		List<TopVendidos> listaTop = null;
		List<TopVendidos> listaTopGeral = null;
		boolean contem;
		for(Venda v:this.listaDeVendas)
		{
			acumulado += v.total_geral();
			for(ProdutoVendido p:v.getProdutos())
			{
				if(listaTop==null){
					listaTop.add(new TopVendidos(p.codigo(),p.getQtde()));
				}
				else
				{
					contem = false;
					for(TopVendidos tp:listaTop)
					{
						if(tp.getCod()==p.codigo())
						{
							tp.aumentaQtde(p.getQtde());
							contem = true;
						}
					}
					if(!contem)
					{
						listaTop.add(new TopVendidos(p.codigo(),p.getQtde()));
					}
				}
			}
			
		}
		while(!listaTop.isEmpty())
		{
			max = 0;
			for(TopVendidos tp:listaTop)
			{
				if(tp.getQtde()>max)
				{
					max=tp.getQtde();
				}
			}
			for(TopVendidos tp:listaTop)
			{
				if(tp.getQtde()==max){
					listaTopGeral.add(tp);
					listaTop.remove(tp);
				}
			}
		}
		for(int i = 0; i<=4;i++){
			livraria.descritor(listaTopGeral.get(i).getCod()).imprimir();
		}
		
	}
	public void imprimir(){
		System.out.println(this.toString());
		
	}

	public Relatorio(long semana){
		this.semana = semana;
	}
}
