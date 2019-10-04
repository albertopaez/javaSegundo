package ejercicio3;

import java.io.IOException;

import utilidad.Input;

public class Suma {

	public static void main(String[] args) throws IOException {

		Input i = new Input();

		System.out.println("Meta el primer numero");
		int a = i.tryInteger();
		System.out.println("Meta el segundo numero");
		int b = i.tryInteger();
		System.out.println(a + b);

		if (args.length == 0) {
			System.exit(-1);
		}
		System.exit(1);

	}

}
