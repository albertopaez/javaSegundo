package ejercicio1;

import java.io.*;


public class CrearFicheroAleatorio {
    public static void main(String[]args) throws IOException{
        File fichero=new File("Empleados.txt");
        System.out.println ("Hola");
        
        RandomAccessFile file=new RandomAccessFile(fichero, "rw");
        String apellido[]={"Casado","Tudela","Sanche","Rivero"};
        int departamento[]={60,20,10,30};
        Double salario[]={901.20,1200.90,567.85,1512.15};
        StringBuffer buffer=null;
        int n=apellido.length;
        
        for(int i=0;i<n;i++){
            file.writeInt(i+1);
            buffer=new StringBuffer(apellido[i]);
            buffer.setLength(10);
            file.writeChars(buffer.toString());
            file.writeInt(departamento[i]);
            file.writeDouble(salario[i]);
        }
        file.close();
        
    }
}
