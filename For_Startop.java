
public class For_Startop {

	public static void main(String[] args) {
		int row_Star;
		int line;
		
		// Startop reverse 
		
		for (row_Star=5; row_Star>=0; row_Star--)
		{
			for(line=0; line < row_Star; line++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
