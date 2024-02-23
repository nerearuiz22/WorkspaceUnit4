package iesjandula.proyectounidad4.ejerciciosEnEspanol.ejercicio45;

public class Libro implements Comparable <Libro> {

	private String titulo;
	private String autor;
	private int annioPublicacion;
	private String editorial;
	private String referencia;
	
	public Libro(String titulo, String autor, int annioPublicacion, String editorial, String referencia) {
		this.titulo = titulo;
		this.autor = autor;
		this.annioPublicacion = annioPublicacion;
		this.editorial = editorial;
		this.referencia = referencia;
	}
	
	

	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public int getAnnioPublicacion() {
		return annioPublicacion;
	}



	public void setAnnioPublicacion(int annioPublicacion) {
		this.annioPublicacion = annioPublicacion;
	}



	public String getEditorial() {
		return editorial;
	}



	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}



	public String getReferencia() {
		return referencia;
	}



	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	


	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", annioPublicacion=" + annioPublicacion
				+ ", editorial=" + editorial + ", referencia=" + referencia + "]";
	}



	@Override
	public int compareTo(Libro o) {
		
		return this.referencia.compareTo(getReferencia());
	}
	
	  
	
	
	
}
