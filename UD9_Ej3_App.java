package Ejercicio3;


public class UD9_Ej3_App {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("13052020103","El señor de los anillos","J. R. R. Tolkien", 1000);
		Libro l2 = new Libro("13052020104","Hobbit","Alguien", 1001);

		System.out.println(l1);
		System.out.println(l2);
		
		l2.compararNumeroDePaginas(l1);
		
	
	}

}
