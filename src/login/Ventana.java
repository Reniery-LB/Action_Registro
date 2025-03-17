package login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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
		this.setTitle("DISEÑO");
		this.setVisible(true);
		this.setSize(1000,1000);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//PARA CAMBIAR EL ICONO DEL JFRAME
		ImageIcon icono = new ImageIcon("img/icono.png");
		Image imagen = icono.getImage();
		setIconImage(imagen);
		
		this.setResizable(true);
		this.setMaximumSize(new Dimension(1000,1000));
		this.setMinimumSize(new Dimension(400,400));
		
//		this.setLayout(new BorderLayout());
		
		this.add(this.inicio());
//		this.add(this.login());
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
		
		JMenuItem acceder = new JMenuItem("Acceder");
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
	
	public JPanel inicio() {
		JPanel mipanel = new JPanel();
		mipanel.setBounds(0, 0, 1000, 1000);
		mipanel.setBackground(Color.decode("#284B63"));
		mipanel.setLayout(null);
		
		JLabel titulo = new JLabel("INICIO");
		titulo.setBackground(Color.decode("#D9DFC6"));
		titulo.setOpaque(true);
		titulo.setFont(new Font("Britannic", Font.BOLD, 42));
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setForeground(Color.BLACK);
		titulo.setBounds(288, 10, 410, 93);
		mipanel.add(titulo);
		
		JLabel dirigirse = new JLabel("Dirigirse a");
		dirigirse.setForeground(Color.BLACK);
		dirigirse.setFont(new Font("Britannic", Font.BOLD, 32));
		dirigirse.setBounds(414, 113, 161, 93);
		mipanel.add(dirigirse);
		
		JButton iniciar_sesion = new JButton("INICIAR SESIÓN");
		iniciar_sesion.setForeground(new Color(255, 255, 255));
		iniciar_sesion.setBackground(Color.decode("#B9B28A"));
		iniciar_sesion.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		iniciar_sesion.setFont(new Font("Britannic", Font.BOLD, 18));
		iniciar_sesion.setBounds(229, 371, 183, 58);
		mipanel.add(iniciar_sesion);
		
		iniciar_sesion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("login");
			}
		});
		
		JButton registrarse = new JButton("REGISTRARSE");
		registrarse.setForeground(Color.WHITE);
		registrarse.setFont(new Font("Britannic", Font.BOLD, 18));
		registrarse.setBackground(Color.decode("#B9B28A"));
		registrarse.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		registrarse.setBounds(578, 371, 183, 58);
		mipanel.add(registrarse);
		
		registrarse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("registro");
			}
		});
		
		JButton recuperar = new JButton("     RECUPERACIÓN DE CUENTA     ");
		recuperar.setIcon(new ImageIcon("img/recuperacion.png"));
		recuperar.setForeground(Color.BLACK);
		recuperar.setFont(new Font("Britannic", Font.BOLD, 18));
		recuperar.setBackground(Color.decode("#F9F6E6"));
		recuperar.setHorizontalTextPosition(JLabel.RIGHT);
		recuperar.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		recuperar.setBounds(288, 552, 395, 58);
		mipanel.add(recuperar);
		
		recuperar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("recuperacion");
				
			}
		});
		
		JLabel icon_acceder = new JLabel(new ImageIcon("img/acceder.png"));
		icon_acceder.setBounds(216, 225, 183, 136);
		mipanel.add(icon_acceder);
		
		JLabel icon_registrarse = new JLabel(new ImageIcon("img/registrarse.png"));
		icon_registrarse.setBounds(578, 225, 183, 136);
		mipanel.add(icon_registrarse);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon("img/fondoInicio.jpg"));
		fondo.setBounds(0, 0, 1000, 1000);
		mipanel.add(fondo);
		
		return mipanel;
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
		JLabel titulo = new JLabel("ACCEDER");
		titulo.setSize(200, 30);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#D9DFC6")); 
		titulo.setLocation(165, 64);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,24));
		
		mipanel.add(titulo);
		//-------------------
		//NOMBRE
		JLabel nombreLabel = new JLabel("Nombre de Usuario");
		nombreLabel.setSize(150, 30);
		nombreLabel.setOpaque(true);
		nombreLabel.setBackground(Color.decode("#F9F6E6")); 
		nombreLabel.setLocation(110, 144);
		nombreLabel.setFont(fuente);
		
		mipanel.add(nombreLabel);
		
		JTextField nombreField = new JTextField();
		nombreField.setSize(300, 30);
		nombreField.setLocation(110, 184);
		nombreField.setFont(fuente);
		
		mipanel.add(nombreField);
		//-----------------------
		//CONTRASEÑA
		
		JLabel contraLabel = new JLabel("Contraseña");
		contraLabel.setSize(150, 30);
		contraLabel.setOpaque(true);  
		contraLabel.setBackground(Color.decode("#F9F6E6")); 
		contraLabel.setLocation(110, 234);
		contraLabel.setFont(fuente);
		
		mipanel.add(contraLabel);	
		
		JPasswordField contraField = new JPasswordField();
		contraField.setBounds(110, 274, 300, 30);
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
		check.setLocation(106, 294);
		check.setOpaque(false);
		
		mipanel.add(check);
		//----------------------------
		

		JButton olvido = new JButton("¿Olvidó su contraseña?");
		olvido.setSize(150, 20);
		olvido.setLocation(273, 306);
		olvido.setBorder(BorderFactory.createLineBorder(Color.decode("#EFF3EA")));
		olvido.setBackground(Color.decode("#EFF3EA"));
		olvido.setOpaque(false);
		olvido.setFont(new Font("Britannic",Font.BOLD,12));
		
		mipanel.add(olvido);
		
		JLabel linea = new JLabel("------------------------------------");
		linea.setSize(150, 20);
		linea.setForeground(Color.decode("#B9B28A"));
		linea.setLocation(275, 315);
		linea.setOpaque(true);
		mipanel.add(linea);
		
		olvido.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("recuperacion");
			}
		});
		//-----------------------------
		//BOTON
		JButton ingresar = new JButton("INGRESAR");
		ingresar.setSize(150, 40);
		ingresar.setLocation(186, 384);
		ingresar.setFont(new Font("Britannic",Font.BOLD,18));
		ingresar.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		ingresar.setOpaque(true);
		ingresar.setBackground(Color.decode("#FBFFE4"));
		
		ingresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Boolean flag1 = false, flag2 = false;
				String nombre = nombreField.getText();
				String password = new String(contraField.getPassword());
				
				if(nombre.equals("") && password.equals("")) {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					contraField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					JOptionPane.showMessageDialog(null, "Por favor, rellene ambos campos.","Campos Vaciós", JOptionPane.WARNING_MESSAGE);
					
				} else if (nombre.equals("")) {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					JOptionPane.showMessageDialog(null, "Rellene el campo de 'Nombre de Usuario'.", "Falta Nombre de Usuario", JOptionPane.WARNING_MESSAGE);
				} else if (password.equals("")) {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					contraField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					JOptionPane.showMessageDialog(null, "Rellene el campo 'Contraseña'.", "Falta Contraseña", JOptionPane.WARNING_MESSAGE);
				}
				
				else {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
				}
				

				
