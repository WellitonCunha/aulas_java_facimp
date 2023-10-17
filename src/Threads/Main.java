package Threads;

public class Main {

	public static void main(String[] args) throws InterruptedException {
//		MinhaThread minhaThread = new MinhaThread();
//		minhaThread.start();
//		MinhaThread minhaThread2 = new MinhaThread();
//		minhaThread2.start();
//		MinhaThread2 minhaThread2 = new MinhaThread2();
//		Thread thread = new Thread(new MinhaThread2());
//		thread.start();
		//thread.join();
//		Thread thread2 = new Thread(new MinhaThread2());
//		thread2.start();
		//thread2.join();
		
		Armazena armazena = new Armazena();
		Thread thread = new Thread(new ExecutandoTarefa(armazena));
		thread.start();
		
		thread.join();
		Thread thread2 = new Thread(new ExecutandoTarefa(armazena));
		thread2.start();
		
		
		thread2.join();
		
		System.out.println(armazena.cont);

	}

}
