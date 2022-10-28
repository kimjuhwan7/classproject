package mini;

public class Th extends Thread {

	public static void main(String[] args) {
		Thread thread = new Thread();
		
		
		
	
		
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	}