//				if(nombreField.getText().equals("")) {
//					nombreField.setBorder(BorderFactory.createLineBorder(Color.red,3));
////					JOptionPane.showMessageDialog(null, "INICIO DE SESIÓN FALLIDO", JOptionPane.ERROR_MESSAGE);
//				} else {
//					nombreField.setBorder(BorderFactory.createLineBorder(Color.green,3));
//					flag1=true;
//				}
//				
//				
//				if(password.equals("")) {
//					contraField.setBorder(BorderFactory.createLineBorder(Color.red,3));
//				} else {
//					contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
//					flag2=true;
//				}
//				
//				if(flag1 && flag2) {
//					
//					if(nombreField.getText().equals("relu_23@alu.mx")) {
//					
//						if(password.equals("password123")) {
//							JOptionPane.showMessageDialog(null, "Hola","Error", JOptionPane.WARNING_MESSAGE);
//						} else {
//							JOptionPane.showMessageDialog(null, "Ha ocurrido un error","Error", JOptionPane.ERROR_MESSAGE);
//						} 
//					}
//			}
		}
	});
		
		mipanel.add(ingresar);
		
		//BOTON
		JButton ir_registro = new JButton("IR A REGISTRO");
		ir_registro.setSize(200, 40);
		ir_registro.setLocation(160, 484);
		ir_registro.setFont(new Font("Britannic",Font.BOLD,18));
		ir_registro.setOpaque(true);
		ir_registro.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		ir_registro.setBackground(Color.decode("#B9B28A"));
		
		ir_registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("registro");
			}
		});
		
		mipanel.add(ir_registro);
		
		
		JButton regresar = new JButton();
		regresar.setIcon(new ImageIcon("img/regresar.png"));
		regresar.setOpaque(true);
		regresar.setBackground(new Color(185, 178, 138));
		regresar.setBounds(10, 10, 65, 40);
		mipanel.add(regresar);
		
		regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("menu");
			}
		});
		
		JLabel diseño = new JLabel();
		diseño.setIcon(new ImageIcon("img/diseño.jpg"));
		diseño.setBounds(540, -76, 450, 1000);
		mipanel.add(diseño);
		
		return mipanel;
	}
	
	public JPanel registro() {
		
		Font fuente = new Font("Britannic",Font.BOLD,16);
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#EFF3EA"));
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
		titulo.setBackground(Color.decode("#D9DFC6")); 
		titulo.setLocation(162, 62);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,24));
		
		mipanel.add(titulo);
		//-------------------
		//NOMBRE
		JLabel nombreLabel = new JLabel("Nombre de Usuario");
		nombreLabel.setSize(320, 35);
		nombreLabel.setOpaque(true);
		nombreLabel.setBackground(Color.decode("#FBFFE4")); 
		nombreLabel.setLocation(102, 132);
		nombreLabel.setHorizontalAlignment(JLabel.CENTER);
		nombreLabel.setFont(fuente);
		
		mipanel.add(nombreLabel);
		
		JTextField nombreField = new JTextField();
		nombreField.setSize(300, 30);
		nombreField.setLocation(112, 182);
		nombreField.setFont(fuente);
		
		mipanel.add(nombreField);
		//-----------------------
		//BIO
		
		JLabel bioLabel = new JLabel("BIO");
		bioLabel.setSize(320, 30);
		bioLabel.setLocation(102, 217);
		bioLabel.setHorizontalAlignment(JLabel.CENTER);
		bioLabel.setFont(fuente);
		
		mipanel.add(bioLabel);	
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(112, 252, 300, 70);
		mipanel.add(textArea);
		//--------------------------
		//PREFERENCIAS
		
		JLabel pref_label = new JLabel("PREFERENCIAS");
		pref_label.setBounds(102, 332, 320, 30);
		pref_label.setHorizontalAlignment(JLabel.CENTER);
		pref_label.setBorder(BorderFactory.createLineBorder(Color.decode("#FBFFE4"),4));		
		pref_label.setFont(fuente);
		
		mipanel.add(pref_label);
		
		JCheckBox dulces = new JCheckBox("Dulces");
		dulces.setBounds(112, 349, 150, 50);
		dulces.setFont(new Font("Britannic",Font.BOLD,14));
		dulces.setOpaque(false);
		
		mipanel.add(dulces);
		
		JCheckBox salado = new JCheckBox("Salado");
		salado.setBounds(212, 349, 150, 50);
		salado.setFont(new Font("Britannic",Font.BOLD,14));
		salado.setOpaque(false);
		
		mipanel.add(salado);
		
		JCheckBox saludable = new JCheckBox("Saludable");
		saludable.setBounds(312, 349, 150, 50);
		saludable.setFont(new Font("Britannic",Font.BOLD,14));
		saludable.setBorder(BorderFactory.createLineBorder(Color.RED, 8));		
		saludable.setOpaque(false);
		
		mipanel.add(saludable);
		//----------------------------
		//TERMINOS
		
		JLabel terminos = new JLabel("TÉRMINOS");
		terminos.setBounds(102, 392, 320, 30);
		terminos.setHorizontalAlignment(JLabel.CENTER);
		terminos.setBorder(BorderFactory.createLineBorder(Color.decode("#FBFFE4"),4));		
		terminos.setFont(fuente);
		
		mipanel.add(terminos);
		
		JRadioButton terms1 = new JRadioButton("Acepto los términos", true);
		terms1.setSize(240,40);
		terms1.setLocation(102,422);
		terms1.setOpaque(false);
		mipanel.add(terms1);
		
		JRadioButton terms2 = new JRadioButton("No acepto los términos");
		terms2.setSize(240,40);
		terms2.setLocation(272, 422);
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
		colonias.setLocation(102,462);
		colonias.setOpaque(true);
		mipanel.add(colonias);
		
		//----------------------------
		//BOTON
		JButton acceder = new JButton("CREAR CUENTA");
		acceder.setSize(320, 40);
		acceder.setLocation(102, 502);
		acceder.setBackground(Color.decode("#FBFFE4"));
		acceder.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		acceder.setFont(new Font("Britannic",Font.BOLD,16));
		//acceder.setBorder(BorderFactory.createLineBorder(Color.RED, 8));		

		acceder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nombre = nombreField.getText();
				String texto  = textArea.getText();
				
				//VALIDACION DE TÉRMINOS
				if (terms2.isSelected()) {
					JOptionPane.showMessageDialog(null, "Debes aceptar los términos y condiciones para continuar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				//VALIDACIÓN DE PREFERENCIAS
				if (!dulces.isSelected() && !salado.isSelected() && !saludable.isSelected()) {
					JOptionPane.showMessageDialog(null, "Por favor, selecciona al menos una preferencia.", "Advertencia", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				if (nombre.equals("") && texto.equals("")) {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					textArea.setBorder(BorderFactory.createLineBorder(Color.red,3));
					JOptionPane.showMessageDialog(null, "Por favor, rellene ambos campos.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
					return;
				} else if (nombre.equals("")) {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					textArea.setBorder(BorderFactory.createLineBorder(Color.green,3));
					JOptionPane.showMessageDialog(null, "Rellene el campo de 'Nombre de Usuario'.", "Falta Nombre de Usuario", JOptionPane.WARNING_MESSAGE);
					return;
				} else if (texto.equals("")) {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					textArea.setBorder(BorderFactory.createLineBorder(Color.red,3));
					JOptionPane.showMessageDialog(null, "Rellene el campo 'BIO'.", "Falta BIO", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				//SI TODO ES VALIDO
				nombreField.setBorder(BorderFactory.createLineBorder(Color.green,3));
				textArea.setBorder(BorderFactory.createLineBorder(Color.green,3));
				JOptionPane.showMessageDialog(null, "Registro exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		mipanel.add(acceder);
		
		//BOTON
		JButton ir_login = new JButton("IR A LOGIN");
		ir_login.setSize(320, 40);
		ir_login.setLocation(102, 602);
		ir_login.setBackground(Color.decode("#B9B28A"));
		ir_login.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		ir_login.setFont(new Font("Britannic",Font.BOLD,16));
		
		ir_login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("login");
			}
		});
		
		mipanel.add(ir_login);

		JLabel diseño = new JLabel();
		diseño.setIcon(new ImageIcon("img/diseño.jpg"));
		diseño.setBounds(540, -76, 450, 1000);
		mipanel.add(diseño);
		
		JButton regresar = new JButton();
		regresar.setIcon(new ImageIcon("img/regresar.png"));
		regresar.setOpaque(true);
		regresar.setBackground(Color.decode("#B9B28A"));
		regresar.setBounds(10, 10, 65, 40);
		mipanel.add(regresar);
		
		regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("menu");
			}
		});
		
		return mipanel;
	
	}
	//CUENTA:
	public JPanel recuperacion() {
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#EFF3EA"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		//TITULO
		JLabel titulo = new JLabel("RECUPERACIÓN DE CUENTA");
		titulo.setSize(600, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#D9DFC6")); 
		titulo.setLocation(186, 70);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,40));
		
		mipanel.add(titulo);
		
		JLabel email = new JLabel("Correo Electrónico");
		email.setFont(new Font("Britannic", Font.BOLD, 16));
		email.setBounds(254, 171, 223, 40);
		email.setBackground(Color.decode("#FBFFE4")); 
		email.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		email.setOpaque(true);
		mipanel.add(email);
		
		JTextField emailField = new JTextField();
		emailField.setBounds(254, 235, 482, 32);
		mipanel.add(emailField);
		emailField.setColumns(10);
		
		JLabel nueva_contra = new JLabel("Nueva Contraseña");
		nueva_contra.setOpaque(true);
		nueva_contra.setFont(new Font("Dialog", Font.BOLD, 16));
		nueva_contra.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		nueva_contra.setBackground(new Color(251, 255, 228));
		nueva_contra.setBounds(254, 294, 223, 40);
		mipanel.add(nueva_contra);
		
		JPasswordField nueva_contraField = new JPasswordField();
		nueva_contraField.setBounds(254, 356, 482, 32);
		mipanel.add(nueva_contraField);
		
		JLabel confirmar_contra = new JLabel("Confirmar Contraseña");
		confirmar_contra.setOpaque(true);
		confirmar_contra.setFont(new Font("Dialog", Font.BOLD, 16));
		confirmar_contra.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		confirmar_contra.setBackground(new Color(251, 255, 228));
		confirmar_contra.setBounds(254, 415, 223, 40);
		mipanel.add(confirmar_contra);
		
		JPasswordField confirmar_contraField = new JPasswordField();
		confirmar_contraField.setBounds(254, 477, 482, 32);
		mipanel.add(confirmar_contraField);
		
		JCheckBox captcha = new JCheckBox("Captcha");
		captcha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		captcha.setBounds(254, 515, 138, 32);
		mipanel.add(captcha);
		
		JButton restablecer = new JButton("RESTABLECER CONTRASEÑA");
		restablecer.setSize(280, 40);
		restablecer.setLocation(365, 553);
		restablecer.setHorizontalAlignment(JLabel.CENTER);
		restablecer.setBackground(Color.decode("#B9B28A"));
		restablecer.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		restablecer.setFont(new Font("Britannic",Font.BOLD,16));
		mipanel.add(restablecer);
		
		restablecer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String correo = emailField.getText();
				String contra = new String(nueva_contraField.getPassword());
				String confirmar = new String(confirmar_contraField.getPassword());
				
				if(correo.equals("") && contra.equals("") && confirmar.equals("")) {
					emailField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					nueva_contraField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					confirmar_contraField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
					return;
				} else if (correo.equals("")) {
					emailField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					nueva_contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					confirmar_contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					JOptionPane.showMessageDialog(null, "El campo 'Correo Electrónico' esta vacio.", "Falta Correo Electrónico", JOptionPane.WARNING_MESSAGE);
					return;
				} else if (contra.equals("")) {
					emailField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					nueva_contraField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					confirmar_contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					JOptionPane.showMessageDialog(null, "El campo 'Nueva Contraseña' esta vacio.", "Falta Nueva Contraseña", JOptionPane.WARNING_MESSAGE);
					return;
				} else if (confirmar.equals("")) {
					emailField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					nueva_contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					confirmar_contraField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					JOptionPane.showMessageDialog(null, "El campo 'Confirmar Contraseña' esta vacio.", "Falta Confirmar Contraseña", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				if(!captcha.isSelected()) {
					JOptionPane.showMessageDialog(null, "Debes hacer el captcha para continuar", "Advertencia", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				emailField.setBorder(BorderFactory.createLineBorder(Color.green,3));
				nueva_contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
				confirmar_contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
				JOptionPane.showMessageDialog(null, "Restablecimiento de contraseña exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		

		
		JLabel correo = new JLabel(new ImageIcon("img/correo.png"));
		correo.setBounds(426, 124, 183, 136);
		mipanel.add(correo);
		
		JLabel contra = new JLabel(new ImageIcon("img/contraseña.png"));
		contra.setBounds(426, 244, 183, 136);
		mipanel.add(contra);
		
		JLabel confirmar = new JLabel(new ImageIcon("img/confirmar.png"));
		confirmar.setBounds(426, 373, 183, 136);
		mipanel.add(confirmar);
		
		JButton regresar = new JButton();
		regresar.setIcon(new ImageIcon("img/regresar.png"));
		regresar.setOpaque(true);
		regresar.setBackground(Color.decode("#B9B28A"));
		regresar.setBounds(10, 10, 65, 40);
		mipanel.add(regresar);
		
		regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("menu");
			}
		});
		
		return mipanel;
	}
	//USUARIOS:
	
	public JPanel alta() {
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#EFF3EA"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		//TITULO
		JLabel titulo = new JLabel("ALTA DE USUARIO");
		titulo.setSize(600, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#D9DFC6")); 
		titulo.setLocation(186, 70);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,40));
		
		mipanel.add(titulo);
		
		JLabel email = new JLabel("Correo Electrónico");
		email.setFont(new Font("Britannic", Font.BOLD, 16));
		email.setBounds(23, 199, 223, 40);
		email.setBackground(Color.decode("#FBFFE4")); 
		email.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		email.setOpaque(true);
		mipanel.add(email);
		
		JTextField emailField = new JTextField();
		emailField.setBounds(23, 263, 265, 32);
		mipanel.add(emailField);
		emailField.setColumns(10);
		
		JLabel contra = new JLabel("Contraseña");
		contra.setOpaque(true);
		contra.setFont(new Font("Britannic", Font.BOLD, 16));
		contra.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		contra.setBackground(new Color(251, 255, 228));
		contra.setBounds(23, 322, 223, 40);
		mipanel.add(contra);
		
		JPasswordField nueva_contraField = new JPasswordField();
		nueva_contraField.setBounds(23, 384, 265, 32);
		mipanel.add(nueva_contraField);
		
		JLabel nombre = new JLabel("Nombre Completo");
		nombre.setOpaque(true);
		nombre.setFont(new Font("Britannic", Font.BOLD, 16));
		nombre.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		nombre.setBackground(new Color(251, 255, 228));
		nombre.setBounds(362, 199, 223, 40);
		mipanel.add(nombre);
		
		JTextField nombre_field = new JTextField();
		nombre_field.setColumns(10);
		nombre_field.setBounds(362, 263, 265, 32);
		mipanel.add(nombre_field);
		
		JLabel correo = new JLabel(new ImageIcon("img/correo.png"));
		correo.setBounds(183, 148, 183, 136);
		mipanel.add(correo);
		
		JLabel contra_img = new JLabel(new ImageIcon("img/contraseña.png"));
		contra_img.setBounds(183, 280, 183, 136);
		mipanel.add(contra_img);
		
		JLabel usuario = new JLabel("Nombre de Usuario");
		usuario.setOpaque(true);
		usuario.setFont(new Font("Britannic", Font.BOLD, 16));
		usuario.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		usuario.setBackground(new Color(251, 255, 228));
		usuario.setBounds(362, 322, 223, 40);
		mipanel.add(usuario);
		
		JTextField usuario_field = new JTextField();
		usuario_field.setColumns(10);
		usuario_field.setBounds(362, 384, 265, 32);
		mipanel.add(usuario_field);
		
		JLabel telefono = new JLabel("Teléfono (Opcional)");
		telefono.setOpaque(true);
		telefono.setFont(new Font("Britannic", Font.BOLD, 16));
		telefono.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		telefono.setBackground(new Color(251, 255, 228));
		telefono.setBounds(710, 199, 223, 40);
		mipanel.add(telefono);
		
		JTextField telefono_field = new JTextField();
		telefono_field.setColumns(10);
		telefono_field.setBounds(710, 263, 265, 32);
		mipanel.add(telefono_field);
		
		JLabel nacimiento = new JLabel("Fecha de Nacimiento");
		nacimiento.setOpaque(true);
		nacimiento.setFont(new Font("Britannic", Font.BOLD, 16));
		nacimiento.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		nacimiento.setBackground(new Color(251, 255, 228));
		nacimiento.setBounds(710, 322, 223, 40);
		mipanel.add(nacimiento);
		
		JComboBox dia = new JComboBox(new Object[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "..."});
		dia.setFont(new Font("Britannic", Font.PLAIN, 17));
		dia.setBounds(710, 384, 59, 32);
		mipanel.add(dia);
		
		JComboBox mes = new JComboBox(new Object[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"});
		mes.setFont(new Font("Dialog", Font.PLAIN, 17));
		mes.setBounds(779, 384, 59, 32);
		mipanel.add(mes);
		
		JComboBox año = new JComboBox(new Object[]{"2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997"});
		año.setFont(new Font("Dialog", Font.PLAIN, 17));
		año.setBounds(848, 384, 85, 32);
		mipanel.add(año);
		
		JButton aceptar = new JButton("APLICAR Y ACEPTAR");
		aceptar.setSize(310, 65);
		aceptar.setLocation(328, 549);
		aceptar.setHorizontalAlignment(JLabel.CENTER);
		aceptar.setBackground(Color.decode("#B9B28A"));
		aceptar.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		aceptar.setFont(new Font("Dialog", Font.BOLD, 18));
		mipanel.add(aceptar);
		
		aceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String correo = emailField.getText();
				String nombre = nombre_field.getText();
				String usuario = usuario_field.getText();
				String contra = new String(nueva_contraField.getPassword());
				
				if(correo.equals("") && nombre.equals("") && usuario.equals("") && contra.equals("")) {
					emailField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					nombre_field.setBorder(BorderFactory.createLineBorder(Color.red,3));
					usuario_field.setBorder(BorderFactory.createLineBorder(Color.red,3));
					nueva_contraField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
					return;
				} else if (correo.equals("")) {
					emailField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					nombre_field.setBorder(BorderFactory.createLineBorder(Color.green,3));
					usuario_field.setBorder(BorderFactory.createLineBorder(Color.green,3));
					nueva_contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					JOptionPane.showMessageDialog(null, "El campo 'Correo Electrónico' esta vacio.", "Falta Correo Electrónico", JOptionPane.WARNING_MESSAGE);
					return;
				} else if (nombre.equals("")) {
					emailField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					nombre_field.setBorder(BorderFactory.createLineBorder(Color.red,3));
					usuario_field.setBorder(BorderFactory.createLineBorder(Color.green,3));
					nueva_contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					JOptionPane.showMessageDialog(null, "El campo 'Nombre Completo' esta vacio.", "Falta Nombre Completo", JOptionPane.WARNING_MESSAGE);
					return;
				} else if (usuario.equals("")) {
					emailField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					nombre_field.setBorder(BorderFactory.createLineBorder(Color.green,3));
					usuario_field.setBorder(BorderFactory.createLineBorder(Color.red,3));
					nueva_contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					JOptionPane.showMessageDialog(null, "El campo 'Nombre de Usuario' esta vacio.", "Falta Nombre de Usuario", JOptionPane.WARNING_MESSAGE);
					return;
				} else if (contra.equals("")) {
					emailField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					nombre_field.setBorder(BorderFactory.createLineBorder(Color.green,3));
					usuario_field.setBorder(BorderFactory.createLineBorder(Color.green,3));
					nueva_contraField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					JOptionPane.showMessageDialog(null, "El campo 'Contraseña' esta vacio.", "Falta Contraseña", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				emailField.setBorder(BorderFactory.createLineBorder(Color.green,3));
				nombre_field.setBorder(BorderFactory.createLineBorder(Color.green,3));
				usuario_field.setBorder(BorderFactory.createLineBorder(Color.green,3));
				nueva_contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
				JOptionPane.showMessageDialog(null, "Se han aplicado los cambios exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		JButton regresar = new JButton();
		regresar.setIcon(new ImageIcon("img/regresar.png"));
		regresar.setOpaque(true);
		regresar.setBackground(Color.decode("#B9B28A"));
		regresar.setBounds(10, 10, 65, 40);
		mipanel.add(regresar);
		
		regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("menu");
			}
		});
		
		return mipanel;
	}
	
	public JPanel baja() {
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#EFF3EA"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		//TITULO
		JLabel titulo = new JLabel("BAJA DE USUARIO");
		titulo.setSize(600, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#D9DFC6")); 
		titulo.setLocation(186, 70);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,40));
		
		mipanel.add(titulo);
		
		JLabel email = new JLabel("Correo Electrónico o Nombre de Usuario");
		email.setFont(new Font("Britannic", Font.BOLD, 15));
		email.setBounds(328, 263, 310, 40);
		email.setBackground(Color.decode("#FBFFE4")); 
		email.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		email.setOpaque(true);
		mipanel.add(email);
		
		JTextField emailField = new JTextField();
		emailField.setBounds(328, 327, 310, 32);
		mipanel.add(emailField);
		emailField.setColumns(10);
		
		JLabel contra_alta = new JLabel("Contraseña Actual");
		contra_alta.setOpaque(true);
		contra_alta.setFont(new Font("Britannic", Font.BOLD, 16));
		contra_alta.setHorizontalAlignment(JLabel.CENTER);
		contra_alta.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		contra_alta.setBackground(new Color(251, 255, 228));
		contra_alta.setBounds(328, 386, 310, 40);
		mipanel.add(contra_alta);
		
		JPasswordField contraField = new JPasswordField();
		contraField.setBounds(328, 448, 310, 32);
		mipanel.add(contraField);
		
		JTextArea advertencia = new JTextArea();
		advertencia.setOpaque(true);
		advertencia.setFont(new Font("Dialog", Font.BOLD, 23));
		advertencia.setBackground(new Color(251, 255, 228));
		advertencia.setText("    ¿Estás seguro de que deseas eliminar tu cuenta?\r\n                Esta acción no se puede deshacer.");
		advertencia.setBounds(186, 156, 600, 83);
		mipanel.add(advertencia);
		
		JCheckBox confirmar = new JCheckBox("Confirmo que deseo eliminar mi cuenta");
		confirmar.setFont(new Font("Dialog", Font.BOLD, 14));
		confirmar.setBounds(331, 504, 301, 28);
		mipanel.add(confirmar);
		
		JButton eliminar = new JButton("ELIMINAR CUENTA");
		eliminar.setSize(310, 65);
		eliminar.setLocation(328, 549);
		eliminar.setHorizontalAlignment(JLabel.CENTER);
		eliminar.setBackground(Color.decode("#B9B28A"));
		eliminar.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		eliminar.setFont(new Font("Dialog", Font.BOLD, 18));
		mipanel.add(eliminar);
		
		eliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String correo = emailField.getText();
				String contra = new String(contraField.getPassword());
				
				if (correo.equals("") && contra.equals("")) {
					emailField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					contraField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					JOptionPane.showMessageDialog(null, "Por favor, rellene ambos campos.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
					return;
				} else if (correo.equals("")) {
					emailField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					JOptionPane.showMessageDialog(null, "El campo 'Correo Electrónico o Nombre de Usuario' esta vacio.", "Falta Correo Electrónico o Nombre de Usuario", JOptionPane.WARNING_MESSAGE);
					return;
				} else if (contra.equals("")) {
					emailField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					contraField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					JOptionPane.showMessageDialog(null, "El campo 'Contraseña Actual' esta vacio.", "Falta Contraseña Actual", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				if (!confirmar.isSelected()) {
					JOptionPane.showMessageDialog(null, "Seleccione que desea eliminar su cuenta para poder continuar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				emailField.setBorder(BorderFactory.createLineBorder(Color.green,3));
				contraField.setBorder(BorderFactory.createLineBorder(Color.green,3));
				JOptionPane.showMessageDialog(null, "La cuenta ha sido eliminada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		JButton regresar = new JButton();
		regresar.setIcon(new ImageIcon("img/regresar.png"));
		regresar.setOpaque(true);
		regresar.setBackground(Color.decode("#B9B28A"));
		regresar.setBounds(10, 10, 65, 40);
		mipanel.add(regresar);
		
		regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("menu");
			}
		});
		
		return mipanel;
	}
	
	public JPanel consultar() {
		
		Font fuente = new Font("Britannic",Font.BOLD,16);
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#EFF3EA"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		//---------------------------
		//TITULO	
		JLabel titulo = new JLabel("CONSULTA DE USUARIOS");
		titulo.setSize(600, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#D9DFC6")); 
		titulo.setLocation(186, 70);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,40));
		
		mipanel.add(titulo);
		//----------------------
		//LABEL
		JLabel Usuarios = new JLabel("USUARIOS");
		Usuarios.setSize(230, 50);
		Usuarios.setOpaque(true);
		Usuarios.setBackground(Color.decode("#B9B28A"));
		Usuarios.setLocation(70, 200);
		Usuarios.setHorizontalAlignment(JLabel.CENTER);
		Usuarios.setFont(new Font("Britannic",Font.BOLD,21));
		Usuarios.setForeground(Color.WHITE);
		
		mipanel.add(Usuarios);
		
		JLabel Num_Usuarios = new JLabel("97 ");
		Num_Usuarios.setSize(230, 50);
		Num_Usuarios.setOpaque(true);
		Num_Usuarios.setBackground(Color.decode("#B9B28A"));
		Num_Usuarios.setLocation(70, 240);
		Num_Usuarios.setHorizontalAlignment(JLabel.CENTER);
		Num_Usuarios.setFont(new Font("Britannic",Font.BOLD,21));
		Num_Usuarios.setForeground(Color.WHITE);
		
		mipanel.add(Num_Usuarios);
		
		//-----------------------------
		//BOTON
		JButton descargar = new JButton("Descargar");
		descargar.setSize(100, 30);
		descargar.setLocation(600, 350);
		descargar.setFont(new Font("Britannic",Font.BOLD,12));
		descargar.setBackground(Color.decode("#FBFFE4")); 
		descargar.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		descargar.setOpaque(true);
		
		mipanel.add(descargar);
		
		descargar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "¿Desea descargar la lista de usuarios?", "Descargar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//-----------------------------
		//BOTON
		JButton añadir = new JButton("Añadir");
		añadir.setSize(100, 30);
		añadir.setLocation(710, 350);
		añadir.setFont(new Font("Britannic",Font.BOLD,12));
		añadir.setBackground(Color.decode("#B9B28A"));
		añadir.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		añadir.setOpaque(true);
		
		mipanel.add(añadir);
		
		añadir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Añadir", JOptionPane.DEFAULT_OPTION);
				String apellido = JOptionPane.showInputDialog(null, "Apellido:", "Añadir", JOptionPane.DEFAULT_OPTION);
				int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad:", "Añadir", JOptionPane.DEFAULT_OPTION));
				int pizza = JOptionPane.showConfirmDialog(null, "¿Pizza?", "Añadir", JOptionPane.YES_NO_OPTION);
				
				String resultado1 = "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nPizza? Yes";
				String resultado2 = "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nPizza? No";
				if(pizza == 0) {
					JOptionPane.showMessageDialog(null, resultado1);
				}
				else {
					JOptionPane.showMessageDialog(null, resultado2);
				}

			}
		});
		
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
		tabla.setFont(new Font("Dialog", Font.PLAIN, 10));
		
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setSize(850, 300);
		scrollPane.setLocation(70,400);
		
		mipanel.add(scrollPane);
		
		JButton eliminar = new JButton("Eliminar");
		eliminar.setOpaque(true);
		eliminar.setFont(new Font("Dialog", Font.BOLD, 12));
		eliminar.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		eliminar.setBackground(new Color(185, 178, 138));
		eliminar.setBounds(820, 350, 100, 30);
		mipanel.add(eliminar);
		
		eliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int confirmar = JOptionPane.showConfirmDialog(null, "¿Esta seguro que deasea eliminar un usuario de la lista?", "Eliminar", JOptionPane.YES_NO_OPTION);
				
				if(confirmar == 0) {
					String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Eliminar", JOptionPane.DEFAULT_OPTION);
					String apellido = JOptionPane.showInputDialog(null, "Apellido:", "Eliminar", JOptionPane.DEFAULT_OPTION);
					int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad:", "Eliminar", JOptionPane.DEFAULT_OPTION));
					int pizza = JOptionPane.showConfirmDialog(null, "¿Pizza?", "Eliminar", JOptionPane.YES_NO_OPTION);
					
					String resultado1 = "USUARIO ELIMINADO "+ "\n\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nPizza? Yes";
					String resultado2 = "USUARIO ELIMINADO " + "\n\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nPizza? No";
					if(pizza == 0) {
						JOptionPane.showMessageDialog(null, resultado1);
					}
					else {
						JOptionPane.showMessageDialog(null, resultado2);
					}
				}
			}
		});
		
		JButton regresar = new JButton();
		regresar.setIcon(new ImageIcon("img/regresar.png"));
		regresar.setOpaque(true);
		regresar.setBackground(Color.decode("#B9B28A"));
		regresar.setBounds(10, 10, 65, 40);
		mipanel.add(regresar);
		
		regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("menu");
			}
		});
		
		return mipanel;
	}
	
	//AYUDA:
	public JPanel ayuda1() {
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#EFF3EA"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		//TITULO
		JLabel titulo = new JLabel("¿CÓMO CREAR UN USUARIO?");
		titulo.setSize(600, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#D9DFC6")); 
		titulo.setLocation(186, 70);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,40));
		
		mipanel.add(titulo);
		
		JButton ir_registro = new JButton("IR A REGISTRO");
		ir_registro.setSize(310, 65);
		ir_registro.setLocation(97, 660);
		ir_registro.setHorizontalAlignment(JLabel.CENTER);
		ir_registro.setBackground(Color.decode("#B9B28A"));
		ir_registro.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		ir_registro.setFont(new Font("Dialog", Font.BOLD, 18));
		mipanel.add(ir_registro);
		
		ir_registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("registro");
			}
		});
		
		JTextArea instrucciones = new JTextArea();
		instrucciones.setOpaque(true);
		instrucciones.setFont(new Font("Dialog", Font.BOLD, 19));
		instrucciones.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		instrucciones.setBackground(new Color(251, 255, 228));
		instrucciones.setText("                   INSTRUCCIONES\r\n\r\n1. Ir a la ventana de registro.\r\n\r\n2. Ingresar los datos requeridos:\r\nnombre, bio, preferencias, colonia.\r\n\r\n3. Aceptar los términos y condiciones.\r\n\r\n4. Dar clic en \"CREAR CUENTA.\"");
		instrucciones.setBounds(65, 168, 371, 482);
		mipanel.add(instrucciones);
		
		JLabel imagen = new JLabel();
		imagen.setIcon(new ImageIcon("img/registro.png"));
		imagen.setBounds(552, 168, 334, 562);
		imagen.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		mipanel.add(imagen);
		
		JButton regresar = new JButton();
		regresar.setIcon(new ImageIcon("img/regresar.png"));
		regresar.setOpaque(true);
		regresar.setBackground(Color.decode("#B9B28A"));
		regresar.setBounds(10, 10, 65, 40);
		mipanel.add(regresar);
		
		regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("menu");
			}
		});
		
		return mipanel;
	}
	
	public JPanel ayuda2() {
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#EFF3EA"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		//TITULO
		JLabel titulo = new JLabel("¿CÓMO ACCEDER AL SISTEMA?");
		titulo.setSize(600, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#D9DFC6")); 
		titulo.setLocation(186, 70);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Dialog", Font.BOLD, 35));
		
		mipanel.add(titulo);
		
		JButton ir_login = new JButton("IR A INICIAR SESIÓN");
		ir_login.setSize(310, 65);
		ir_login.setLocation(97, 660);
		ir_login.setHorizontalAlignment(JLabel.CENTER);
		ir_login.setBackground(Color.decode("#B9B28A"));
		ir_login.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		ir_login.setFont(new Font("Dialog", Font.BOLD, 18));
		mipanel.add(ir_login);
		
		ir_login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("login");
			}
		});
		
		JTextArea instrucciones = new JTextArea();
		instrucciones.setOpaque(true);
		instrucciones.setFont(new Font("Dialog", Font.BOLD, 19));
		instrucciones.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		instrucciones.setBackground(new Color(251, 255, 228));
		instrucciones.setText("                   INSTRUCCIONES\r\n\r\n1. Ir a la ventana de acceder.\r\n\r\n2. Ingresar los datos requeridos:\r\nnombre de usuario, contraseña.\r\n\r\n3. Dar clic en \"INGRESAR\".\r\n\r\nNota: En caso de que olvido su\r\ncontraseña puede dar clic en\r\n¿Olvidó su contraseña?.");
		instrucciones.setBounds(65, 168, 371, 482);
		mipanel.add(instrucciones);
		
		JLabel imagen = new JLabel();
		imagen.setIcon(new ImageIcon("img/login.png"));
		imagen.setBounds(514, 168, 404, 562);
		imagen.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		mipanel.add(imagen);
		
		JButton regresar = new JButton();
		regresar.setIcon(new ImageIcon("img/regresar.png"));
		regresar.setOpaque(true);
		regresar.setBackground(Color.decode("#B9B28A"));
		regresar.setBounds(10, 10, 65, 40);
		mipanel.add(regresar);
		
		regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("menu");
			}
		});
		
		return mipanel;
	}
	
	public JPanel ayuda3() {
		
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#EFF3EA"));
		mipanel.setOpaque(true);
		mipanel.setSize(1000,1000);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		//TITULO
		JLabel titulo = new JLabel("¿QUÉ PASA SI OLVIDÉ MI CONTRASEÑA?");
		titulo.setSize(600, 60);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#D9DFC6")); 
		titulo.setLocation(186, 70);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Dialog", Font.BOLD, 28));
		
		mipanel.add(titulo);
		
		JButton ir_recuperación = new JButton("IR A RECUPERACIÓN DE CUENTA");
		ir_recuperación.setSize(351, 65);
		ir_recuperación.setLocation(75, 660);
		ir_recuperación.setHorizontalAlignment(JLabel.CENTER);
		ir_recuperación.setBackground(Color.decode("#B9B28A"));
		ir_recuperación.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		ir_recuperación.setFont(new Font("Dialog", Font.BOLD, 18));
		mipanel.add(ir_recuperación);
		
		ir_recuperación.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("recuperacion");
			}
		});
		
		JTextArea instrucciones = new JTextArea();
		instrucciones.setOpaque(true);
		instrucciones.setFont(new Font("Dialog", Font.BOLD, 16));
		instrucciones.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		instrucciones.setBackground(new Color(251, 255, 228));
		instrucciones.setText("                   INSTRUCCIONES\r\n\r\n1. Ir a la ventana de recuperación de cuenta.\r\n\r\n2. Ingresar el correo asociado a la cuenta.\r\n\r\n3. Crear una nueva contraseña y\r\nconfirmarla.\r\n\r\n4. Completar el captcha de seguridad.\r\n\r\n5. Dar clic en \"RESTABLECER CONTRASEÑA\".\r\n\r\nNota: En caso de estar en la ventana\r\nacceder. puede dar clic en\r\n¿Olvidó su contraseña? y lo\r\nrediccionara a la misma ventana\r\nde recuperación de cuenta.");
		instrucciones.setBounds(65, 168, 371, 482);
		mipanel.add(instrucciones);
		
		JLabel imagen = new JLabel();
		imagen.setIcon(new ImageIcon("img/olvide.png"));
		imagen.setBounds(514, 168, 404, 562);
		imagen.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		mipanel.add(imagen);
		
		mipanel.add(titulo);
		
		JButton regresar = new JButton();
		regresar.setIcon(new ImageIcon("img/regresar.png"));
		regresar.setOpaque(true);
		regresar.setBackground(Color.decode("#B9B28A"));
		regresar.setBounds(10, 10, 65, 40);
		mipanel.add(regresar);
		
		regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("menu");
			}
		});
		
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
		
		//MENU
		if(route.equals("menu")) {
			this.add(this.inicio());
		}
		
		this.repaint();
		this.revalidate();
	}

}
