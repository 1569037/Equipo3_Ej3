package libros;

public class Herencia3App {

	public static void main(String[] args) {
		// Creamos dos instancias de la clase Libro
		Libro lib1=new Libro("978-84-450-0068-7", "El Retorno del Rey", "J.R.R. Tolkien", 604);
		Libro lib2=new Libro("978-84-204-6028-4", "Gambito de Dama", "Walter Tevis", 311);
		
		// Mostramos por pantalla
		System.out.println(lib1);
		System.out.println("\n"+lib2+"\n");
		
		// Mostramos cual tiene más paginas usando el metodo compare
		if(lib1.getPags>lib2.getPags){
			System.out.println("El libro '"+lib1.getTitulo+"' tiene mas paginas que '"+lib2.getTitulo+"'");
		}else if(lib2.getPags>lib1.getPags){
			System.out.println("El libro '"+lib2.getTitulo+"' tiene mas paginas que '"+lib1.getTitulo+"'");
		}else{
			System.out.println("Los dos libros tienen el mismo numero de paginas: "+lib1.getPags);
		}
	}

}
