package ejercicio2;

import java.io.*;

public class CrearFicheroBinario {

	public static void main(String[] args) {
		
		Departamento dep = new Departamento();
		dep.setNumeroDepartamento(34);
		dep.setLocalidad("Aljarafe");
		dep.setNombre("Contabilidad");
		
		try {
	         FileOutputStream fileOut =
	         new FileOutputStream("Departamentos.dat");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(dep);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in Departamentos.dat");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }

	}

}
