
public class DemoPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main started:-"+ Thread.currentThread().getName());
		Thread t1= new MyThread();
		t1.setName("HIGH");
		t1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Main completed:-"+ Thread.currentThread().getName());
		t1.start();
		
//		Thread t2= new MyThread();
//		t2.setName("HIGH2");
//		t2.start();
	}

}
