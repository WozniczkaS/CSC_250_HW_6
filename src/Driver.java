import java.net.URL;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter your age: ");
		//String age = input.nextLine();
		//System.out.println(Integer.parseInt(age) + 2);
		//int age = input.nextInt();
		//System.out.println(age + 2);
		
		String cardJson = Driver.getJSON("https://api.hearthstonejson.com/v1/25770/enUS/cards.json");
		System.out.println(cardJson);
	}
	
	static String getJSON(String urlString)
	{
		String line = "";
		try 
		{
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			
			while (input.hasNext())
			{
				line += input.nextLine();
			}
			input.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			line = "Can't Connect";
		}
		return line;
	}

}
