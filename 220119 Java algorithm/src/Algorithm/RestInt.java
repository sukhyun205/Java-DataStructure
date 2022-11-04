//3052 나머지수 구하기
//boolean배열 이용
package Algorithm;
import java.util.Scanner;

public class RestInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean arr[] = new boolean[42]; //0~42까지 나머지경우수 만큼 boolean배열생성
		int count=0;
		
		for(int i=0; i<10; i++) {        //10번만큼 n생성 후
			int n = sc.nextInt();        //생성
			arr[n%42] = true;            //boolean배열에 해당index의 값을 true로 변경
		}
		
		for(int i=0; i<arr.length; i++) {//boolean에서 true값 검사
			if(arr[i]==true) {           //만약 true라면
				count++;                 //cnt++
			}
		}
		System.out.println(count);
	}
}
