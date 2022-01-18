
public class practice04_02 {

	public static void main(String[] args) {
		// 연습문제 04_02
		
		System.out.println("1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.");
			
			int sum = 0;
				
				for(int i=1; i <=20; i++) {
			
					if(i%2!=0 && i%3!=0) //i 2 3 sum i . 가 또는 의 배수가 아닐 때만 에 를 더한다
						
						sum +=i;
				
				} // for문의 끝
				
			System.out.println("sum="+sum);
		
	} //main의 끝

}
