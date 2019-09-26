package ejercicio1;

import java.io.*;

public class LeerFicheroAleatorio {
    public static void main(String[] args) throws IOException{
        File fichero = new File("Empleados.txt");
        RandomAccessFile file=new RandomAccessFile (fichero, "r");
        int id, dep, posicion=0;
        Double salario;
        char apellido[]=new char[10], aux;
        for(;;){
            file.seek(posicion);
            id=file.readInt();
            for(int i=0;i<apellido.length;i++){
                aux=file.readChar();
                apellido[i]=aux;
            }
            String apellidos=new String(apellido);
            dep=file.readInt();
            salario=file.readDouble();
            System.out.println("ID: "+id+", apellido: "+apellidos+", departamento: "
            +dep+", salario: "+salario);
            posicion=posicion+36;
            if(file.getFilePointer()==file.length()) {
                break;
            }
        }
        file.close();
    }
    
}