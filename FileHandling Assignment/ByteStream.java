/* 3) write a file copy program using byte streams.
( FileOutputStream and FileInputStream )*/


package fileshandlingassignment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteStream {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String s=null;
		 byte[] arr=null;
		 File f=new File("D:\\FileAssignment\\file3byte.txt");
		try (FileInputStream fis= new FileInputStream(f))
		{
			arr=new byte[(int)f.length()];
			fis.read(arr);
			s=new String(arr);
			System.out.println(s);
		}

		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		File c= new File("D:\\FileAssignment\\file3stream.txt");
		try(FileOutputStream fos = new FileOutputStream(c,true))
		{
			int len=(int)f.length();
			fos.write(arr,0,len);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		}

	}

