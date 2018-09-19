//CLASE PRINCIPAL

// PROYECTO FINAL

// JAIME DELGADILLO
// KEVIN CESPEDES


package view;

import java.util.Scanner;

import control.Empleado;
import control.Gerente;


// INGRESANDO EL CÓDIGO CORRESPONDIENTE PARA CADA TRABAJADOR (USUARIO)
// LO LLEVARÁ A SU MENÚ CORRESPONDIENTE
public class Principal {

	public static void main(String[] args) {

		Principal p1=new Principal();
		p1.Ejecutar();
		
	
	
	}
		public void Ejecutar()
		{
		@SuppressWarnings("resource") //INGE PUSIMOS ESO PORQUE AUNQUE CERRABAMOS EL SCANNER DABA ERROR
		Scanner leer=new Scanner(System.in);
		System.out.println("PROYECTO FINAL\n");
		System.out.println("JAIME DELGADILLO");
		System.out.println("KEVIN CESPEDES\n");
		System.out.println("BIENVENIDO AL PROGRAMA\n");
		System.out.println("Antes de empezar\nRecuerde que para agregar un detalle de venta necesita el código de venta \n"
				+ "y para la venta necesita un código de pedido, se obliga el código pedido por polítca de la empresa. \n"
				+ "Como tambien para la organización de la misma y la satisfacción de nuestros clientes. \n\nGRACIAS\n");
		 
		System.out.print("Ingrese su código de trabajador: ");
		int log=leer.nextInt();
		System.out.print("Ingrese su contraseña: ");
		int pass=leer.nextInt();
		
		if (log == 333 && pass == 3333)
		{
			Gerente md=new Gerente();
			md.MenuPrincipalGerente();
		}
		else 
			System.out.println("no reconocido");
		
	
		
		
		if (log == 55555 && pass == 55555 )
		{
			Empleado mf=new Empleado();
			mf.MenuPrincipalEmpleado();
		}
		else
			System.out.println("no reconocido");
		}
}