package Map;
import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;

public class Quiz {

	public static void main(String[] args) 
	{
		Building[] b = new Building[8];
		fillArray(b);
		printArray(b);
		writeToFile(b);		
		
		private static void writeToFile(Building[] building)
		{
			try
			{
				PrintWriter fout= new PrintWriter(new FileOutputStream("Output.txt");
				fout.println(building.getType());
				fout.println(building.getId());
				fout.println(building.getName());

			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		
		public void printArray(Building[] b2)
		{
			for(int i=0;i<8;i++)
				System.out.println(b.getId() + "-" + b.getName() + "-" + b.getType());
		}
		
		
		
		public void fillArray(Building[] b)
		{
			int count=0;
		Scanner scan =null;
		try{
			scan = new Scanner(new FileInputStream("campusUH.txt"));
			while(scan.hasNext())
			{
				String line = scan.nextLine();
				StringTokenizer z = new StringTokenizer(line, "-");
				b[count]= new Building();
				b[count]=setType(scan.next());
				b[count]=setId(scan.next());
				b[count]=setName(scan.next());
				count++;
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();	
		}
		scan.close();
		}		
		

		}

	private static Building setName(String next) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Building setId(String next) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Building setType(String next) {
		// TODO Auto-generated method stub
		return null;
	}

}
