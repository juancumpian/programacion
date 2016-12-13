package vista;

import java.awt.BorderLayout; 
import java.awt.FlowLayout;




import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.sql.*;

public class Hacer_conexion extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Hacer_conexion dialog = new Hacer_conexion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Hacer_conexion() {
		setTitle("conexion");
		setBounds(100, 100, 450, 190);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		{
			JButton btnNewButton = new JButton("conectar");
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Principal.cargarDriver();
					Principal.inicializar_base_de_datos();
					try{
						
						Principal.s = Principal.conexion.createStatement();
						JOptionPane.showMessageDialog(null, "Se ha establecido conexion", "pipin", JOptionPane.INFORMATION_MESSAGE);
						dispose();
					}catch(SQLException ex){
						setTitle(ex.toString());
					}
				}
				
		
			});
			btnNewButton.setBounds(137, 45, 138, 34);
			contentPanel.add(btnNewButton);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				/*JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);*/
			}
		}
	}

}
