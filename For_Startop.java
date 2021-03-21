
public class For_Startop {

	public static void main(String[] args) {
		int row_Star;
		int line;
		
		// 별탑을 거꾸로
		
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
