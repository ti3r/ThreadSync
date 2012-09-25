import java.util.Random;


public class ServiceStub {

	
	public void process(int threadId) throws InterruptedException{
		Hilo h = new Hilo();
		h.id = threadId;
		h.start();
		h.join();
	}
	
	
	class Hilo extends Thread{
		
		public int id = -1;
					@Override
					public void run() {
						synchronized (this) {
							long time = 1000 * new Random().nextInt(5);
							System.out.println("Task will take ms: "+time);
							//Simulate long taks
							try {
								wait(4000);
								System.out.println("Task ended for thread: "+id);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
		
	}
	
}
