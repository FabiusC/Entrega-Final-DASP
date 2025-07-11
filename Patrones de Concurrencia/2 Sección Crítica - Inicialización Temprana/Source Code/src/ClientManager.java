import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ClientManager {

	public static void main(String[] args) {
		try { // Se crea contador para sacar los tiempos a un archivo aparte para la hoja de
				// calculo
			PrintStream contador = new PrintStream(new FileOutputStream("logTiempos.txt", true));
			System.setOut(contador);
		} catch (IOException e) {
			System.out.println("Error creando el contador de tiempos");
		}
		FileProcess proceso1 = new FileProcess("Thread 1 is writting");
		FileProcess proceso2 = new FileProcess("Thread 2 is writting");
		FileProcess proceso3 = new FileProcess("Thread 3 is writting");
		FileProcess proceso4 = new FileProcess("Thread 4 is writting");

		proceso1.start();
		proceso2.start();
		proceso3.start();
		proceso4.start();
	}
}

class FileProcess extends Thread {
	private String msgLog;

	public FileProcess(String msg) {
		this.msgLog = msg;
	}

	@Override
	public void run() {

		long tiFL = System.nanoTime(); // Antes de Obtener el FileLogger
		Logger fileLogger = FileLogger.getFileLogger();
		long tfFL = System.nanoTime(); // Tras Obtener el FileLogger
		long tTotalFL = tfFL - tiFL; // Tiempo total para obtener el FileLogger

		long tiLog = System.nanoTime(); // Antes de escritura de mensajes
		for (int i = 0; i < 100; i++) {
			fileLogger.log(msgLog);
		}
		long tfLog = System.nanoTime(); // Tras escritura de mensajes
		long tTotalLog = tfLog - tiLog; // Tiempo total de escritura

		System.out.print(msgLog + "\t" + tTotalFL + "\t" + tTotalLog + "\n"); // Escritura a logTiempos para hoja de
																				// calculo
	}
}