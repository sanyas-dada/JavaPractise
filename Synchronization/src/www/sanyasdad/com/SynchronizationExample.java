package www.sanyasdad.com;

class Sanyas{
	synchronized static  void printPower(int n) {
		int temp = 1;
		for (int i = 1; i<=5 ; i++) {
			System.out.println(Thread.currentThread().getName() +":-"+n+"^"+i+" value: " +n*temp);
			temp = n*temp;
			try {
				Thread.sleep(1000);
			}catch(Exception e) {System.out.println(e);};
			
		}
	}
	
}
class Thread1 implements Runnable{
	Sanyas s;
	Thread1(Sanyas s){
		this.s = s;
	}

	@Override
	public void run() {
      s.printPower(2);		
	}
	
}
class Thread2 implements Runnable{
	Sanyas s;
	Thread2(Sanyas s){
		this.s = s;
	}

	@Override
	public void run() {
		 s.printPower(3);
	}
	
}
class Thread3 implements Runnable{
	Sanyas s;
	Thread3(Sanyas s){
		this.s =s ;
	}

	@Override
	public void run() {
		s.printPower(4);
	}
	
}
class Thread4 implements Runnable{
	Sanyas s;
	Thread4(Sanyas s){
		this.s =s ;
	}
	
	@Override
	public void run() {
		s.printPower(5);
	}
	
}


public class SynchronizationExample {

	public static void main(String[] args) {
		Sanyas dada = new Sanyas();
		Sanyas billionare = new Sanyas();
		//Runnable r1 = new Thread1(dada);
		//Runnable r2 = new Thread2(dada);
		
		// same objects belongs to thread-0 and thread-3
		new Thread( new Thread1(dada)).start();
		new Thread( new Thread2(dada)).start();
		new Thread( new Thread3(billionare)).start();
		new Thread( new Thread4(billionare)).start();
	
		/*
		 * Thread t1 = new Thread(r1); Thread t2 = new Thread(r1); Thread t3 = new
		 * Thread(r2); Thread t4 = new Thread(r2);
		 */
		
		
		
		
		
		//Static Synchornization
		   // 1.in java, every object has a single lock (monitor) associated with it.
		   // The thread which is entering into synchronized method or synchronized block will get that lock, all
		   //threads which are ramining to use the shared resources have to wait for the completion of the first thread and release of the lock
		
		   ///2.Suppose in the case of where we have more than one object, in this case, two speartate threads will  acquire the locks and enter
		   // synchronized method will a separate lock for each object at the same time. To avoid this, we will use static synchronization.
		   
		   //3. in this, we weill use static synchronized keywords begore the static method. In static synchronization, lock access is on the class not on object and method.
		
		
		
	
		
	}

}
