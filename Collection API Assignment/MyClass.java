/*1) create a class "MyClass".
create 5 different objects of it.
add them in a ArrayList.
store ArrayList in file.
Now open a file, read ArrayList and display all objects.*/


package day6assignment;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int studentid;

	public Student (String name,int studentid)
	{
		this.name=name;
		this.studentid=studentid;
	
	}
	@Override
	public String toString()
	{
		return name+"\t"+studentid;
	}
}
public class MyClass
{
	public static void main(String args[])
	{
		Student s1=new Student ("Amit",01);
		Student s2=new Student ("Rohit",02);
		Student s3=new Student("Nikita",03);
		Student s4=new Student ("Tarun",07);
		Student s5=new Student ("Khush",05);
		List<Student> mylist=new ArrayList<Student>();
		mylist.add(s1);
		mylist.add(s2);
		mylist.add(s3);
		mylist.add(s4);
		mylist.add(s5);
		FileOutputStream  fos=null;
		try {
			fos=new FileOutputStream("D:\\collection student\\Myclass.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			oos.writeObject(mylist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("D:\\collection student\\Myclass.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ois=new ObjectInputStream(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<?>ref=null;
		try {
			ref=(List<?>)ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator<?> itr=ref.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
