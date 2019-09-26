package ejercicio2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class CrearFicheroBinario {

	public static void main(String[] args) {
		
		Departamento dep = new Departamento();
		ArrayList<Departamento> deps = new ArrayList<Departamento>();
		dep.setNumeroDepartamento(33);
		dep.setLocalidad("Sevilla");
		dep.setNombre("Marketing");
		
		
		deps.add(dep);
		
		try {
	         FileOutputStream fileOut =
	         new FileOutputStream("Departamentos.dat");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(deps);
	         out.close();
	         fileOut.close();
	         System.out.printf("Hola");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }

	}

}
