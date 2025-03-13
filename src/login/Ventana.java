package login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		this.setTitle("Login");
		this.setVisible(true);
		this.setSize(1000,1000);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.setResizable(true);
		this.setMaximumSize(new Dimension(1000,1000));
		this.setMinimumSize(new Dimension(400,400));
		
		this.setLayout(new BorderLayout());
		
		this.add(this.login(), BorderLayout.WEST);
		this.add(this.registro(), BorderLayout.EAST);
		this.repaint();
	}
	
	public JPanel login()
	{
		
		Font fuente = new Font("Britannic",Font.BOLD,16);
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#EFF3EA"));
		mipanel.setOpaque(true);
		mipanel.setSize(500,800);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		mipanel.setPreferredSize(new Dimension(500,800));
		//-----------------------------
		//TITULO
		JLabel titulo = new JLabel("LOGIN");
		titulo.setSize(200, 30);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#D9DFC6")); 
		titulo.setLocation(155, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,24));
		
		mipanel.add(titulo);
		//-------------------
		//NOMBRE
		JLabel nombreLabel = new JLabel("Nombre de Usuario");
		nombreLabel.setSize(150, 30);
		nombreLabel.setOpaque(true);
		nombreLabel.setBackground(Color.decode("#F9F6E6")); 
		nombreLabel.setLocation(100, 110);
		nombreLabel.setFont(fuente);
		
		mipanel.add(nombreLabel);
		
		JTextField nombreField = new JTextField();
		nombreField.setSize(300, 30);
		nombreField.setLocation(100, 150);
		nombreField.setFont(fuente);
		
		mipanel.add(nombreField);
		//-----------------------
		//CONTRASEÑA
		
		JLabel contraLabel = new JLabel("Contraseña");
		contraLabel.setSize(150, 30);
		contraLabel.setOpaque(true);  
		contraLabel.setBackground(Color.decode("#F9F6E6")); 
		contraLabel.setLocation(100, 200);
		contraLabel.setFont(fuente);
		
		mipanel.add(contraLabel);	
		
		JPasswordField contraField = new JPasswordField();
		contraField.setBounds(100, 240, 300, 30);
		contraField.setFont(fuente);
		
		mipanel.add(contraField);
		
		/*JTextField contraField = new JTextField();
		contraField.setSize(300, 30);
		contraField.setLocation(30, 240);
		contraField.setFont(fuente); 
		
		mipanel.add(contraField); */
		//--------------------------
		//CHECKBOX
		JCheckBox check = new JCheckBox("Recordarme");
		check.setSize(150, 50);
		check.setLocation(96, 260);
		check.setOpaque(false);
		
		mipanel.add(check);
		//----------------------------
		JLabel olvido = new JLabel("¿Olvidó su contraseña?");
		olvido.setSize(150, 30);
		olvido.setLocation(263, 270);
		olvido.setFont(new Font("Britannic",Font.BOLD,12));
		
		mipanel.add(olvido);
		//-----------------------------
		//BOTON
		JButton ingresar = new JButton("INGRESAR");
		ingresar.setSize(150, 40);
		ingresar.setLocation(176, 350);
		ingresar.setFont(new Font("Britannic",Font.BOLD,18));
		ingresar.setOpaque(true);
		ingresar.setBackground(Color.decode("#B9B28A"));
		
		ingresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Boolean flag1 = false, flag2 = false;
				
				if(nombreField.getText().equals("")) {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.red,3));
				} else {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					flag1=true;
				}
				
				String password = new String(contraField.getPassword());
				
				if(password.equals("")) {
					contraField.setBorder(BorderFactory.createLineBorder(Color.red,3));
				} else {
					contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					flag2=true;
				}
				
