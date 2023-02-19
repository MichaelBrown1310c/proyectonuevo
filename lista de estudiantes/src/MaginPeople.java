
public class MaginPeople {
	
	public static void main(String[] args) {
		
		Person p1 = new Person ("Arial", 37);
		Person p2 = new Person ("Joshep", 15);
		
		if(p1.getEdad()==p2.getEdad()) {
			
			System.out.println("las edades de : " + p1.getName() + " es igual a la edad de " + p2.getName());
		}
		else {
			
			System.out.println("las edades de : " +p1.getName() + " no es igual a la edad de " + p2.getName());
		}
	}

}
