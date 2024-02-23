package iesjandula.proyectounidad4.ejerciciosEnEspanol.ejercicio45;

import iesjandulaunit4project.arraydeobjetos.agregacion.Cliente;

public class Biblioteca {
	
	private static final int LIBROS_MAX = 500;
	private static final Libro libroNulo = new Libro("LibroNulo","LibroNulo",0,"LibroNulo","ZZZZZZZZZZZZZZZ");
	private String nombre;
	private Libro[] libros;
	private int contLibros=0;
	
	
	//Igual que tienda y cliente
	//con el objeto LibrosNulo
	//ademas de los metodos del ejercicio añadir los mismos métodos que en tienda
	
	public Biblioteca(String nombre) {
		
		this.nombre = nombre;
		libros = new Libro[LIBROS_MAX];
		rellenaLibrosNull();
		
	}

	

	public Biblioteca(String nombre, Libro[] libros) {
		this.nombre = nombre;

		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Libro[] getLibros() {
		return libros;
	}

	public boolean addLibro (Libro libro) {
		
		int contLibros;
		boolean hayHueco = false;

		while (contLibros < this.libros.length && !hayHueco) {

			if (libros[contLibros].compareTo(libroNulo) == 0) {

				hayHueco = true;

			} else {
				contLibros++;
			}

		}

		if (hayHueco) {

			libros[contLibros] = li;
			contLibros++;

		}

		return hayHueco;
		
	}
	
	public boolean borrarLibro(Libro li) {

		boolean encontrado = false;
		for (int i = 0; i < LIBROS_MAX && !encontrado; i++) {

			if (libros[i].equals(li)) {
				encontrado = true;
				libros[i] = contLibros;
				contLibros--;
			}

		}

		return encontrado;

	}

	private void rellenaLibrosNull() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < LIBROS_MAX; i++) {
			libros[i] = libroNulo;
		}
		
	}

}
