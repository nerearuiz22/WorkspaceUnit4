package iesjandula.proyectounidad4.ejerciciosEnEspanol.ejercicio49;

import java.util.Objects;

public class Alcalde implements Comparable<Alcalde>,IAlcalde {
	
	private String nombre;
	private String apellidos;
	private EnumPartido partido;
	

	public Alcalde(String nombre, String apellidos, EnumPartido partido) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.partido = partido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public EnumPartido getPartido() {
		return partido;
	}


	public void setPartido(EnumPartido partido) {
		this.partido = partido;
	}
	

	@Override
	public String toString() {
		return "Alcalde [nombre=" + nombre + ", apellidos=" + apellidos + ", partido=" + partido + "]";
	}
	
	
	


	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre, partido);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alcalde other = (Alcalde) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre)
				&& partido == other.partido;
	}


	@Override
	public int compareTo(Alcalde o) {
		
		String nombreAlc = this.nombre+this.apellidos;
		return nombreAlc.compareTo(o.getNombre()+o.getApellidos());
		
		//Otra forma:
		//return (this.nombre+this.apellidos).compareTo(o.getNombre()+o.getApellidos());
	}


	@Override
	public String infoAlcalde() {
		// TODO Auto-generated method stub
		return "Nombre: " + this.getNombre() + " Apellidos: " + this.getApellidos() + " Partido: " + this.getPartido();
	}
	
	

}
