//CLASE PRINCIPAL

// PROYECTO FINAL

// JAIME DELGADILLO
// KEVIN CESPEDES


package view;

import java.util.Scanner;

import control.Empleado;
import control.Gerente;


// INGRESANDO EL C�DIGO CORRESPONDIENTE PARA CADA TRABAJADOR (USUARIO)
// LO LLEVAR� A SU MEN� CORRESPONDIENTE
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
		System.out.println("Antes de empezar\nRecuerde que para agregar un detalle de venta necesita el c�digo de venta \n"
				+ "y para la venta necesita un c�digo de pedido, se obliga el c�digo pedido por pol�tca de la empresa. \n"
				+ "Como tambien para la organizaci�n de la misma y la satisfacci�n de nuestros clientes. \n\nGRACIAS\n");
		 
		System.out.print("Ingrese su c�digo de trabajador: ");
		int log=leer.nextInt();
		System.out.print("Ingrese su contrase�a: ");
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