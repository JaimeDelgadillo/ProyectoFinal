//CLASE GERENTE

// PROYECTO FINAL

// JAIME DELGADILLO
// KEVIN CESPEDES

package control;

import java.sql.SQLException;
import java.util.Scanner;

import entity.Conexión;


public class Gerente {
	
	int op;
	
	public void MenuPrincipalGerente()
	{
		
		@SuppressWarnings("resource") //INGE PUSIMOS ESO PORQUE AUNQUE CERRABAMOS EL SCANNER DABA ERROR
		Scanner leer=new Scanner(System.in);
		
		do
		{
			System.out.println("*****MENU Gerente*****");
			System.out.println("\n elija su opcion");
			System.out.println("1> Mostrar lista de Empleados ");
			System.out.println("2> Mostrar lista de Películas ");
			System.out.println("3> Mostrar lista de Clientes ");
			System.out.println("4> Mostrar lista de Ventas ");
			System.out.println("5> Mostrar lista de detalle de ventas ");
			System.out.println("6> Agregar Película ");
			System.out.println("7> Agregar Empleado ");
			System.out.println("8> Agregar Cliente" );
			System.out.println("9> Borrar Empleado ");
			System.out.println("10> Borrar Película ");
			System.out.println("11> salir");
			
			System.out.println("\n Elija su opcion");
			op=leer.nextInt();
			switch(op)
			{
			
			case 1:{
				Conexión c3=new Conexión();
				try {
					c3.MostrarEmp();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 2:{
				Conexión c3=new Conexión();
				try {
					c3.MostrarProductos();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			
			case 3:{
				Conexión c3=new Conexión();
				try {
					c3.MostrarClientes();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			
			case 4:{
				Conexión c3=new Conexión();
				try {
					c3.MostrarVentas();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			
			case 5:
			{
				Conexión c3=new Conexión();
				try {
					c3.MostrarDetalleVentas();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 6:{
				Conexión c3=new Conexión();
				
				System.out.println("codigo del producto=");
				int cd = leer.nextInt();
			 	System.out.println("nombre =");
			 	String nom = leer.next();
			 	System.out.println("codigo proveedor =");
			 	int cprov  = leer.nextInt();
			 	System.out.println("codigo categoria =");
			 	int cc  = leer.nextInt();
			 	System.out.println("precio =");
			 	double pre= leer.nextDouble(); 
			 	System.out.println("fecha de fabricacion =");
			 	String ff = leer.next(); 
			 	System.out.println(" fecha de vencimiento =");
			 	String fv = leer.next(); 
			 	System.out.println("Stock del producto =");
			 	int sk = leer.nextInt(); 
			 	
			 	try {
					c3.insertarNewProducto(cd, nom, cprov, cc, pre, ff, fv, sk);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 	 
			}break;
			case 7:{
				Conexión c3=new Conexión();
				
				System.out.println("codigo empleado=");
				int ce = leer.nextInt();
			 	System.out.println("nombre =");
			 	String nom = leer.next();
			 	System.out.println("apellido =");
			 	String ape  = leer.next();
			 	System.out.println("direccion =");
			 	String direc = leer.next();
			 	System.out.println("ciudad de nacimiento=");
			 	String cn= leer.next(); 
			 	System.out.println("ciudad de recidencia =");
			 	String cr = leer.next(); 
			 	System.out.println("telefono =");
				int tel = leer.nextInt();
			 	System.out.println("cargo/puesto =");
			 	String trab = leer.next(); 
			 	System.out.println("salario =");
			 	double sal = leer.nextDouble();
			 	
			 	try {
					c3.insertarNewEmpleado(ce, nom, ape, direc, cn, cr, tel, trab, sal);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 8:{
				Conexión c3=new Conexión();
				
				System.out.println("NIT=");
				int cc = leer.nextInt();
			 	System.out.println("nombre =");
			 	String nom = leer.next();
			 	System.out.println("apellido =");
			 	String ape  = leer.next();
			 	System.out.println("telefono =");
				int tel = leer.nextInt();
			 	System.out.println("direccion =");
			 	String direc = leer.next();
			 	System.out.println("ciudad =");
			 	String ciu= leer.next(); 
			 	System.out.println("empresa a la que pertenece=");
			 	String empre = leer.next(); 
			 	
			 	try {
					c3.insertarNewCliente(cc, nom, ape, tel, direc, ciu, empre);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			
			case 9:{
				Conexión c3=new Conexión();
				
				System.out.println("Ingrese el codigo del empleado: ");
				int codemp = leer.nextInt();
				
				try {
					c3.BorrarEmp(codemp);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 	
			}break;
			case 10:{
				Conexión c3=new Conexión();
				
				System.out.println("Ingrese el codigo del Producto: ");
				int cp = leer.nextInt();
				
				try {
					c3.BorrarProd(cp);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}break;
			
			case 11:{
				
				System.out.println("Adios y gracias");
				
			}break;
			
			default : System.out.println("no existe esa opcion");
			 
			}

		}while(op!=11);
	}


}