
public class practice04_05 {

	public static void main(String[] args) {
		// 연습문제 04_05
		
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
//		********
//		*********
//		**********
//		***********
		
		/*System.out.println("다음의 for문을 while문으로 변경하시오.");
		
		for(int i=0; i<=10; i++) {
			
			for(int j=0; j<=i; j++)
			
				System.out.print("*");
			
				System.out.println();
		}
		*/
		int i=0;
		
		while( i<=10) {
		
			int j=0;
			
				while(j<=i) {
					
					System.out.print("*");
					
					j++;
					
				} // 안쪽 while문의 끝
				
					System.out.println();
			
					i++;
				
		} // 바깥쪽 while문의 끝

	} // main의 끝

}
