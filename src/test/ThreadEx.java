package test;

public class ThreadEx extends Thread {

	public static void main(String[] args) {
		Thread t1 = new ThreadEx();
		//Thread t2 = new ThreadEx();
		t1.start();
		//t2.start();

	}
	
	public void run() {
		System.out.println("Run method called");
	}

}
