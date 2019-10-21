package ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String input = "0";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MyHilo h = new MyHilo();
		
		while (input.equals("*") == false) {
			
			System.out.println("Introduzca comando");
			input = br.readLine();
			
			switch(input) {
			case "S": h.Suspende();
			break;
			
			case "R": h.Reanuda();
			break;
			
			default:
			break;
			
			}
			
			
		}
		
		
		
		
	}

}
