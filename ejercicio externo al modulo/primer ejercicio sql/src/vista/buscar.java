package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class buscar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JComboBox comboBox;
	private JTextField textField;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			buscar dialog = new buscar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public buscar() {
		setBounds(100, 100, 440, 214);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		comboBox = new JComboBox();
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "Nombre", "Tipo", "Empresa"}));
		comboBox.setBounds(126, 11, 155, 20);
		contentPanel.add(comboBox);
		
		
		
		label = new JLabel("");
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(Color.WHITE);
		label.setBounds(10, 116, 404, 33);
		contentPanel.add(label);
			
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ID;
				Float Precio;
				String nombre, empresa, tipo;
				boolean esta=false;
				if(comboBox.getSelectedItem().toString().equalsIgnoreCase("ID")){
					ID=Integer.parseInt(textField.getText());
					try {
						ResultSet p= Principal.s.executeQuery("select * from articulos where ID="+ID);
						if(p.next()){
							esta=true;
							label.setText(p.getInt(1)+"  "+p.getString(2)+"  "+p.getString(3)+"  "+p.getFloat(4)+"  "+p.getString(5));
						}
						
						if(!esta){
							label.setText("no existe");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					
				}else if(comboBox.getSelectedItem().toString().equalsIgnoreCase("nombre")){
					nombre=textField.getText();
					try {
						ResultSet p= Principal.s.executeQuery("select * from articulos where Nombre='"+nombre+"' ");
						if(p.next()){
							esta=true;
							label.setText(p.getInt(1)+"  "+p.getString(2)+"  "+p.getString(3)+"  "+p.getFloat(4)+"  "+p.getString(5));
						}
						if(!esta){
							label.setText("no existe");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}else if(comboBox.getSelectedItem().toString().equalsIgnoreCase("Tipo")){
					tipo=textField.getText();
					try {
						ResultSet p= Principal.s.executeQuery("select * from articulos where Tipo='"+tipo+"'");
						if(p.next()){
							esta=true;
							label.setText(p.getInt(1)+"  "+p.getString(2)+"  "+p.getString(3)+"  "+p.getFloat(4)+"  "+p.getString(5));
						}
						if(!esta){
							label.setText("no existe");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}else if(comboBox.getSelectedItem().toString().equalsIgnoreCase("Empresa")){
					empresa=textField.getText();
					try {
						ResultSet p= Principal.s.executeQuery("select * from articulos where Empresa='"+empresa+"'");
						if(p.next()){
							esta=true;
							label.setText(p.getInt(1)+"  "+p.getString(2)+"  "+p.getString(3)+"  "+p.getFloat(4)+"  "+p.getString(5));
						}
						if(!esta){
							label.setText("no existe");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}	
				}
			}
		});
		textField.setBackground(Color.WHITE);
		textField.setBounds(126, 56, 155, 33);
		contentPanel.add(textField);
		textField.setColumns(10);
		
	}
}
