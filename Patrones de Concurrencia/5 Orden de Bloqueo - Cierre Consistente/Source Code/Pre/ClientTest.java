public class ClientTest {

	public static void main(String[] args) {
		Directory dir_1 = new Directory("Directorio 1");
		Directory dir_2 = new Directory("Directorio 2");
		FileSysUtil_Rev fileSysUtil = new FileSysUtil_Rev();
		directoryThread thread1 = new directoryThread(dir_1, dir_2, fileSysUtil);
		directoryThread thread2 = new directoryThread(dir_2, dir_1, fileSysUtil);
	}
}

class directoryThread extends Thread{
	private Directory src, dest, FileSysUtil_Rev fileSysUtil;
	
	public directoryThread(Directory src, Directory dest, FileSysUtil_Rev fileSysUtil) {
		this.src = src;
		this.dest = dest;
		this.fileSysUtil = fileSysUtil;
		start();
	}
	
	public void run() {
		try {
			fileSysUtil.moveContents(src, dest);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
