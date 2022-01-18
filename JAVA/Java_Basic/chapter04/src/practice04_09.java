
public class practice04_09 {

	public static void main(String[] args) {
		// 연습문제 04_09
		
//		int num , 타입의 변수 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완
//		성하라 만일 변수 의 값이 라면 . num 12345 , ‘1+2+3+4+5’ 15 의 결과인 를 출력하라 에 . (1)
//		알맞은 코드를 넣으시오.
		
		int num = 12345;
		
		int sum = 0;
		
		while(num > 0) {
		
			sum += num%10;
		
			num /= 10;
		
		}// while문의 끝
		
		System.out.println("sum="+sum);
		
	} //main의 끝

}
