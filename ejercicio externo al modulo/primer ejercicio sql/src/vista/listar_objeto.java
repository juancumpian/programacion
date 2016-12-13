package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class listar_objeto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JScrollPane scrollPane;
	private JTable table;
	DefaultTableModel modelo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			listar_objeto dialog = new listar_objeto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public listar_objeto() {
		setBounds(100, 100, 568, 404);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		
		scrollPane.setBounds(10, 11, 532, 343);
		contentPanel.add(scrollPane);
		{
			
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					modificar h=new modificar();
					h.setLocationRelativeTo(null);
					h.setVisible(true);
				}
			});
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID", "Nombre", "Tipo", "Precio", "Empresa"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			modelo=(DefaultTableModel) table.getModel();
			try {
				ResultSet all= Principal.s.executeQuery("select * from articulos ");
				while(all.next()){
					Object[] fila={all.getInt(1),all.getString(2),all.getString(3), all.getFloat(4), all.getString(5)};
					modelo.addRow(fila);
				}
				
			} catch (SQLException e) {
				
				System.out.println(e.toString());
			}
			
			scrollPane.setViewportView(table);
		}
	}
}
