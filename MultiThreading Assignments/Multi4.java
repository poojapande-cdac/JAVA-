/*4)create 2 threads. Write a program which displays number 1 to 10 using class lock. 
[hint:- use "implements Runnable" and synchronized block]*/

package Multi_Assignment;

public class Multi4 implements Runnable
{
	
		static Class cs;
		static void Disp()
		{
			synchronized(cs)
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println(i);
				}
			
			try
			{
				cs.wait();
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
				cs.notifyAll();
			}
		}
		}
		@Override
		public void run() 
		 {
			Disp();
	     }

	public static void main(String[] args)throws ClassNotFoundException
	{
		// TODO Auto-generated method stub
		cs=Class.forName("Multi_Threading_ass.Multi4");
		Multi4 m = new Multi4();
		Multi4 m1 = new Multi4();
		Thread t = new Thread(m);
		Thread t1 = new Thread(m1);
		t.start();
		t1.start();
		

	}

}
