package TallerDos;

import java.util.Scanner;

public class AreaTriangulo {

	public void calculArArea() {
	
	Scanner sc = new Scanner (System.in);
		System.out.println("digite la base del triangulo");
		
		double b=sc.nextDouble();
		
		System.out.println("Ingresar la altura del triangulo");
		
		double h=sc.nextDouble();
		
		double A=b*h/2;
		
		System.out.println("El valor del el area del triangulo es " + A);
	
	
	}
	

}
