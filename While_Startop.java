
public class While_Startop {

	public static void main(String[] args) {
		int row_Star = 5;
		int line = 0;
		
		//  Startop reverse
		
		while(true) {
			if(row_Star == 0) break;
			
			while(line < row_Star) {
				System.out.print("*");
				line++;
			}
			
			line = 0;
			System.out.println();
			row_Star--;
			
		}

	}

}
