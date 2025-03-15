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
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		this.setTitle("Login");
		this.setVisible(true);
		this.setSize(1000,1000);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.setResizable(true);
		this.setMaximumSize(new Dimension(1000,1000));
		this.setMinimumSize(new Dimension(400,400));
		
//		this.setLayout(new BorderLayout());
		
		this.add(this.login());
//		this.add(this.registro(), BorderLayout.EAST);
		
		//BARRA
		JMenuBar barra = new JMenuBar();
		
		//USUARIOS
		JMenu menu_usuarios = new JMenu("Usuarios");
		barra.add(menu_usuarios);

		
		//para las opciones del menu
		
		JMenuItem alta = new JMenuItem("Alta");
		menu_usuarios.add(alta);
		
		alta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("alta");
				
			}
		});
		
		JMenuItem baja = new JMenuItem("Baja");
		menu_usuarios.add(baja);
		
		baja.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("baja");
				
			}
		});
		
		JMenuItem consultar = new JMenuItem("Consultar");
		menu_usuarios.add(consultar);
		
		consultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("consultar");
				
			}
		});
		
		//AYUDA
		JMenu menu_ayuda = new JMenu("Ayuda");
		barra.add(menu_ayuda);
		
		JMenuItem ayuda_1 = new JMenuItem("¿Cómo crear un usuario?");
		menu_ayuda.add(ayuda_1);
		
		ayuda_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("ayuda1");
				
			}
		});
		
		JMenuItem ayuda_2 = new JMenuItem("¿Cómo acceder al sistema?");
		menu_ayuda.add(ayuda_2);
		
		ayuda_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("ayuda2");
			}
		});
		
		JMenuItem ayuda_3 = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		menu_ayuda.add(ayuda_3);
		
		ayuda_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("ayuda3");
			}
		});
		
		//CUENTA
		JMenu menu_cuenta = new JMenu("Cuenta");
		barra.add(menu_cuenta);
		
		JMenuItem acceder = new JMenuItem("Login");
		menu_cuenta.add(acceder);	
		
		acceder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("login");
			}
		});
		
		JMenuItem registro = new JMenuItem("Registro");
		menu_cuenta.add(registro);
		
		registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("registro");
				
			}
		});
		
		
		JMenuItem recuperacion = new JMenuItem("Recuperacion de cuenta");
		menu_cuenta.add(recuperacion);
		
		recuperacion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("recuperacion");
				
			}
		});
		
		
		this.setJMenuBar(barra);
		this.repaint();
		this.revalidate();
	}
	
	public JPanel login()
	{
		
		Font fuente = new Font("Britannic",Font.BOLD,16);
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#EFF3EA"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
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
				
				if(flag1 && flag2) {
					
					if(nombreField.getText().equals("relu_23@alu.mx")) {
					
						if(password.equals("password123")) {
							JOptionPane.showMessageDialog(null, "Hola","Error", JOptionPane.WARNING_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "Ha ocurrido un error","Error", JOptionPane.ERROR_MESSAGE);
						} 
					}
			}
		}
	});
		
		mipanel.add(ingresar);
		
		//BOTON
		JButton ir_registro = new JButton("IR A REGISTRO");
		ir_registro.setSize(200, 40);
		ir_registro.setLocation(150, 450);
		ir_registro.setFont(new Font("Britannic",Font.BOLD,18));
		ir_registro.setOpaque(true);
		ir_registro.setBackground(Color.decode("#B9B28A"));
		
		ir_registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("registro");
			}
		});
		
		mipanel.add(ir_registro);
		
		return mipanel;
	}
	
	public JPanel registro() {
		
		Font fuente = new Font("Britannic",Font.BOLD,16);
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#A3D1C6"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
//		mipanel.setPreferredSize(new Dimension(500,800));
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
		
		//BOTON
		JButton ir_login = new JButton("IR A LOGIN");
		ir_login.setSize(320, 40);
		ir_login.setLocation(90, 570);
		ir_login.setBackground(Color.decode("#FBFFE4"));
		ir_login.setFont(new Font("Britannic",Font.BOLD,16));
		
		ir_login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("login");
			}
		});
		
		mipanel.add(ir_login);

		

		return mipanel;
	
	}
	//CUENTA:
	public JPanel recuperacion() {
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#FFEDFA"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		//TITULO
		JLabel titulo = new JLabel("RECUPERACIÓN DE CUENTA");
		titulo.setSize(600, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#FFB8E0")); 
		titulo.setLocation(180, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,40));
		
		mipanel.add(titulo);
		
		return mipanel;
	}
	//USUARIOS:
	
	public JPanel alta() {
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#80CBC4"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		//TITULO
		JLabel titulo = new JLabel("ALTA DE CUENTA");
		titulo.setSize(600, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#B4EBE6")); 
		titulo.setLocation(200, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,40));
		
		mipanel.add(titulo);
		
		return mipanel;
	}
	
	public JPanel baja() {
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#D5C7A3"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		//TITULO
		JLabel titulo = new JLabel("BAJA DE CUENTA");
		titulo.setSize(600, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#F2E2B1")); 
		titulo.setLocation(200, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,40));
		
		mipanel.add(titulo);
		
		return mipanel;
	}
	
	public JPanel consultar() {
		
		Font fuente = new Font("Britannic",Font.BOLD,16);
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#A3D1C6"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		//---------------------------
		//TITULO
		JLabel titulo = new JLabel("BIENVENIDO");
		titulo.setSize(250, 30);
		titulo.setOpaque(false);
		titulo.setBackground(Color.decode("#B3D8A8")); 
		titulo.setLocation(400,60);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,34));
		
		mipanel.add(titulo);
		//----------------------
		//LABEL
		JLabel Usuarios = new JLabel("USUARIOS");
		Usuarios.setSize(230, 50);
		Usuarios.setOpaque(true);
		Usuarios.setBackground(Color.BLACK); 
		Usuarios.setLocation(70, 200);
		Usuarios.setHorizontalAlignment(JLabel.CENTER);
		Usuarios.setFont(new Font("Britannic",Font.BOLD,21));
		Usuarios.setForeground(Color.WHITE);
		
		mipanel.add(Usuarios);
		
		JLabel Num_Usuarios = new JLabel("97");
		Num_Usuarios.setSize(230, 50);
		Num_Usuarios.setOpaque(true);
		Num_Usuarios.setBackground(Color.BLACK); 
		Num_Usuarios.setLocation(70, 240);
		Num_Usuarios.setHorizontalAlignment(JLabel.CENTER);
		Num_Usuarios.setFont(new Font("Britannic",Font.BOLD,21));
		Num_Usuarios.setForeground(Color.WHITE);
		
		mipanel.add(Num_Usuarios);
		
		//-----------------------------
		//BOTON
		JButton descargar = new JButton("Descargar");
		descargar.setSize(100, 30);
		descargar.setLocation(692, 350);
		descargar.setFont(new Font("Britannic",Font.BOLD,12));
		descargar.setBackground(Color.WHITE);
		descargar.setOpaque(true);
		
		mipanel.add(descargar);
		
		//-----------------------------
		//BOTON
		JButton añadir = new JButton("Añadir");
		añadir.setSize(100, 30);
		añadir.setLocation(818, 350);
		añadir.setFont(new Font("Britannic",Font.BOLD,12));
		añadir.setBackground(Color.WHITE);
		añadir.setOpaque(true);
		
		mipanel.add(añadir);
		
		String titles []= {"NOMBRE", "APELLIDO", "EDAD", " PIZZA?"};
		
		String data[][] = {
				{"Jonathan", "Soto"    ,  "1992", "Yes"  },
				{"Maria"   , "Lagunas" ,  "2013", "No"   },
				{"Keyra"   , "Ochoa"   ,  "2005", "Yes"  },
				{"Reniery" , "Lucero"  ,  "1986", "Yes"  },
				{"Claudia" , "Beltran" ,  "1985", "Yes"  },
				{"Raquel"  , "Lucero"  ,  "2011", "No"   },
				{"Jonathan", "Soto"    ,  "1992", "Yes"  },
				{"Maria"   , "Lagunas" ,  "2013", "No"   },
				{"Keyra"   , "Ochoa"   ,  "2005", "Yes"  },
				{"Reniery" , "Lucero"  ,  "1986", "Yes"  },
				{"Claudia" , "Beltran" ,  "1985", "Yes"  },
				{"Raquel"  , "Lucero"  ,  "2011", "No"   },
				{"Jonathan", "Soto"    ,  "1992", "Yes"  },
				{"Maria"   , "Lagunas" ,  "2013", "No"   },
				{"Keyra"   , "Ochoa"   ,  "2005", "Yes"  },
				{"Reniery" , "Lucero"  ,  "1986", "Yes"  },
				{"Claudia" , "Beltran" ,  "1985", "Yes"  },
				{"Raquel"  , "Lucero"  ,  "2011", "No"   },
				{"Jonathan", "Soto"    ,  "1992", "Yes"  },
				{"Maria"   , "Lagunas" ,  "2013", "No"   },
				{"Keyra"   , "Ochoa"   ,  "2005", "Yes"  },
				{"Reniery" , "Lucero"  ,  "1986", "Yes"  },
				{"Claudia" , "Beltran" ,  "1985", "Yes"  },
				{"Raquel"  , "Lucero"  ,  "2011", "No"   },
				{"Jonathan", "Soto"    ,  "1992", "Yes"  },
				{"Maria"   , "Lagunas" ,  "2013", "No"   },
				{"Keyra"   , "Ochoa"   ,  "2005", "Yes"  },
				{"Reniery" , "Lucero"  ,  "1986", "Yes"  },
				{"Claudia" , "Beltran" ,  "1985", "Yes"  },
				{"Raquel"  , "Lucero"  ,  "2011", "No"   },
				{"Jonathan", "Soto"    ,  "1992", "Yes"  },
				{"Maria"   , "Lagunas" ,  "2013", "No"   },
				{"Keyra"   , "Ochoa"   ,  "2005", "Yes"  },
				{"Reniery" , "Lucero"  ,  "1986", "Yes"  },
				{"Claudia" , "Beltran" ,  "1985", "Yes"  },
				{"Raquel"  , "Lucero"  ,  "2011", "No"   },
		};
		
		JTable tabla = new JTable (data,titles);
		
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setSize(850, 300);
		scrollPane.setLocation(70,400);
		
		mipanel.add(scrollPane);
		
		return mipanel;
	}
	
	//AYUDA:
	public JPanel ayuda1() {
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#A31D1D"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		//TITULO
		JLabel titulo = new JLabel("¿Cómo crear un usuario?");
		titulo.setSize(600, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#D84040")); 
		titulo.setLocation(200, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,20));
		
		mipanel.add(titulo);
		
		return mipanel;
	}
	
	public JPanel ayuda2() {
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#504B38"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		//TITULO
		JLabel titulo = new JLabel("¿Cómo acceder al sistema?");
		titulo.setSize(600, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#B9B28A")); 
		titulo.setLocation(200, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,20));
		
		mipanel.add(titulo);
		
		return mipanel;
	}
	
	public JPanel ayuda3() {
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#AA60C8"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		//TITULO
		JLabel titulo = new JLabel("¿Qué pasa si olvidé mi contraseña?");
		titulo.setSize(600, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#D69ADE")); 
		titulo.setLocation(200, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,20));
		
		mipanel.add(titulo);
		
		return mipanel;
	}
	
	
	public void router(String route) {
		
		this.getContentPane().removeAll();
		//this.getContentPane().remove(0);
		
		//CUENTA:
		if(route.equals("registro")) {
			this.add(this.registro());
		}
		
		if(route.equals("login")){
			this.add(this.login());
		}
		
		if(route.equals("recuperacion")) {
			this.add(this.recuperacion());
		}
		
		//USUARIOS:
		if(route.equals("alta")) {
			this.add(this.alta());
		}
		
		if(route.equals("baja")) {
			this.add(this.baja());
		}
		
		if(route.equals("consultar")) {
			this.add(this.consultar());
		}
		
		//AYUDA:
		if(route.equals("ayuda1")) {
			this.add(this.ayuda1());
		}
		
		if(route.equals("ayuda2")) {
			this.add(this.ayuda2());
		}
		
		if(route.equals("ayuda3")) {
			this.add(this.ayuda3());
		}
		
		this.repaint();
		this.revalidate();
	}

}
