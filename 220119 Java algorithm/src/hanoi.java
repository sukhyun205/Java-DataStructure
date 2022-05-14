
//2019113394 권석현
//[일반 과제] 07 재귀 및 정렬 1 분반 과제
//하노이탑 구현

import java.util.Scanner;

class HanoiTower{
	
	
	public void move(int from, int middle, int to, int n) {
		
		if(n==0) {
			return;
		}
		else {
			move(from, to, middle, n-1); //n-1원판을 from에서 가운데 middle로 이동
			System.out.printf(n+"번원판"+ " = " + "("+from+")에서 ->"+ "(" + to+")로 이동"); //n원판을 from에서 to로 이동
			System.out.println();
			move(middle, from, to, n-1); //n-1원판을 middle에서 최종적으로 to로 이동
		}
		
	}
}



public class hanoi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("참고: from=1, middle=2, to=3");
		System.out.print("원판갯수입력>> ");
		int n = sc.nextInt(); //원판의 갯수 n입력
		
		HanoiTower HT = new HanoiTower();
		
		HT.move(1,2,3,n); //원판을 옮기는 move메소드 실행 및 결과출력
		
		sc.close();
		
		
		


	}

}
