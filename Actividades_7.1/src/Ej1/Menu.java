package Ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import Utiles.Salieri;

public final class Menu {
	Salieri ex = new Salieri();
	List <Cuenta> h=new ArrayList<Cuenta>();
	int opcion ;
	
 public void Vmenu() {
	 int contador=0;
	 do {
	 System.out.println("Selecciona una opción:");
	 System.out.println("1-Crear Cuenta corriente");
	 System.out.println("2-Crear Cuenta ahorro");
	 System.out.println("3-Acceder a una cuenta");
	 System.out.println("4-Salir");
	 opcion= ex.controlaentero();
	switch(opcion) {
	case 1:
		h.add(contador,new CuentaCorriente(contador,new Persona(ex.controlaStringSt("Introduzca el nombre del cliente"),ex.controlaStringSt("Introduzca los apellidos del cliente"),ex.controlaNIF())));
		contador++;
		break;
	case 2:
		h.add(contador,new CuentaAhorro(contador,new Persona(ex.controlaStringSt("Introduzca el nombre del cliente"),ex.controlaStringSt("Introduzca los apellidos del cliente"),ex.controlaNIF())));
		contador++;
		break;
	case 3:
		int opc = ex.controlaenteroSt("Introduzca el numero de cuenta");
		try {
			
			
			Cuenta c = h.get(opc);
			do {
			System.out.println("Ha accedido a su cuenta,¿Que operaciones desea realizar?");
			System.out.println("1-Mostrar informacion de la cuenta");
			System.out.println("2-Ingresar dinero");
			System.out.println("3-Retirar dinero");
			System.out.println("4-Actualizar");
			System.out.println("5-Salir");
			opcion=ex.controlaentero();
			switch (opcion) {
			case 1:
				System.out.println(c.toString());
				break;
			case 2:
				c.Ingresar(ex.controlaenteroSt("Introduzca la cantidad a ingresar"));
				System.out.println("Se ha efectuado el ingreso:"+""+"Saldo actual:"+""+c.getSaldo());
				break;
			case 3:
				c.retirar(ex.controlaenteroSt("Introduzca la cantidad a retirar"));
				break;
			case 4: 
				c.actualizar();
				break;
			default:
				break;
			}
			}while(opcion!=5);
			break;
		}catch(IndexOutOfBoundsException a){
			System.out.println("El numero de cuenta no está asociada a ninguna cuenta");
		}
		break;
	case 4:
		System.out.println("Saliendo..");
		break;
		default:
			break;
		}
	 }while(opcion!=4);
	} 
 }

