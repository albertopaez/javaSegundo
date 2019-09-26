package ejercicio2;

import java.io.Serializable;

public class Departamento implements Serializable {
	int numeroDepartamento;
	String nombre;
	String localidad;
	
	
	
	public Departamento(int numeroDepartamento, String nombre, String localidad) {
		super();
		this.numeroDepartamento = numeroDepartamento;
		this.nombre = nombre;
		this.localidad = localidad;
	}
	public Departamento() {
	}

	public void introducirDepartamento(int numeroD, String nombreD, String localidadD) {
	}
	
	public int getNumeroDepartamento() {
		return numeroDepartamento;
	}
	public void setNumeroDepartamento(int numeroDepartamento) {
		this.numeroDepartamento = numeroDepartamento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
}
