import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class h12 {
	
		public static void main (String[] args)
		{
		System.out.println("請輸入字串");
		try
		{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println("已輸入字串"+str);
					
		}
		catch(IOException e)
		{
			System.out.println("出入輸出有誤");
		}
		}
	}


