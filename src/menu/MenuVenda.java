package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import produtos.DescritorProduto;
import trabalhadores.Funcionario;

import controladores.Livraria;
import controleEstoque.ProdutoVendido;
import controleEstoque.Venda;
import central.Starter;

public class MenuVenda {
	Scanner s = new Scanner( System.in );
	int i;
	
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  
	private String entrada1,entrada2;  
	public MenuVenda(Funcionario f,Venda pegaVenda, Livraria l) throws IOException {
		boolean term = false;
		DescritorProduto p;
		while(!term)
		{
		System.out.println("Digite o cod:");
		entrada1 = in.readLine();
		System.out.println("Digite a quantidade:");
		entrada2 = in.readLine();
		p = l.descritor(Integer.parseInt(entrada1));
		pegaVenda.addItem(p, Integer.parseInt(entrada2));
		System.out.println("digite 0 para encerrar");
		i = s.nextInt();
		if(i==0)
			term = true;
		}
		pegaVenda.fecha_conta();
		System.out.println("Digite 0 para confirmar pagamento");
		i = s.nextInt();
		if(i==0){
			f.confirmar_pagamento(l);
		}
		
	}

}
