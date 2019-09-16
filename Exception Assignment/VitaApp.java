3)create a package called "course"
In this package create three classes
a) Dac    with methods  term1()  and term2()
b) PreDac with  method  cet()
c) Basic   with method  finalTest()

Now write application called  "VitaApp" in which call all the methods  of the above mentioned classes.



package course;

class Predac
{
	public void term1()
	{
		System.out.println("Term1");
	}
	public void term2()
	{
		System.out.println("Term2");
	}
}
class Dac
{
	public void cet()
	{
		System.out.println("Cet");
	}
}
class Basic
{
	public void finaltest()
	{
		System.out.println("FinalTest");
	}
}
public class VitaApp
{
    public static void main(String[] args)
	{
		Predac p=new Predac();
		Dac d=new Dac();
		Basic b=new Basic();
		p.term1();
		p.term2();
		d.cet();
		b.finaltest();
	}

}