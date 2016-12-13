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

@SuppressWarnings("serial")
public class modificar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textid;
	private JLabel lblId;
	private JTextField textnom;
	private JTextField texttipo;
	private JTextField textprecio;
	private JTextField textempresa;

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
	public modificar() {
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
					
					ResultSet ID= Principal.s.executeQuery("select * from articulos where ID="+Integer.parseInt(textid.getText().toString()));
					if(ID.next()){
						
						textnom.setEnabled(true);
						texttipo.setEnabled(true);
						textempresa.setEnabled(true);
						textprecio.setEnabled(true);
						textnom.setText(String.valueOf(ID.getString("Nombre")));
						texttipo.setText(String.valueOf(ID.getString("Tipo")));
						textprecio.setText(String.valueOf(ID.getFloat("Precio")));
						textempresa.setText(String.valueOf(ID.getString("Empresa")));
							esta=true;
							
					}
					if(!esta){
						JOptionPane.showMessageDialog(null, "no existe un objeto con esa ID");
						
					}
					
				}catch(Exception q){
					q.toString();
				}
				
				
			}
		});
		textid.setBounds(79, 34, 248, 35);
		contentPanel.add(textid);
		textid.setColumns(10);
		
		lblId = new JLabel("ID");
		lblId.setBounds(23, 45, 57, 14);
		contentPanel.add(lblId);
		
			textnom = new JTextField();
			textnom.setEnabled(false);
			textnom.setColumns(10);
			textnom.setBounds(79, 80, 248, 35);
			contentPanel.add(textnom);
		
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(23, 91, 57, 14);
			contentPanel.add(lblNombre);
		
			texttipo = new JTextField();
			texttipo.setEnabled(false);
			texttipo.setColumns(10);
			texttipo.setBounds(79, 126, 248, 35);
			contentPanel.add(texttipo);
		
			JLabel lblTipo = new JLabel("Tipo");
			lblTipo.setBounds(23, 137, 57, 14);
			contentPanel.add(lblTipo);
		
			textprecio = new JTextField();
			textprecio.setEnabled(false);
			textprecio.setColumns(10);
			textprecio.setBounds(79, 172, 248, 35);
			contentPanel.add(textprecio);
		
			JLabel lblPrecio = new JLabel("Precio");
			lblPrecio.setBounds(23, 183, 57, 14);
			contentPanel.add(lblPrecio);
		
			textempresa = new JTextField();
			textempresa.setEnabled(false);
			textempresa.setColumns(10);
			textempresa.setBounds(79, 218, 248, 35);
			contentPanel.add(textempresa);
		
			JLabel lblEmpresa = new JLabel("Empresa");
			lblEmpresa.setBounds(23, 229, 57, 14);
			contentPanel.add(lblEmpresa);
		
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
						if(textid.getText().isEmpty()|| textnom.getText().isEmpty() || texttipo.getText().isEmpty() || textprecio.getText().isEmpty() || textempresa.getText().isEmpty()){
							pepe=true;
							JOptionPane.showMessageDialog(null, "hay algun campo vacio");
						}
							if(!pepe){
								//JOptionPane.showMessageDialog(null, "se ha modificado");
								operaciones.modificar(Integer.parseInt(textid.getText().toString()), textnom.getText().toString(),texttipo.getText().toString() , Float.parseFloat(textprecio.getText().toString()),textempresa.getText().toString());
								dispose();
							}
					
				
					}
					
				});
				buttonPane.add(btnOk);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
	
			}
