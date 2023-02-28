package TallerDos;
import java.util.Scanner;
public class formulasMatematicas {
	public void calcularOperaciones() {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("elige la opcion que deseas calcular: " + "\n" + "1. a   2.b   3.c   4.d   5.e   6.f");
		int opc = sc.nextInt();
		if(opc==1) {
			System.out.println("ingrese el valor de x: ");
		double x = sc.nextInt();
		
		double totalA = (double) Math.sqrt(Math.pow(x, 5)-6)/4;
		System.out.println("el resultado es: " + totalA);
		
		}else if(opc==2) {
			System.out.println("ingrese el valor de x: ");
			double x = sc.nextInt();
			System.out.println("ingrese el valor de y: ");
			double y = sc.nextInt();
			
			double totalB = (double) Math.pow(x, y)-Math.pow(6, x);
			System.out.println("el resultado es: " + totalB);
				
		}else if(opc==3) {
			System.out.println("ingrese el valor de x: ");
			double x = sc.nextInt();
			System.out.println("ingrese el valor de z: ");
			double z = sc.nextInt();
			
			double totalC = (double) 4*Math.cos(z/5)-Math.pow(Math.sin(x), 2);
			System.out.println("el resultado es: " + totalC);
		
		}else if(opc==4) {
			System.out.println("ingrese el valor de x: ");
			double x = sc.nextInt();
			System.out.println("ingrese el valor de y: ");
			double y = sc.nextInt();
			
			double totalD = (double) Math.pow(x, 4)-Math.sqrt(6*x-Math.pow(y, 3));
			System.out.println("el resultado es: " + totalD);
			
		}else if(opc==5) {
			System.out.println("ingrese el valor de x: ");
			double x = sc.nextInt();
			System.out.println("ingrese el valor de y: ");
			double y = sc.nextInt();
			
			double totalE = (double) 1/(y-1/(x-Math.pow(2, y)));
			System.out.println("el resultado es: " + totalE);
						
		}else if(opc==6) {
			System.out.println("ingrese el valor de x: ");
			double x = sc.nextInt();
			
			double totalF = (double) 7*(Math.cos(Math.sqrt(5-Math.sin(Math.sqrt(3*x-4)))));
			System.out.println("el resultado es: " + totalF);
			
		}else {
			System.out.println("la opcion no existe");
		}	


	}
}

