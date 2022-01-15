
public class practice03_02 {

	public static void main(String[] args) {
		//연습문제 03_02
		
	System.out.println("다음 연산의 결과를 적으시오.");
	
	int x = 2;
	int y = 5;
	char c = 'A'; // 'A'의 문자코드는 65
	
	System.out.println( y >= 5 || x < 0 && x > 2);
	System.out.println(y += 10 - x++);
	System.out.println(x += 2);
	System.out.println(!('A' <= c && c <= 'Z'));
	System.out.println('C' - c);
	System.out.println('5' - '0');
	System.out.println(c + 1);
	System.out.println(++c);
	System.out.println(c++);
	System.out.println(c);
	}

}
