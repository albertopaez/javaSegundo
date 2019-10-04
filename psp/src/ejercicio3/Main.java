package ejercicio3;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
	
	public static void main(String[] args) throws IOException {
		File directorio = new File(".//bin");
		ProcessBuilder pb = new ProcessBuilder("java", "ejercicio3.Suma");
		pb.directory(directorio);
		
				
				
		System.out.printf("Directorio de trabajo: %s%n", pb.directory());
		Process p = pb.start();
		OutputStream os = p.getOutputStream();
		os.write("a\n5\n3\n".getBytes());
		os.flush();
		
		int exitValue;
		try {
			InputStream is = p.getInputStream();
			int c;
			while ((c = is.read()) != -1)
				System.out.print((char) c);
			exitValue = p.waitFor();
			//System.out.println("VALOR DE SALIDA: " + exitValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
