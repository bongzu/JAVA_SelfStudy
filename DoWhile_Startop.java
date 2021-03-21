
public class DoWhile_Startop {

	public static void main(String[] args) {
		int row_Star = 5;
		int line = 0;
		
		do {
			do {				
				System.out.print("*");
				line++;
			
			}while(line < row_Star);
			
			System.out.println();
			
			line = 0;
			row_Star--;
			
		}while(row_Star > 0);

	}

}
