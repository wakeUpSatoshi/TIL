
public class practice03_05 {

	public static void main(String[] args) {
		// 연습문제

		System.out.println("아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.");
		System.out.println("삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.");
		
		int num = 10;
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
	}

}
