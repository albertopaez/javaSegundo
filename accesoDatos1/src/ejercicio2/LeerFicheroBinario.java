package ejercicio2;

import java.io.*;

public class LeerFicheroBinario {

	public static void main(String[] args) {
		
		Departamento d = null;
		
	      try {
	         FileInputStream fileIn = new FileInputStream("Departamentos.dat");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         d = (Departamento) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      
	      System.out.println("Deserialized Employee...");
	      System.out.println("Numero: "+d.getNumeroDepartamento());
	      System.out.println("Nombre: "+d.getNombre());
	      System.out.println("Localidad: "+d.getLocalidad());
	   }
	}


