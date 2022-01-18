
public class practice04_03 {

	public static void main(String[] args) {
		// 연습문제 04_03
		
		System.out.println("1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오.");

		int sum = 0;
		
		int totalSum = 0;
		
			for(int i=1; i <=10; i++) {
				
				sum += i;
			
				totalSum += sum;
			
			}//for문의 끝
		
		System.out.println("totalSum="+totalSum);
		
	} //main의 끝

}
