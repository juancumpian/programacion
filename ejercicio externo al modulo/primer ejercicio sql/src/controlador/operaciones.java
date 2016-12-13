package controlador;
import java.sql.*;
import java.util.ArrayList;

import modelo.*;

import javax.swing.JOptionPane;

import vista.*;
public class operaciones {
	public static ArrayList <carrito_compra>  carrito=new ArrayList <carrito_compra>();

		//carrito.add(new carrito_compra());


	
	public static void anadir_al_carrito(int a, String b, String c, float d, String e){
		carrito.add(new carrito_compra(a,b,c,d,e));
	}
	
	public void eliminar_del_carrito(carrito_compra k){
		carrito.remove(k);
	}
	
	public static void anadir_usuario(int a, String b, String c,String e){
		try{
			Principal.s.executeUpdate("insert into usuarios values('"+a+"', '"+b+"', '"+c+"', '"+e+"') ");
			
		}catch(SQLException e23){
			
			e23.toString();
		}
	}
	public static void anadir(int a, String b, String c, float d, String e){
		
		try{
			Principal.s.executeUpdate("insert into articulos values('"+a+"', '"+b+"', '"+c+"', '"+d+"', '"+e+"') ");
			
		}catch(SQLException e23){
			
			e23.toString();
		}
		
	}
	
	public static void eliminarID(int a){
		try{
			Principal.s.executeUpdate("delete from articulos where ID="+a);
			
		}catch(SQLException e3){
			e3.toString();
		}
	}

	public static void eliminarnombre(String b){
		try{
			Principal.s.executeUpdate("delete from articulos where nombre='"+b+"'");
			
		}catch(SQLException e3){
			System.out.println(e3.toString());
		}
	}
	
	public static void modificar(int a, String b, String c, float d, String e){
		try{
			Principal.s.executeUpdate("update articulos set Nombre='"+b+"', Tipo='"+c+"', Precio="+d+", Empresa='"+e+"' where ID="+a);
			JOptionPane.showMessageDialog(null, "se ha modificado");
		}catch(SQLException e23){
			
			System.out.println(e23.toString());
		}
	}
}
