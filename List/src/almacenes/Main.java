/**
 * @Author Alejandro García Leiva. 
 */
package almacenes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Utiles.Salieri;

public class Main {

	public static void main(String[] args) {
		Salieri ex = new Salieri();
		List<Ventas> v = new ArrayList<Ventas>();
		Ventas tem = null;
		int ventas=0;
		String mes="";
		int opcion=0;
		String[] me = new String[] {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		do {
		System.out.println("Seleccione una opción:");
		System.out.println("1. Introducir las ventas de coches de cada uno de los meses del año.");
		System.out.println("2. Mostrar las ventas introducidas en el punto anterior.");
		System.out.println("3. Mostrar la suma total de ventas de coches del año.");
		System.out.println("4. Mostrar las ventas totales de los meses que empiezan por la letra A.");
		System.out.println("5. Mostrar el nombre del mes con más ventas.");
		System.out.println("6. Salir del programa.");
		opcion=ex.controlaentero();
		Iterator<Ventas> t = v.iterator();
		switch (opcion) {
		
		case 1:
			int cont=0;
			do {
				System.out.println("Ventas para el mes:"+" "+me[cont]);
				v.add(new Ventas(me[cont],ex.controlaentero()));
				cont++;
			}while(cont < 12);
			break;
			
		case 2:
			while(t.hasNext()) {
				tem = t.next();
				System.out.println(tem);
				
			}
			break;
		case 3:
			ventas=0;
			while(t.hasNext()) {
				tem = t.next();
				ventas += tem.getVentas();
			}
			System.out.println(ventas);
			break;
		case 4:
			cont=0;
			ventas=0;
			while(t.hasNext()) {
				tem = t.next();
				if(me[cont].charAt(0)=='a') {
					ventas += tem.getVentas();
				}
				cont++;
			}
			System.out.println("Ventas totales de Abril y Agosto:"+ventas);
			break;
		case 5 :
			cont=0;
			ventas=0;
			while(t.hasNext()) {
				tem=t.next();
				if(tem.getVentas()>ventas) {
					ventas=tem.getVentas();
					mes=me[cont];
				}
				cont++;
			}
			System.out.println("Mes con mas ventas:"+" "+mes);
			break;
		case 6:
			break;
		default:
			System.out.println("Opcion no válida.");
			break;
		}
		}while(opcion != 6);
	}

}
