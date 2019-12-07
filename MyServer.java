import java.io.*;  
import java.net.*;  
import java.lang.Thread;
public class MyServer 
{  
	public static void main(String[] args)
	{  
		try
		{  
			ServerSocket ss=new ServerSocket(6666);  
			Socket s=ss.accept();//establishes connection   
			DataInputStream dis=new DataInputStream(s.getInputStream()); 	 
			String  str1=(String)dis.readUTF();
			String inp1=str1;
			String[] inp2=inp1.split("\\s");
			String oup2="";
			int i,j;
			char[] eng={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0',',','.','?'};
			String[] mor={".-","-...","-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                	".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                	"...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                	"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                	"-----", "--..--", ".-.-.-", "..--.."};
			for(i=0;i<inp2.length;i++)
			{
				for(j=0;j<mor.length;j++)
				{
					if(inp2[i].equals(mor[j]))
						oup2=oup2+eng[j];
				}
			}
			System.out.println("Morse : "+str1);
			Thread.currentThread().sleep(2000);  
			System.out.println("message= "+oup2);  
			ss.close();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
	}  
}  
