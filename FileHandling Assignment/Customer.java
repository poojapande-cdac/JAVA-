/*2) create a customer class with following attributes
	custid
	custname
	address
	age
create one instance of it and store it in a file. (Serialization).
now open a file, read the object and read its contents . (Deserialization)*/




package fileshandlingassignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Customer implements Serializable
{
		int custid=101;
		String custname="ABC and XYZ";
		String address="juhu and Andheri";
		int age= 35;


	public static void main(String[] args) 
	{
		Customer c= new Customer();
		try(FileOutputStream fos= new FileOutputStream("D:\\FileAssignment\\file2customer.txt"))
		{
		    try(ObjectOutputStream oos=new ObjectOutputStream(fos))
		     {
			oos.writeObject(c);

		      }
		}

		catch(Exception ee)
		{
			ee.printStackTrace();
		}

		System.out.println(c.custid+"\t"+c.custname+"\t"+c.age+"\t"+c.address);// TODO Auto-generated method stub
	
	


//serialization
	
	
c=null;


		try(FileInputStream fis = new FileInputStream("D:\\FileAssignment\\file2customer.txt"))
		{
		try(ObjectInputStream ois= new ObjectInputStream(fis))
		{
			Customer c1=(Customer) ois.readObject();
	System.out.println(c1.custid+"\t"+c1.custname+"\t"+c1.address);
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}//deserialization.
}
}
