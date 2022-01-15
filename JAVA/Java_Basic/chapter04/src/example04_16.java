
public class example04_16 {

	public static void main(String[] args) {
		// 예제 04_16
		
		int sum = 0;
		int i	= 0;
		
		while(true) {
			if(sum > 100)
				break;
			++i;
			sum += i;
		} // while문의 끝
		
		System.out.println("i=" +i);
		System.out.println("sum" + sum);
	}// main의 끝

}
