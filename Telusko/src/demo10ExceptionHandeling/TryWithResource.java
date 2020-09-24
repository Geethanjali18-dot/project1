package demo10ExceptionHandeling;
//java 1.7
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
public static void main(String[] args) throws IOException {
	
	
	try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
	{
		String str="";
		str=br.readLine();
		
	}
	//as soon as try block executed resource will be deallocated 
	//just to close resource no need to write below code refer above code
	/*catch (IOException e)
	{
		
		e.printStackTrace();
	}*/
	//just to close resource no need to write below code refer above code 
	/*finally
	{
		br.close();
	}*/
	
}
}
