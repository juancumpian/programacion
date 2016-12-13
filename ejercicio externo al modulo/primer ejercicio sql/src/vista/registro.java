package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import controlador.operaciones;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class registro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textid;
	private JLabel lblId;
	private JTextField textnom;
	private JTextField apellido;
	private JTextField contrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			
			anadir_articulo dialog = new anadir_articulo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public registro() {
		setBounds(100, 100, 436, 403);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textid = new JTextField();
		textid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean esta=false;
				try{
					
					ResultSet ID= Principal.s.executeQuery("select ID from articulos where ID="+Integer.parseInt(textid.getText().toString()));
					if(ID.next()){
							esta=true;
							JOptionPane.showMessageDialog(null, "ya existe un objeto con esa ID");
					}
					if(!esta){

						textnom.setEnabled(true);
						apellido.setEnabled(true);
						contrasena.setEnabled(true);
					}
					
				}catch(Exception q){
					q.toString();
				}
				
				
			}
		});
		textid.setBounds(102, 34, 248, 35);
		contentPanel.add(textid);
		textid.setColumns(10);
		
		lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(10, 45, 82, 14);
		contentPanel.add(lblId);
		
			textnom = new JTextField();
			textnom.setEnabled(false);
			textnom.setColumns(10);
			textnom.setBounds(102, 80, 248, 35);
			contentPanel.add(textnom);
		
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
			lblNombre.setBounds(10, 91, 82, 14);
			contentPanel.add(lblNombre);
		
			apellido = new JTextField();
			apellido.setEnabled(false);
			apellido.setColumns(10);
			apellido.setBounds(102, 126, 248, 35);
			contentPanel.add(apellido);
		
			JLabel lblTipo = new JLabel("apellido");
			lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTipo.setBounds(10, 137, 82, 14);
			contentPanel.add(lblTipo);
		
			contrasena = new JTextField();
			contrasena.setEnabled(false);
			contrasena.setColumns(10);
			contrasena.setBounds(102, 172, 248, 35);
			contentPanel.add(contrasena);
		
			JLabel lblPrecio = new JLabel("contrasena");
			lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrecio.setBounds(10, 183, 82, 14);
			contentPanel.add(lblPrecio);
		
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				
				JButton btnOk = new JButton("OK");
				btnOk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						boolean pepe=false;
						if(textid.getText().isEmpty()|| textnom.getText().isEmpty() || apellido.getText().isEmpty() || contrasena.getText().isEmpty()){
							pepe=true;
							JOptionPane.showMessageDialog(null, "hay algun campo vacio");
						}
							if(!pepe){
								JOptionPane.showMessageDialog(null, "se ha añadido");
								operaciones.anadir_usuario(Integer.parseInt(textid.getText().toString()), textnom.getText().toString(),apellido.getText().toString() ,contrasena.getText().toString());
								dispose();
							}
					
				
					}
					
				});
				buttonPane.add(btnOk);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
	
			}