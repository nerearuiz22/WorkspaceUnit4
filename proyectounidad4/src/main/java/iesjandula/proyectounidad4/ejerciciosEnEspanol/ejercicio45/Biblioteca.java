package iesjandula.proyectounidad4.ejerciciosEnEspanol.ejercicio45;

public class Biblioteca {

	private static final Libro libroNulo = new Libro("LibroNulo", "LibroNulo", 0, "LibroNulo","ZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
	private String nombre;
	private Libro[] libros;
	private int MAX_LIBROS=200;
	private int contLibros = 0;

	// Quiero que lo hagais igual que La tienda y el clienta
	// con el objeto LibroNulo

	// ademas de los metodos del ejercicio añadir los mismos métodos que en tienda

	public Biblioteca(String nombre) {
		this.nombre = nombre;

	}

	public Biblioteca(String nombre, Libro[] librosParam) {

		this(nombre);

	}

}