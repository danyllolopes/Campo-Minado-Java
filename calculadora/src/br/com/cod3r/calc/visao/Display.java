package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.cod3r.calc.modelo.Memoria;
import br.com.cod3r.calc.modelo.MemoriaObservador;



@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{

	private final JLabel label; 
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		add(label);
		setBackground(new Color(46, 49, 50));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 20));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
	}

	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}
	
}
