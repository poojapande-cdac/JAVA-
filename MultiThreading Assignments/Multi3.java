/*3) create 3 threads in such a way that while one thread is executing, 2 threads cannot interfere. 
  they should display output "Exec  0" to "Exec 5".*/
 
package Multi_Assignment;

public class Multi3 extends Thread {
	public synchronized void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Exce " +i+Thread.currentThread());
		}
		try
		{
			Thread.sleep(200);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Multi3 m = new Multi3();
		Thread t = new Thread(m,"first");
		Thread t1 = new Thread(m,"second");
		Thread t2 = new Thread(m,"third");
		t.start();
		t1.start();
		t2.start();
		
	}



	}


