//CLASE CONEXIÓN

// PROYECTO FINAL

// JAIME DELGADILLO
// KEVIN CESPEDES

package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Conexión {

	Connection con=null;

	public Conexión()
	{
		try{
			System.out.println("Intentando conectar ....");
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Conectando a la base de datos........");
			con = DriverManager.getConnection("jdbc:mysql://localhost/cine", "root","");
			System.out.println("Conexión Establecida");
		
		}catch(SQLException ex){             
			
			System.out.println("Error de mysql");
		
		} catch (ClassNotFoundException e){
			
			e.printStackTrace();
		} catch (Exception e){
				
			System.out.println("Se produjo un error inesperado: " + e.getMessage());	
			}		
	}
	public void MostrarProductos() throws SQLException   //LOS PRODUCTOS SON LAS PELÍCULAS
	{
	
		PreparedStatement stat = con.prepareStatement("Select* from productos");
		
		ResultSet result = stat.executeQuery();
		while (result.next())
		{
			System.out.println(result.getString(1)+ " " + result.getString(2)+ " " +result.getString(3)+ " " + result.getString(4)+ " " +result.getString(5)+ " " +result.getString(6)+ " " +result.getString(7)+ " " +result.getString(8));
			
		}
	}
	public void MostrarEmp() throws SQLException
	{
	
		PreparedStatement stat = con.prepareStatement("Select* from empleado");
		
		ResultSet result = stat.executeQuery();
		while (result.next())
		{
			System.out.println(result.getString(1)+ " " + result.getString(2)+ " " +result.getString(3)+ " " + result.getString(4)+ " " +result.getString(5)+ " " +result.getString(6)+ " " +result.getString(7)+ " " +result.getString(8)+ " " +result.getString(9));
			
		}
	}
	public void MostrarClientes() throws SQLException
	{
	
		PreparedStatement stat = con.prepareStatement("Select * from cliente");
		
		ResultSet result = stat.executeQuery();
		while (result.next())
		{
			System.out.println(result.getString(1)+ " " + result.getString(2)+ " " +result.getString(3)+ " " + result.getString(4)+ " " +result.getString(5)+ " " +result.getString(6)+ " " +result.getString(7));
			
		}
	}
	
	
	public void MostrarVentas() throws SQLException
	{
	
		PreparedStatement stat = con.prepareStatement("Select * from venta");
		
		ResultSet result = stat.executeQuery();
		while (result.next())
		{
			System.out.println(result.getString(1)+ " " + result.getString(2)+ " " +result.getString(3)+ " " + result.getString(4)+ " " +result.getString(5));
			
		}
	}
	
	
	public void MostrarDetalleVentas() throws SQLException
	{
	
		PreparedStatement stat = con.prepareStatement("Select * from detalleventa");
		
		ResultSet result = stat.executeQuery();
		while (result.next())
		{
			System.out.println(result.getString(1)+ " " + result.getString(2)+ " " +result.getString(3)+ " " + result.getString(4));
			
		}
	}
	public void insertarNewVenta(int cv, String  fv, int nit , int cp, int ce) throws SQLException
	{
		String insertar="INSERT INTO venta (NomPelícula, CodigoVenta, fechaVenta, NIT, CODPEDIDO, CODEMP) VALUES(?,?,?,?,?)";
		PreparedStatement inse = con.prepareStatement(insertar);
	
	    inse.setInt(1,cv);
		inse.setString(2,fv);
		inse.setInt(3,nit);
		inse.setInt(4,cp);
		inse.setInt(5,ce);
		
		inse.executeUpdate();
		
	}
	
	public void insertarNewCliente(int cc, String nom, String ape, int tel, String direc, String ciu,  String empre) throws SQLException
	{
		String insertar="INSERT INTO cliente (NIT, NOMBRE, APELLIDO, TELEFONO, DIRECCION, CIUDAD, EMPRESA ) VALUES(?,?,?,?,?,?,?)";
		PreparedStatement inse = con.prepareStatement(insertar);
	
	    inse.setInt(1,cc);
	    inse.setString(2,nom);
		inse.setString(3,ape);
		inse.setInt(4,tel);
		inse.setString(5,direc);
		inse.setString(6,ciu);
		inse.setString(7,empre);
		

		inse.executeUpdate();
		
	}
	public void insertarNewDetalleVenta(int cd, int cp, int can, int cv, double pre) throws SQLException
	{
		String insertar="INSERT INTO detalleventa (CodDetalle, CodProd, CANTIDAD, CodigoVenta, PRECIO) VALUES(?,?,?,?,?)";
		PreparedStatement inse = con.prepareStatement(insertar);
	
	    inse.setInt(1,cd);
	    inse.setInt(2,cp);
		inse.setInt(3,can);
		inse.setInt(4,cv);
		inse.setDouble(5,pre);
		

		inse.executeUpdate();
		
	}
	public void insertarNewEmpleado(int ce, String nom, String ape, String direc, String cn, String cr, int tel, String trab, double sal ) throws SQLException
	{
		String insertar="INSERT INTO empleado (CODEMP ,NOMBRE ,APELLIDO ,DIRECCION ,ciudadNacimiento ,ciudadRecidencia ,TELEFONO ,TRABAJO ,SALARIO ) VALUES(?,?,?,?,?,?,?,?,?)";
		PreparedStatement inse = con.prepareStatement(insertar);
	
	    inse.setInt(1,ce);
	    inse.setString(2,nom);
		inse.setString(3,ape);
		inse.setString(4,direc);
		inse.setString(5,cn);
		inse.setString(6,cr);
		inse.setInt(7,tel);
		inse.setString(8,trab);
		inse.setDouble(9,sal);

		inse.executeUpdate();
		
	}
	public void insertarNewProducto(int cd, String nom, int cprov, int cc, double pre, String ff, String fv, int sk) throws SQLException
	{
		String insertar="INSERT INTO productos (CodProd, NOMBRE, CodProv, CodCat, PRECIO, FechaFabricacion, FechaVencimiento, STOCK) VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement inse = con.prepareStatement(insertar);
	
	    inse.setInt(1,cd);
	    inse.setString(2,nom);
		inse.setInt(3,cprov);
		inse.setInt(4,cc);
		inse.setDouble(5,pre);
		inse.setString(6,ff);
		inse.setString(7,fv);
		inse.setInt(8,sk);

		inse.executeUpdate();
		
	}
	public void insertarNewProveedor(int cp, String emp, String direc, String c, String p, int tel, String fx, String wb) throws SQLException
	{
		String insertar="INSERT INTO proveedores (CodProv ,EMPRESA ,DIRECCION ,CUIDAD ,PAIS ,TELEFONO ,fax ,web ) VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement inse = con.prepareStatement(insertar);
	
	    inse.setInt(1,cp);
	    inse.setString(2,emp);
		inse.setString(3,direc);
		inse.setString(4,c);
		inse.setString(5,p);
		inse.setInt(6,tel);
		inse.setString(7,fx);
		inse.setString(8,wb);

		inse.executeUpdate();
		
	}
	public void BorrarEmp(int codemp) throws SQLException
	{
		PreparedStatement stat  = con.prepareStatement("DELETE FROM empleado WHERE CODEMP = ?");
		stat.setInt(1,codemp);  

		stat.executeUpdate();
	}
	public void BorrarProd(int cp) throws SQLException
	{
		PreparedStatement stat  = con.prepareStatement("DELETE FROM productos WHERE CodProd = ?");
		stat.setInt(1,cp);
		
		stat.executeUpdate();
	}
	
}