package ejercicio2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Empresa emp = new Empresa();
		
		emp.cargarFichero();
		
		
		emp.insertarDepartamento(77, "Ventas", "Catalonia");
		
		emp.modificarDepartamento(77, "Compras", "Sevilla");
		
		emp.eliminarDepartamento(77);
		
		
		
		
		emp.descargarFichero();
		
	}

}
