package Ejercicio3;

public class Libro {
	//ATRIBUTOS
	private String ISBN;
	private String Titulo;
	private String Autor;
	private Integer NumPaginas;
	
	
	public Libro() {
		this.ISBN = "";
		this.Titulo = "";
		this.Autor = "";
		this.NumPaginas = 0;
	}
	
	
	
	public Libro(String iSBN, String titulo, String autor, Integer numPaginas) {
		ISBN = iSBN;
		Titulo = titulo;
		Autor = autor;
		NumPaginas = numPaginas;
	}

	public void compararNumeroDePaginas(Libro Pagina){
		
	
		if (this.NumPaginas > Pagina.NumPaginas) {
			System.out.print("El libro "+this.Titulo + " Tiene más paginas");
		}else {
			System.out.print("El libro "+Pagina.Titulo + " Tiene más paginas");
		}
	
		
		
	}



	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public Integer getNumPaginas() {
		return NumPaginas;
	}
	public void setNumPaginas(Integer numPaginas) {
		NumPaginas = numPaginas;
	}
	@Override
	public String toString() {
		return "El libro con " + ISBN + " creado por " + Autor + " tiene " + NumPaginas + " pag" ;
	}

	
	
}

