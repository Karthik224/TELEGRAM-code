import java.util.Scanner;
import java.io.*;  
import java.net.*;  
public class MyClient 
{  
	public static void main(String[] args) 
	{  
		try
		{      
			Socket s=new Socket("localhost",6666);  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			Scanner k=new Scanner(System.in);
			int i,j;
			String oup="";
			char[] eng={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0',',','.','?'};
			String[] mor={".-","-...","-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                			".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                			"...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                			"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                			"-----", "--..--", ".-.-.-", "..--.."};
			System.out.println("Enter input string: ");
			String inp=k.nextLine();
			for(i=0;i<inp.length();i++)
			{
				for(j=0;j<eng.length;j++)
				{
					if(inp.charAt(i)==eng[j])
						oup=oup+mor[j]+" ";
				}
			}  
			String str=oup;
			dout.writeUTF(str);  
			dout.flush();  
			dout.close();  
			s.close();  
		}
		catch(Exception e){System.out.println(e);}  
	}  
}  
