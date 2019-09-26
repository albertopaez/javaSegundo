package ejercicio2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Empresa implements Serializable {

	ArrayList<Departamento> deps;
	
	
	public ArrayList<Departamento> getDeps() {
		return deps;
	}
	public void setDeps(ArrayList<Departamento> dep) {
		this.deps = dep;
	}
	
	public void cargarFichero() throws IOException, ClassNotFoundException {
		FileInputStream fileIn = new FileInputStream("Departamentos.dat");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        deps = (ArrayList<Departamento>) in.readObject();
        in.close();
        fileIn.close();
	}
	
	public Boolean buscarDepartamento(int numero) {
		
		boolean aux = false;

		for(int i=0;i<deps.size();i++) {
			if(deps.get(i).getNumeroDepartamento()==numero) {
				aux=true;
				break;
			}
		}
		return aux;
	}
	
	
	
	public void insertarDepartamento(int numero, String nombre, String localidad) {
		Departamento dep = new Departamento(numero, nombre, localidad);
		deps.add(dep);
		
	}
	
	public void modificarDepartamento(int numero, String nombre, String localidad) {
		if(this.buscarDepartamento(numero)) {
			Departamento dep = new Departamento(numero, nombre, localidad);
			
			int aux = 0;

			for(int i=0;i<deps.size();i++) {
				if(deps.get(i).getNumeroDepartamento()==numero) {
					aux=i;
					break;
				}
			}
			this.verDepartamento(numero);
			deps.get(aux).setLocalidad(localidad);
			deps.get(aux).setNombre(nombre);
			this.verDepartamento(numero);
			
			
		}else {
			System.out.println("El departamento no existe");
		}
	}
	
	public void eliminarDepartamento(int numero) {
		if(this.buscarDepartamento(numero)) {
			int aux = 0;

			for(int i=0;i<deps.size();i++) {
				if(deps.get(i).getNumeroDepartamento()==numero) {
					aux=i;
					break;
				}
			}
			deps.remove(aux);
			System.out.println("Departamento eliminado con exito");
		}else {
			System.out.println("El departamento no existe");
		}
	}
	
	public void descargarFichero() throws IOException {
		FileOutputStream fileIn = new FileOutputStream("Departamentos.dat");
        ObjectOutputStream in = new ObjectOutputStream(fileIn);
        in.writeObject(deps);
        in.close();
        fileIn.close();
	}
	
	public void verDepartamento(int numero) {
		
		if(this.buscarDepartamento(numero)) {
			int aux = 0;

			for(int i=0;i<deps.size();i++) {
				if(deps.get(i).getNumeroDepartamento()==numero) {
					aux=i;
					break;
				}
			}
			System.out.println("Numero: "+deps.get(aux).getNumeroDepartamento()+
					", Nombre: "+deps.get(aux).getNombre()+
					", Localidad: "+deps.get(aux).getLocalidad());
		}else {
			System.out.println("El departamento no existe");
		}
		
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
