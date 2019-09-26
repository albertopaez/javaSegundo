package ejercicio1;

import java.io.IOException;

public class MainEmpleado {

	public static void main(String[] args) throws IOException {
		
		Empleado alet = new Empleado();
		
		alet.cargarFichero();
		
		alet.consultarEmpleado(101);
		
		alet.insertarEmpleado(77, "Caoba", 40, 1000.01);
		
		alet.consultarEmpleado(77);
		
		alet.modificarEmpleado(77, 1);
		
		alet.consultarEmpleado(77);
		
		alet.borrarEmpleado(77);
		
		alet.consultarEmpleado(77);
		
		alet.insertarEmpleado(101, "Error", 101, 101.101);
		
		
		alet.descargarFichero();
	}

}
