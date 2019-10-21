package ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HiloTIC h1 = new HiloTIC();
		HiloTAC h2 = new HiloTAC();
		
		new Thread (h1).start();
		new Thread (h2).start();

	}

}
