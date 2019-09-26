package ejercicio1;

import java.io.*;
import java.util.*;

public class ManejarFicheroAleatorio {
	
	ArrayList<Integer> ids=new ArrayList<Integer>();
	ArrayList<String> apellidos=new ArrayList<String>();
	ArrayList<Integer> deps=new ArrayList<Integer>();
	ArrayList<Double> salarios=new ArrayList<Double>();
	int id;
	String apellido;
	int dep;
	double salario;
	int posicion;
	
	public ManejarFicheroAleatorio() {
		
	}
	
	
	public void cargarFichero() throws IOException {
		File fichero = new File("Empleados.txt");
        RandomAccessFile file=new RandomAccessFile (fichero, "r");
        Double salario;
        char apellidoC[]=new char[10], aux;
        for(;;){
            file.seek(posicion);
            id=file.readInt();
            for(int i=0;i<apellidoC.length;i++){
                aux=file.readChar();
                apellidoC[i]=aux;
            }
            apellido=new String(apellidoC);
            dep=file.readInt();
            salario=file.readDouble();
            ids.add(id);
            apellidos.add(apellido);
            deps.add(dep);
            salarios.add(salario);
            posicion=posicion+36;
            if(file.getFilePointer()==file.length()) {
                break;
            }
        }
        file.close();
	}
	
	public boolean comprobarId(int idComprobar) {
		if(this.ids.contains(idComprobar)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public void insertarEmpleado(int idEmpleado, String apellidoEmpleado,
			int depEmpleado, double salarioEmpleado) {
		if(this.comprobarId(idEmpleado)) {
			System.out.println("Este ID ya existe");
		}else {
			this.ids.add(idEmpleado);
            apellidos.add(apellidoEmpleado);
            deps.add(depEmpleado);
            salarios.add(salarioEmpleado);
		}
	}
	
	public void modificarEmpleado(int idEmpleado, double salarioEmpleado) {
		if(this.comprobarId(idEmpleado)) {
			int aux = this.ids.indexOf(idEmpleado);
			double salarioOld = salarios.get(aux);
			double salarioNew = salarioEmpleado+salarioOld;
			salarios.set(aux, salarioNew);
			System.out.println("Apellido: "+apellidos.get(aux)+", Salario antiguo; "+
			salarioOld+", Salario nuevo: "+salarioNew);
		}else {
			System.out.println("Este empleado no existe");
		}
	}
	
	public void consultarEmpleado(int idEmpleado) {
		if(this.comprobarId(idEmpleado)) {
			int aux = this.ids.indexOf(idEmpleado);
			System.out.println("ID: "+ids.get(aux)+", Apellido: "+apellidos.get(aux));
			System.out.println("Departamento: "+deps.get(aux)+", Salario: "+salarios.get(aux));
		}else {
			System.out.println("Este empleado no existe");
		}
	}
	
	public void borrarEmpleado(int idEmpleado) {
		if(this.comprobarId(idEmpleado)) {
			int aux = this.ids.indexOf(idEmpleado);
			String aux2 = ""+idEmpleado;
			ids.set(aux, -1);
			apellidos.set(aux, aux2);
			deps.set(aux, 0);
			salarios.set(aux, (double) 0);
		}else {
			System.out.println("Esta Id no existe");
		}
	}
	
	
	public void descargarFichero() throws IOException {
		File fichero=new File("Empleados.txt");
        
        RandomAccessFile file=new RandomAccessFile(fichero, "rw");
        int id[]=new int[apellidos.size()];
        String apellido[]=new String[apellidos.size()];
        int departamento[]=new int[apellidos.size()];
        Double salario[]=new Double[apellidos.size()];
        for(int i=0;i<apellidos.size();i++) {
        	id[i]=ids.get(i);
        	apellido[i]=apellidos.get(i);
        	departamento[i]=deps.get(i);
        	salario[i]=salarios.get(i);
        }
        StringBuffer buffer=null;
        int n=apellido.length;
        
        for(int i=0;i<n;i++){
            file.writeInt(id[i]);
            buffer=new StringBuffer(apellido[i]);
            buffer.setLength(10);
            file.writeChars(buffer.toString());
            file.writeInt(departamento[i]);
            file.writeDouble(salario[i]);
        }
        file.close();
        
	}
	

}
