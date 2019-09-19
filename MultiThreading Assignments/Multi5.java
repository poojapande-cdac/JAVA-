/*5) create 2 threads one thread will display 1 to 50
	  second thread will display 50 to 1 both the threads should start simultaneously.
      (use implements method)*/

package Multi_Assignment;

public class Multi5 implements Runnable{
	public void Disp()
	{
	 for(int i =1;i<=50;i++)
	 {
		 System.out.println(i);
	 }
	}
	public void Disp1()
		{
	      for(int j=50;j>=0;j--)
	        {
		      System.out.println(j);
	        }
		}
	 public void run()
	 {
		 try
		 {
			Thread.sleep(200);	
		 Disp();
		 Disp1();
		 }
		 catch(InterruptedException ie)
		 {
			 System.out.println(ie);
		 }
	 }



	public static void main(String[] args) {

		Multi5 m = new Multi5();
		Multi5 m1 = new Multi5();
		Thread t = new Thread(m);
		Thread t1 = new Thread(m1);
		t.start();
		t1.start();

		// TODO Auto-generated method stub

	}

}
