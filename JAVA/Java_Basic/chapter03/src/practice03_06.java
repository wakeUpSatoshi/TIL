
public class practice03_06 {

	public static void main(String[] args) {
		// 연습문제 03_06
		
		System.out.println("아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.");
		System.out.println("변환공식이 'C =5/9 X (F-32)'라고 할 때, (1)에 알맞은 코드를 넣으시오.");
		System.out.println("단, 변환 결과값은 소수점 셋째자리에서 반올림해야 한다.");
		System.out.println("(Math.round()를 사용하지 않고 처리 할 것)");
		
			int fahrenheit = 100;
			float celcius =(int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
		
		System.out.println("Fahrenheit : "+fahrenheit);
		System.out.println("Celcius : "+celcius);

	}

}
