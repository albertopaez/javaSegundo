package ejercicio4;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File directorio = new File(".//bin");
		ProcessBuilder pb = new ProcessBuilder("java", "ejercicio4.EjemploLectura");
		pb.directory(directorio);
		File fOut = new File("salida.txt");
		File fErr = new File("error.txt");

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