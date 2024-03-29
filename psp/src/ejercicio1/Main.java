package ejercicio1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws IOException {

		File directorio = new File(".//bin");
		ProcessBuilder pb = new ProcessBuilder("java", "ejercicio1.LeerNombre", "Alberto");
		pb.directory(directorio);
		System.out.printf("Directorio de trabajo: %s%n", pb.directory());
		Process p = pb.start();
		int exitValue;
		try {
			InputStream is = p.getInputStream();
			int c;
			while ((c = is.read()) != -1)
				System.out.print((char) c);
			exitValue = p.waitFor();
			System.out.println("VALOR DE SALIDA: " + exitValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
