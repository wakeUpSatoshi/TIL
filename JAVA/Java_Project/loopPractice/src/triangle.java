
public class triangle {

	public static void main(String[] args) {
		// 		삼각형
		
		//		   * 
		//		  *** 
		//		 ***** 
		//		******* 

		for(int i = 5; i > 0 ; i--) {
			
			for (int j = i - 1; j > 0 ; j--) {
				System.out.print(" ");
			}
			
			for (int k=1 ; k <= 2 * (5 - i)-1 ; k++) {
				System.out.print("*");;
			}
			
			System.out.println(" ");
		
		}

	} //main의 끝

}
