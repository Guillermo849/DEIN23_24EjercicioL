package model;

public class Aeropuertos {
	private int id;
	private String nombre;
	private String pais;
	private String ciudad;
	private String calle;
	private int numero;
	private int anio;
	private int capacidad;
	private int privado;
	private int numSocios;
	
	public Aeropuertos(int id, String nombre, String pais, String ciudad, String calle, int numero, int anio,
			int capacidad, int privado, int numSocios) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
		this.anio = anio;
		this.capacidad = capacidad;
		this.privado = privado;
		this.numSocios = numSocios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getPrivado() {
		return privado;
	}

	public void setPrivado(int privado) {
		this.privado = privado;
	}

	public int getNumSocios() {
		return numSocios;
	}

	public void setNumSocios(int numSocios) {
		this.numSocios = numSocios;
	}
}
