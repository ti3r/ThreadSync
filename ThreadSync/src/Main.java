
public class Main {

	static int tId = 0;
	
	public static void main(String[] args) throws InterruptedException{
		
		ServiceStub stub = new ServiceStub();
		stub.process(1);
		stub.process(2);
		stub.process(3);
	}
	
	
	
}
