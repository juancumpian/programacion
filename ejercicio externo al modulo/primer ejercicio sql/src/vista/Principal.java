package vista;

import java.awt.Desktop;
import java.awt.EventQueue; 
import java.net.URI;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import controlador.*;
import modelo.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Principal {

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu mnProduc;
	private JMenuItem mntmAadirProducto;
	private JMenuItem mntmEliminarProducto;
	private JMenu mnListar;
	private JMenuItem mntmProductos;
	public static Connection conexion;
	private JButton btnConexion;
	public static Statement s;
	private JMenuItem mntmSalir;
	private JMenuItem mntmModificarProducto;
	private JMenuItem mntmBuscar;
	private JMenu mnCarrito;
	public static JMenuItem Anadircarrito;
	public static JMenuItem eliminarcarrito;
	public static JMenuItem listarcarrito;
	private JButton btnPaginaWeb;
	public static JMenuItem mntmGuardarCarrito;
	/**
	 * Launch the application.
	 */
	public static void cargarDriver() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception ex) {
		ex.toString();
		}
		}
	
	 public static void inicializar_base_de_datos(){
		try {
			conexion=
			DriverManager.getConnection("jdbc:mysql://localhost/bdarticulos","root","");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setUndecorated(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent arg0) {
				Hacer_conexion h=new Hacer_conexion();
				h.setLocationRelativeTo(null);
				h.setVisible(true);
			}
		});
		frame.setBounds(100, 100, 598, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(Color.RED);
		frame.setJMenuBar(menuBar);
		
		mnProduc = new JMenu("productos");
		menuBar.add(mnProduc);
		
		mntmAadirProducto = new JMenuItem("a\u00F1adir producto");
		mntmAadirProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				anadir_articulo h=new anadir_articulo();
				h.setLocationRelativeTo(null);
				h.setVisible(true);
			}
		});
		mnProduc.add(mntmAadirProducto);
		
		mntmEliminarProducto = new JMenuItem("eliminar producto");
		mntmEliminarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				eliminar_articulo h=new eliminar_articulo();
				h.setLocationRelativeTo(null);
				h.setVisible(true);
			}
		});
		mnProduc.add(mntmEliminarProducto);
		
		mntmModificarProducto = new JMenuItem("modificar producto");
		mntmModificarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificar h=new modificar();
				h.setLocationRelativeTo(null);
				h.setVisible(true);
				
			}
		});
		mnProduc.add(mntmModificarProducto);
		
		mnListar = new JMenu("listar");
		menuBar.add(mnListar);
		
		mntmProductos = new JMenuItem("productos");
		mntmProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				listar_objeto h=new listar_objeto();
				h.setLocationRelativeTo(null);
				h.setVisible(true);
			}
		});
		mnListar.add(mntmProductos);
		
		mntmBuscar = new JMenuItem("buscar");
		mntmBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscar h=new buscar();
				h.setLocationRelativeTo(null);
				h.setVisible(true);
			}
		});
		mnListar.add(mntmBuscar);
		
		mntmSalir = new JMenuItem("salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					conexion.close();
					System.exit(0);
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			
			}
		});
		
		
		
		mnCarrito = new JMenu("carrito");
		
		mnCarrito.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				if(!Anadircarrito.isEnabled()){
				iniciar_sesion h=new iniciar_sesion();
				h.setLocationRelativeTo(null);
				h.setVisible(true);
			}
			}
			
		});
		
		menuBar.add(mnCarrito);
		
		Anadircarrito = new JMenuItem("anadir al carrito");
		Anadircarrito.setEnabled(false);
		Anadircarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				anadir_al_carrito h=new anadir_al_carrito();
				h.setLocationRelativeTo(null);
				h.setVisible(true);
			}
		});
		mnCarrito.add(Anadircarrito);
		
		eliminarcarrito = new JMenuItem("eliminar del carrito");
		eliminarcarrito.setEnabled(false);
		mnCarrito.add(eliminarcarrito);
		
		listarcarrito = new JMenuItem("listar el carrito");
		listarcarrito.setEnabled(false);
		mnCarrito.add(listarcarrito);
		
		mntmGuardarCarrito = new JMenuItem("guardar carrito");
		mntmGuardarCarrito.setEnabled(false);
		mnCarrito.add(mntmGuardarCarrito);
		menuBar.add(mntmSalir);
		frame.getContentPane().setLayout(null);
		
		btnPaginaWeb = new JButton("pagina web");
		btnPaginaWeb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					if (desktop.isSupported(Desktop.Action.BROWSE)) {
					desktop.browse(new URI("http://www.lidl.es/es/index.htm"));
					}
					}
					} catch (Exception e2) {
					e2.printStackTrace();
					}
				
			}
			
		});
		btnPaginaWeb.setBounds(394, 277, 178, 23);
		frame.getContentPane().add(btnPaginaWeb);
	
	}
}
