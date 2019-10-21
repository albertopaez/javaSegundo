package ejercicio1;

public class HiloTAC extends Thread {
	
	public void run() {
		
		while(true) {
			System.out.println("TAC");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
