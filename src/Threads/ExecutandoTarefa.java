package Threads;

public class ExecutandoTarefa implements Runnable {
	private Armazena armazena;
	public ExecutandoTarefa(Armazena armazena) {
		this.armazena = armazena;
	}
	@Override
	public void run() {
		for(int i=0; i<50000; i++) {
			this.armazena.somar();
		}
	}
}
