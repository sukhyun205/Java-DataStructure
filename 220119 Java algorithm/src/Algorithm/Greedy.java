//11047 동전개수
package Algorithm;
import java.util.Scanner;

public class Greedy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //동전종류 개수
		int K = sc.nextInt(); //동전값의 총합 가격 = 16
		int arr[] = new int[N]; //동전종류개수만큼 배열생성
		int count=0;  //내가 최종적으로 출력할 동전개수
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();  //1, 5, 10, 50.. 동전단위입력
//			System.out.print(arr[i]+" ");
		}
//		System.out.println();
		
		for(int i=N-1; i>=0; i--) {
			if(arr[i]<=K) {
				count += (K/arr[i]); //count에 동전 4개 추가
				K = K%arr[i]; //총합가격K에다 나머지값 저장
//				System.out.println(K+" "+count);
			}
		}
		System.out.println(count);
	}
}
