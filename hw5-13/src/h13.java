import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class h13 {
	
		public static void main (String[] args)
		{
		
		try
		{
FileWriter fw = new FileWriter("test.txt");
PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
pw.println("Hello");
pw.println("GoodBye");
pw.close();
System.out.println("資料已經寫入檔案了");
					
		}
		catch(IOException e)
		{
			System.out.println("請輸出入有誤");
		}
		}
	}


