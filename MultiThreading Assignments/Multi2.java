/*2) create a multi-threaded application by using  "extends Thread " method.create 2 threads. they should display
   characters from A to J. above program  using "implements Runnable" method.*/


package Multi_Assignment;

public class Multi2 implements Runnable {

	public void run()
	{
		char ch;
		   for(ch='A';ch<='J';ch++)
		   {
			   System.out.println(ch);
		   }
	}

	public static void main(String[] args) {

		Multi2 m = new Multi2();
		Thread t = new Thread(m);
		Thread t1 = new Thread(m);
		t.start();
		t1.start();
	}

}
