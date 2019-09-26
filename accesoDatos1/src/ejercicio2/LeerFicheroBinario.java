package ejercicio2;

import java.io.*;
import java.util.ArrayList;

public class LeerFicheroBinario {

	public static void main(String[] args) {
		
		Departamento dep = new Departamento();
		ArrayList<Departamento> deps = new ArrayList<Departamento>();
		
	      try {
	         FileInputStream fileIn = new FileInputStream("Departamentos.dat");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         deps = (ArrayList<Departamento>) in.readObject();
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
	      
	      System.out.println(deps.size());
	      
	   }
	}


