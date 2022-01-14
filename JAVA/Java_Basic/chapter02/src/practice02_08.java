
public class practice02_08 {

	public static void main(String[] args) {
		//연습문제 02_08

		//System.out.println("");
		//System.out.println("아래는 변수값 x,y,z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 (1)에 알맞는 코드를 넣으시오.");
		int x = 1;
		int y = 2;
		int z = 3;
		
		int tmp = x;
			x = y;
			y = z;
			z = tmp;
			
		System.out.println("x=" +x);
		System.out.println("y=" +y);
		System.out.println("z=" +z);
		
		/*
		x=2
		y=3
		z=1
		*/
	
	}

}
