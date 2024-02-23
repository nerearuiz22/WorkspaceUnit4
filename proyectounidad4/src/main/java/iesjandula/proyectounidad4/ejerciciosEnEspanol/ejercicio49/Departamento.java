package iesjandula.proyectounidad4.ejerciciosEnEspanol.ejercicio49;

public class Departamento {

	private String nombre;

	private Municipio[] municipios;

	public Departamento(String nombre) {

		this.nombre = nombre;

	}

	// hacerlo con objeto MunicipioNulo
	//añadir los mismos metodos que en tienda ademas de los que pide el ejercicio
	public Departamento(String nombre, Municipio[] municipios) {
		this(nombre);

	}

}