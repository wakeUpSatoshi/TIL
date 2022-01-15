
public class example04_07 {

	public static void main(String[] args) {
		// 예제 04_07
		int num = 0;
		
		
		//중괄호 {} 안의 내용을 5번 반복한다.
		for (int i = 1; i <= 5; i++) {
			num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
		}
		
	}//main의 끝

}
