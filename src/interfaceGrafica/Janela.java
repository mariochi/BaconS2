package interfaceGrafica;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import java.awt.event.*;

public class Janela extends JFrame implements ActionListener{
	JLabel label1;
	JPanel pane = new JPanel();
	JToolBar toolbar = new JToolBar();
	JButton buscaProduto = new JButton("Busca Produto");
	JButton altaEstoque = new JButton("Alta de Estoque");
	JButton novaVenda = new JButton("Nova Venda");
	JButton novoProduto = new JButton("Nova Produto");
	JButton removerProduto = new JButton("Remover Produto");
	JButton emitirRelatorio = new JButton("Emitir Relatório");

	public Janela()
	{
		super("Livraria");
		
		
		buscaProduto.addActionListener(this);
		altaEstoque.addActionListener(this);
		novaVenda.addActionListener(this);
		novoProduto.addActionListener(this);
		removerProduto.addActionListener(this);
		emitirRelatorio.addActionListener(this);
		
		
		toolbar.add(buscaProduto);
		toolbar.add(altaEstoque);
		toolbar.add(novaVenda);
		toolbar.add(novoProduto);
		toolbar.add(removerProduto);
		toolbar.add(emitirRelatorio);
		
		pane.setLayout(new BorderLayout());
		this.setContentPane(pane); //define um container para o JFrame
		this.setSize(720, 600);
		this.setVisible(true);
		pane.add(BorderLayout.NORTH, toolbar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buscaProduto){
			this.pane.add(new JLabel("Funciona"));
		}
		else if(e.getSource()== altaEstoque){}
		else if(e.getSource()== novaVenda){}
		else if(e.getSource()== novoProduto){}
		else if(e.getSource()== removerProduto){}
		else if(e.getSource()== emitirRelatorio){}
			/*else if (e.getSource() == buttonCancelar)
			System.exit(0);
			}*/
		
	}
}