package ejercicio5;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File directorio = new File(".//bin");
		ProcessBuilder pb = new ProcessBuilder("java", "ejercicio5.EjemploLectura");
		pb.directory(directorio);
		File fOut = new File("salida2.txt");
		File fErr = new File("error2.txt");
		File fBat=new File("fichero.bat");

		pb.redirectInput(fBat);
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		Process p = pb.start();

		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de salida: " + exitVal);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}