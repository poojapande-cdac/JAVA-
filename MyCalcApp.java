
2) Define your exception class by name "MyArithException"
(MyArithException.java)
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will throw exception if 0 is passed or negative passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.

Now define class "MyCalcApp" (MyCalcApp.java)
In this class you accept a number from user and pass that no. to
caldouble() method which is mentioned above.



import java.util.Scanner;

class Myarithexception extends Exception {
	public Myarithexception(String mess) {
		super(mess);
	}

}

class Calculator 
{
	public int caldouble(int a) throws Myarithexception 
	{
		if (a <= 0) 
		{
			throw new Myarithexception("Zero or Negative not allowed");
		} 
		return a*2;
	}
}

public class MyCalcApp {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Calculator c = new Calculator();
		try {
			int result=c.caldouble(num);
			System.out.println(result);
		} 
		catch (Myarithexception e)
		 {
			System.out.println(e);

		 }
		
	}

}