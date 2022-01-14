
public class practice02_04 {

	public static void main(String[] args) {
		//연습문제 02_04
		
		System.out.println("");
		System.out.println("다음 중 변수를 잘못 초기화 한 것은? 1.2.3.4");
		System.out.println("1. byte b = 256; "); //byte의 범위 (-128~127)를 넘는 값으로 초기화 할 수 없음.
		System.out.println("2. char c = '';"); // char는 반드시 한 개의 문자를 지정해야함
		System.out.println("3. char answer = 'no';");  // char에 두 개의 문자를 저장할 수 없음. 
		System.out.println("4. float f = 3.14"); // 3.14 3.14d . f 는 의 생략된 형태 접미사 를 붙이거나 형변환필요
		System.out.println("5. double d = 1.4e3f;"); // double(8byte) float (4byte) OK
		
		
	}

}
