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

public class anadir_al_carrito extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblId;
	private JLabel lblO;
	private JLabel lblNombre;
	private JTextField textid;
	private JTextField textnom;

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
	public anadir_al_carrito() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblId = new JLabel("ID");
		lblId.setBounds(41, 67, 46, 14);
		contentPanel.add(lblId);
		
		lblO = new JLabel("O");
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setBounds(178, 104, 46, 32);
		contentPanel.add(lblO);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(41, 163, 46, 14);
		contentPanel.add(lblNombre);
		
		textid = new JTextField();
		textid.setBounds(97, 51, 216, 42);
		contentPanel.add(textid);
		textid.setColumns(10);
		
		textnom = new JTextField();
		textnom.setColumns(10);
		textnom.setBounds(97, 147, 216, 42);
		contentPanel.add(textnom);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ResultSet ID;
						if(textid.getText().isEmpty() && textnom.getText().isEmpty()){
							JOptionPane.showMessageDialog(null, "rellena uno de los dos campos");
						}else if(!textid.getText().isEmpty() && textnom.getText().isEmpty()){
						try {
							ID = Principal.s.executeQuery("select * from articulos where ID="+Integer.parseInt(textid.getText().toString()));
							if(ID.next()){
								JOptionPane.showMessageDialog(null, "añadido");
								operaciones.anadir_al_carrito(ID.getInt(1), ID.getString(2), ID.getString(3), ID.getFloat(4), ID.getString(5));
							}else
								JOptionPane.showMessageDialog(null, "no existe");
						} catch (NumberFormatException | SQLException e1) {
							e1.printStackTrace();
						}
							}else if(textid.getText().isEmpty() && !textnom.getText().isEmpty()){
								ResultSet nombre;
								try {
									nombre = Principal.s.executeQuery("select * from articulos where nombre='"+textnom.getText()+"'");
									if(nombre.next()){
										JOptionPane.showMessageDialog(null, "añadido");
										operaciones.anadir_al_carrito(nombre.getInt(1), nombre.getString(2), nombre.getString(3), nombre.getFloat(4), nombre.getString(5));
									}else
										JOptionPane.showMessageDialog(null, "no existe");
								} catch (NumberFormatException | SQLException e1) {
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
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

