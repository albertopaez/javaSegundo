package ejercicio1;

import java.io.IOException;

public class MainEmpleado {

	public static void main(String[] args) throws IOException {
		
		Empleado alet = new Empleado();
		
		alet.cargarFichero();
		
		alet.consultarEmpleado(2);

	}

}
