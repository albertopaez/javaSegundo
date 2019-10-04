package ejercicio1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class LeerNombre {

	public static void main(String[] args) throws IOException {
				
		if (args.length==0) {
			System.exit(-1);
		}
		System.out.println(args[0]);
		System.exit(1);
	}

}
