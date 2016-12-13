package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import controlador.operaciones;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class iniciar_sesion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblId;
	private JLabel lblNombre;
	private JTextField textnom;
	private JTextField textid;
	public static boolean er;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			eliminar_articulo dialog = new eliminar_articulo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public iniciar_sesion() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblId = new JLabel("nombre");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(10, 67, 77, 14);
		contentPanel.add(lblId);
		
		lblNombre = new JLabel("contrase\u00F1a");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(0, 163, 87, 14);
		contentPanel.add(lblNombre);
		
		textnom = new JTextField();
		textnom.setBounds(97, 51, 216, 42);
		contentPanel.add(textnom);
		textnom.setColumns(10);
		
		textid = new JTextField();
		textid.setColumns(10);
		textid.setBounds(97, 147, 216, 42);
		contentPanel.add(textid);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(textnom.getText().isEmpty() && textid.getText().isEmpty()){
							
							JOptionPane.showMessageDialog(null, "rellena los dos campos");
							
						}else if(!textnom.getText().isEmpty() && textid.getText().isEmpty()){
					
							JOptionPane.showMessageDialog(null, "rellena los dos campos");
							
							}else if(textnom.getText().isEmpty() && !textid.getText().isEmpty()){
								
								JOptionPane.showMessageDialog(null, "rellena los dos campos");
								
							}else if(!textnom.getText().isEmpty() && !textid.getText().isEmpty()){
								ResultSet contrasena;
								ResultSet nombre;
								try {
									
									contrasena = Principal.s.executeQuery("select * from usuarios where contraseña='"+textid.getText()+"'");
									
									if( contrasena.next()){
										nombre=Principal.s.executeQuery("select * from usuarios where nombre='"+textnom.getText()+"'");
										if(nombre.next()){
										JOptionPane.showMessageDialog(null,"bienvenido  "+textnom.getText());
										Principal.Anadircarrito.setEnabled(true);
										Principal.eliminarcarrito.setEnabled(true);
										Principal.listarcarrito.setEnabled(true);
										Principal.mntmGuardarCarrito.setEnabled(true);
										
										dispose();
										}
										else{
											JOptionPane.showMessageDialog(null, "no existe la contraseña ");
										}
									}else
										JOptionPane.showMessageDialog(null, "no existe el usuario ");
								} catch (NumberFormatException | SQLException e1) {
									System.out.println(e1);
									e1.printStackTrace();
								}
								
							}
							
						
					
			}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton registrar = new JButton("registrar");
				registrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						registro h=new registro();
						h.setLocationRelativeTo(null);
						h.setVisible(true);
					}
				});
				registrar.setActionCommand("Cancel");
				buttonPane.add(registrar);
			}
	
		}
	}

}
