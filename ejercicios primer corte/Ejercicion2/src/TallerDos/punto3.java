package TallerDos;
import java.util.Scanner;
public class punto3 {
	
	
	public void autobusesFurgonetas() {
		Scanner sc = new Scanner(System.in);
		int personas = 0;
		
		System.out.println("escribe el numero de personas que van a ir al viaje: ");
		personas = personas + sc.nextInt();
			
				double bus=personas/45;
			double furgoneta;
			furgoneta = personas-45*bus;
			
		System.out.println("solo se necesita " + bus + " bus y "+ furgoneta + " personas van en furgoneta");		
			
	}
	
}