package DIedrAl_Project.presentacion;

import java.awt.Color;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Usuarios extends ColorPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5881613145077329549L;

	public Usuarios(int r, int g, int b){
		super(r, g, b);
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 1;
		c.gridy = 0;
		JLabel title = new JLabel("Usuarios");
		title.setFont(font);
		title.setForeground(Color.WHITE);
		add(title, c);
		
		JButton nuevo = new JButton("A�adir");
		nuevo.addActionListener((ae) -> {
			JFrame panel = new JFrame();
			
			panel.setSize(300, 400);
			panel.setVisible(true);
			panel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
		});
		c.gridx = 0;
		c.gridy = 1;
		add(nuevo, c);
		
		
		
		JButton buscar = new JButton("Buscar");
		buscar.addActionListener((ae) -> {
			JFrame panel = new JFrame();
			
			panel.setSize(300, 400);
			panel.setVisible(true);
			panel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
		});
		c.gridx = 2;
		c.gridy = 1;
		add(buscar, c);
	}
}