//				if(flag1 && flag2) {
//					
//					if(nombreField.getText().equals("@jsoto@sd")) {
//					
//						if(password.equals("password123"))
//					JOptionPane.showMessageDialog(null, "Hola","Error", JOptionPane.);
//				}
//				
			}
		});
		
		mipanel.add(ingresar);
		return mipanel;
	}
	
	public JPanel registro() {
		
		Font fuente = new Font("Britannic",Font.BOLD,16);
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#A3D1C6"));
		mipanel.setOpaque(true);
		mipanel.setSize(500,800);
		mipanel.setLocation(500,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		mipanel.setPreferredSize(new Dimension(500,800));
		//---------------------------
		//TITULO
		JLabel titulo = new JLabel("REGISTRO");
		titulo.setSize(200, 30);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#B3D8A8")); 
		titulo.setLocation(150, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,24));
		
		mipanel.add(titulo);
		//-------------------
		//NOMBRE
		JLabel nombreLabel = new JLabel("Nombre de Usuario");
		nombreLabel.setSize(320, 35);
		nombreLabel.setOpaque(true);
		nombreLabel.setBackground(Color.decode("#FBFFE4")); 
		nombreLabel.setLocation(90, 100);
		nombreLabel.setHorizontalAlignment(JLabel.CENTER);
		nombreLabel.setFont(fuente);
		
		mipanel.add(nombreLabel);
		
		JTextField nombreField = new JTextField();
		nombreField.setSize(300, 30);
		nombreField.setLocation(100, 150);
		nombreField.setFont(fuente);
		
		mipanel.add(nombreField);
		//-----------------------
		//BIO
		
		JLabel bioLabel = new JLabel("BIO");
		bioLabel.setSize(320, 30);
		bioLabel.setLocation(90, 185);
		bioLabel.setHorizontalAlignment(JLabel.CENTER);
		bioLabel.setFont(fuente);
		
		mipanel.add(bioLabel);	
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(100, 220, 300, 70);
		mipanel.add(textArea);
		//--------------------------
		//PREFERENCIAS
		
		JLabel pref_label = new JLabel("PREFERENCIAS");
		pref_label.setBounds(90, 300, 320, 30);
		pref_label.setHorizontalAlignment(JLabel.CENTER);
		pref_label.setBorder(BorderFactory.createLineBorder(Color.decode("#FBFFE4"),4));		
		pref_label.setFont(fuente);
		
		mipanel.add(pref_label);
		
		JCheckBox dulces = new JCheckBox("Dulces");
		dulces.setBounds(100, 317, 150, 50);
		dulces.setFont(new Font("Britannic",Font.BOLD,14));
		dulces.setOpaque(false);
		
		mipanel.add(dulces);
		
		JCheckBox salado = new JCheckBox("Salado");
		salado.setBounds(200, 317, 150, 50);
		salado.setFont(new Font("Britannic",Font.BOLD,14));
		salado.setOpaque(false);
		
		mipanel.add(salado);
		
		JCheckBox saludable = new JCheckBox("Saludable");
		saludable.setBounds(300, 317, 150, 50);
		saludable.setFont(new Font("Britannic",Font.BOLD,14));
		saludable.setBorder(BorderFactory.createLineBorder(Color.RED, 8));		
		saludable.setOpaque(false);
		
		mipanel.add(saludable);
		//----------------------------
		//TERMINOS
		
		JLabel terminos = new JLabel("TÉRMINOS");
		terminos.setBounds(90, 360, 320, 30);
		terminos.setHorizontalAlignment(JLabel.CENTER);
		terminos.setBorder(BorderFactory.createLineBorder(Color.decode("#FBFFE4"),4));		
		terminos.setFont(fuente);
		
		mipanel.add(terminos);
		
		JRadioButton terms1 = new JRadioButton("Acepto los términos", true);
		terms1.setSize(240,40);
		terms1.setLocation(90,390);
		terms1.setOpaque(false);
		mipanel.add(terms1);
		
		JRadioButton terms2 = new JRadioButton("No acepto los términos");
		terms2.setSize(240,40);
		terms2.setLocation(260, 390);
		terms2.setOpaque(false);
		mipanel.add(terms2);
		
		ButtonGroup terms_group = new ButtonGroup();
		terms_group.add(terms1);
		terms_group.add(terms2);
		//----------------------------
		//COLONIAS
		String dataset []= {"Camino Real", "Centro", "La Fuente", "Villas del Encanto", "Panteón"};
		JComboBox colonias = new JComboBox(dataset);
		colonias.setSize(320, 22);
		colonias.setLocation(90,430);
		colonias.setOpaque(true);
		mipanel.add(colonias);
		
		//----------------------------
		//BOTON
		JButton acceder = new JButton("CREAR CUENTA");
		acceder.setSize(320, 40);
		acceder.setLocation(90, 470);
		acceder.setBackground(Color.decode("#FBFFE4"));
		acceder.setFont(new Font("Britannic",Font.BOLD,16));
		//acceder.setBorder(BorderFactory.createLineBorder(Color.RED, 8));		

		acceder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(nombreField.getText().equals("")) {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.red,3));
				} else {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.green,3));
				}
				
				if(textArea.getText().equals("")) {
					textArea.setBorder(BorderFactory.createLineBorder(Color.red,3));
				} else {
					textArea.setBorder(BorderFactory.createLineBorder(Color.green,3));
				}
				
			}
		});
		
		
		mipanel.add(acceder);
		

		

		return mipanel;
	
	}

}
