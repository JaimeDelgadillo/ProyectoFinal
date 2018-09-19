//CLASE EMPLEADO

// PROYECTO FINAL

// JAIME DELGADILLO
// KEVIN CESPEDES

package control;

import java.sql.SQLException;
import java.util.Scanner;

import entity.Conexión;

public class Empleado {
	int op;
	public void MenuPrincipalEmpleado()
	{
		
		@SuppressWarnings("resource") //INGE PUSIMOS ESO PORQUE AUNQUE CERRABAMOS EL SCANNER DABA ERROR
		Scanner leer=new Scanner(System.in);
		
		do
		{
			System.out.println("*****MENU Empleado*****");
			System.out.println("\n Elija su opcion");
			System.out.println("1> Mostrar lista de Películas ");	
			System.out.println("2> Mostrar lista de Clientes ");			
			System.out.println("3> Mostrar lista de Ventas ");
			System.out.println("4> Mostrar lista de Detalle de Ventas ");	
			System.out.println("5> Agregar Venta ");
			System.out.println("6> Agregar Detalle de Ventas ");
			System.out.println("7> Salir");
			
			System.out.println("\n Elija su opcion");
			op=leer.nextInt();
			switch(op)
			{
			case 1:{
				Conexión c1=new Conexión();
				try {
					c1.MostrarProductos();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 2:{
				Conexión c1=new Conexión();
				try {
					c1.MostrarClientes();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 3 :{
				Conexión c1=new Conexión();
				try {
					c1.MostrarVentas();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 4 : {
				Conexión c1=new Conexión();
				try {
					c1.MostrarDetalleVentas();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 5: {
				Conexión c1=new Conexión();
				
				System.out.println("Codigo de la venta =");
			 	int  cv = leer.nextInt();
			 	System.out.println("fecha de venta=");
			 	String  fv = leer.next();
			 	System.out.println(" NIT =");
			 	int  nit  = leer.nextInt();
			 	System.out.println(" Codigo Pedido =");
			 	int   cp = leer.nextInt();
			 	System.out.println(" Codigo Empleado =");
			 	int  ce = leer.nextInt();
			 	
			 	try {
					c1.insertarNewVenta(cv, fv, nit, cp, ce);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 6:{
				Conexión c1=new Conexión();
								
				System.out.println("Código detalle de ventas=");
				int cd = leer.nextInt();
				System.out.println("Código de Película=");
				int cp = leer.nextInt();
				System.out.println("Cantidad de entradas a comprar=");
				int can = leer.nextInt();
				System.out.println("codigo venta=");
				int cv = leer.nextInt();
				System.out.println("precio de la entrada=");
				double pre = leer.nextDouble();
				
				System.out.println("total a pagar = " + can*pre);
				
				try {
					c1.insertarNewDetalleVenta(cd, cp, can, cv, pre);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}break;
			case 7:
				{
					
					System.out.println("Adios y gracias");
					
				}break;
				
				
				default : System.out.println("No existe esa opcion");
				
			}
		}while(op!=7);
	}
}