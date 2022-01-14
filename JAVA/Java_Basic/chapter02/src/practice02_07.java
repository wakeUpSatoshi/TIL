
public class practice02_07 {

	public static void main(String[] args) {
		//연습문제 02_07
		
		System.out.println("");
		System.out.println("다음 문장들의 출력결과를 적으세요.");
		System.out.println("오류가 있는 문장의 경우, 괄호 안에 '오류'라고 적으세요.");
		System.out.println("");
		System.out.println("1" + "2"); 	 //(12 ) 
		System.out.println(true + ""); 	 //(true )
		System.out.println('A' + 'B');   //(131 )
		System.out.println('1' + 2); 	 //(51 )
		System.out.println('1' + '2');   //(99 )
		System.out.println('J' + "ava"); //(Java )
		System.out.println(true + null); //(오류)
		
		/*
		[ ] 해설 
		
		문자열과 덧셈연산을 하면 그 결과는 항상 문자열이 된다.
		문자열 + any type → 문자열 + 문자열 → 문자열
		any type + 문자열 → 문자열 + 문자열 → 문자열
		"" + 7 "" + "7" "7" // . → → 빈 문자열을 더해서 숫자를 문자열로 변환한다
		7 + "" "7" + "" "7" → →
		7 + " " "7" + " " "7 " → →
		" " + 7 " " + "7" " 7" → →
		7 + "7" "7" + "7" "77" → →
		7 + 7 + "" 14 + "" "14" + "" "14" → → →
		"" + 7 + 7 "7" + 7 "7" + "7" "77" → → →
		true + "" "true" + "" "true" → →
		null + "" "null" + "" "null" → →
		하지만 문자와 문자의 덧셈연산의 결과는 형 정수값이 된다 왜냐하면 형보다 작은 int . int
		타입 은 형으로 변환된 후에 덧셈연산이 진행되기 때문이다 (byte, char, short) int .
		'A'+'B' , char + char int + int int int 의 경우 의 과정을 통해 최종결과는 형 정수 → →
		값이 된다 장에서 자세히 설명 .(3 )
		'A'+'B' 65 + 66 131 'A' 'B' 65 66 . → → 와 의 문자코드의 값은 각각 와 이다
		'1'+2 49 + 2 51 '1' 49 . → → 의 문자코드의 값은 이다
		'1'+'2' 49 + 50 99
		*/
	}

}
