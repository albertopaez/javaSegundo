package ejercicio4;

public class MyHilo extends Thread {
	
	int contador = 0;
	boolean bucle = true;

	private SolicitaSuspender suspender=new SolicitaSuspender();
	
	public void Suspende() { suspender.set(true);}
	public void Reanuda() { suspender.set(false);}
	
	public void run() {
		
			try {
				while(bucle == true) {
					contador++;
					System.out.println(contador);
					Thread.sleep(1000);
					suspender.esperandoParaReanudar();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public int getContador() {
		return contador;
	}
	
	
}
