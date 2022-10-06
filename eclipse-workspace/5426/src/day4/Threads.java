package day4;

public class Threads {
	
	static class TestRunnable implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread()+" "+i);
				
			}
			
		}
		
	}
	public static void main(String[] args) {
	
	
		new Thread(new TestRunnable()).start();
		new Thread(new TestRunnable()).start();
		new Thread(new TestRunnable()).start();
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {						//this is used for functional interfaces where it contains a function/method 
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread()+" "+i);
				}
				
			}
		}).start();
		
		
		new Thread(()-> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread()+" "+i);
			}
			}).start();
		
		
		
		Runnable r=() ->{
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread()+" "+i);
				
			}
		};
		new Thread(r).start();
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread()+" "+i);
			
		}
		
		
	}
}



