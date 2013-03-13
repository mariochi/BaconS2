package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import produtos.DescritorProduto;

import central.Starter;

import controladores.Globais;
import controladores.Livraria;
import controladores.Logger;

import trabalhadores.Administrador;
import trabalhadores.Funcionario;

public class Menu {
	public Livraria livraria = new Livraria();
	private Funcionario f;
	public Globais global;
	private Logger logger;
	private controladores.Buscador buscador;
	
	public Menu() throws IOException
	{
	this.logger = new Logger();
	this.buscador = new controladores.Buscador();
	boolean encerrou = false;
	this.global = new Globais();
	Scanner s = new Scanner( System.in );
	Scanner s1 = new Scanner( System.in);
	Scanner s2 = new Scanner( System.in);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  
	String entrada1,entrada2,entrada3,entrada4,entrada5,entrada6; 
	int n;
	while(!encerrou)
	{
		System.out.println("Livraria");
		System.out.println("1- Iniciar uma nova Venda");
		System.out.println("2- Criar novo caderno");
		System.out.println("3- Criar nova Revista");
		System.out.println("4- Criar novo livro");
		System.out.println("5- Remover produto do catálogo");
		System.out.println("6- Imprimir Relatório");
		System.out.println("7- Buscar Produto");
		System.out.println("8- Alta no estoque");
		System.out.println("9- Encerrar");
		n = s.nextInt(); 
		if(n==1)
		{
			if(this.f == null)
			{
				System.out.println("Realize o Login:");
				System.out.println("Login:");
				entrada1 = in.readLine();
				System.out.println("Senha:");
				entrada2 = in.readLine();
				if(this.logger.efetua_login(entrada1, entrada2,this.livraria))
				{
					f = this.livraria.logar(entrada1);
				}
				
			}
			f.inicia_venda();
			MenuVenda menuVenda = new MenuVenda(f,f.pegaVenda(),this.livraria);
			
		
		}
		else if(n==2)
		{
			if(this.f == null)
			{
				System.out.println("Realize o Login:");
				System.out.println("Login:");
				entrada1 = in.readLine();
				System.out.println(entrada1);
				System.out.println("Senha:");
				entrada2 = in.readLine();
				if(this.logger.efetua_login(entrada1, entrada2,this.livraria))
				{
					f = global.getLivraria().logar(entrada1);
				}
				
			}
			if(f.getClass().getName()=="trabalhadores.Administrador")
			{
				System.out.println("Digite o código");
				entrada1 = in.readLine();
				System.out.println("Digite o preço em centavos");
				entrada2 = in.readLine();
				f.criar_caderno(Integer.parseInt(entrada1), Integer.parseInt(entrada2),this.livraria);
				
				
			}
			else
				System.out.println("Você não tem permissão para fazer essa operação");
		}
		else if(n==3)
		{
			if(this.f == null)
			{
				System.out.println("Realize o Login:");
				System.out.println("Login:");
				entrada1 = in.readLine();
				System.out.println("Senha:");
				entrada2 = in.readLine();
				if(this.logger.efetua_login(entrada1, entrada2,this.livraria))
				{
					f = global.getLivraria().logar(entrada1);
				}
				
			}
			if(f.getClass().getName()=="trabalhadores.Administrador")
			{
				Runtime.getRuntime().exec("cls");
				System.out.println("Digite o nome");
				entrada1 = in.readLine();
				System.out.println("Digite o código");
				entrada2 = in.readLine();
				System.out.println("Digite o preço em centavos");
				entrada3 = in.readLine();
				System.out.println("Digite a editora");
				entrada4 = in.readLine();
				System.out.println("Digite o mês");
				entrada5 = in.readLine();
				System.out.println("Digite o ano");
				entrada6 = in.readLine();
				f.criar_revista(entrada1,Integer.parseInt(entrada2),Integer.parseInt(entrada3),entrada4, Integer.parseInt(entrada5),Integer.parseInt(entrada6),this.livraria);
			}
			else
				System.out.println("Você não tem permissão para fazer essa operação");
		}
		else if(n==4)
		{
			if(this.f == null)
			{
				System.out.println("Realize o Login:");
				System.out.println("Login:");
				entrada1 = in.readLine();
				System.out.println("Senha:");
				entrada2 = in.readLine();
				if(this.logger.efetua_login(entrada1, entrada2,this.livraria))
				{
					f = global.getLivraria().logar(entrada1);
				}
				
			}
			if(f.getClass().getName()=="trabalhadores.Administrador")
			{
				System.out.println("Digite o nome");
				entrada1 = in.readLine();
				System.out.println("Digite o código");
				entrada2 = in.readLine();
				System.out.println("Digite o preço em centavos");
				entrada3 = in.readLine();
				System.out.println("Digite o autor");
				entrada4 = in.readLine();
				System.out.println("Digite o ano");
				entrada5 = in.readLine();
				System.out.println("Digite a editora");
				entrada6 = in.readLine();
				f.criar_livro(entrada1,Integer.parseInt(entrada2),Integer.parseInt(entrada3),entrada4,Integer.parseInt(entrada5),entrada6, this.livraria);
			}
			else
				System.out.println("Você não tem permissão para fazer essa operação");
		}
		else if(n ==5)
		{
			if(this.f == null)
			{
				System.out.println("Realize o Login:");
				System.out.println("Login:");
				entrada1 = in.readLine();
				System.out.println(entrada1);
				System.out.println("Senha:");
				entrada2 = in.readLine();
				if(this.logger.efetua_login(entrada1, entrada2,this.livraria))
				{
					f = global.getLivraria().logar(entrada1);
				}
				
			}
			if(f.getClass().getName()=="trabalhadores.Administrador")
			{
				System.out.println("Digite o código");
				entrada1 = in.readLine();
				f.remover_produto(Integer.parseInt(entrada1),this.livraria);	
			}
			else
				System.out.println("Você não tem permissão para fazer essa operação");
				
			
		}
		else if( n == 6)
		{
			f.confirmar_impressao(true,this.livraria);
		}
		else if(n==7)
		{
			System.out.println("Digite o nome do item:");
			entrada1 = in.readLine();
			this.buscador.dados_busca(entrada1, this.livraria);
			
		}
		else if(n==8)
		{
			System.out.println("Digite o produto:");
			int i = s2.nextInt();
			System.out.println("Digite a quantidade de produtos a adicionar:");
			int j = s1.nextInt();
			DescritorProduto dp = this.buscador.dados_busca(i, this.livraria);
			dp.alta(j);
			
		}
		else if(n==9)
			encerrou = true;
	}
}

}

