package Algorithm;
import java.util.Scanner;

//N을 입력받으면, 1~n만큼의 분해값이 들어간 arr[n]를 만들어 값할당,
//arr[] 내 최대값 max만큼, 비교하기 위한 c[max]를 만들어 값할당
//후에 c[j]값과 arr[i]값을 2중for문으로 비교해서, 
//값이 일치하는 복수의 i들 중에서, 가장 작은 값을 min으로 해서 출력하려했는데

//발생문제: 110 입력시 예상값은 98,107중에서 98이었는데, 119의 생성자에 해당하는 109가 출력됨
//예상발생문제: 결국 자리수만큼 분해값을 만들어야하는데, 100000000과 같은 큰 수에는 대응못함 -> while문 계산필요

public class 분해합2231자리수문제해결필요 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();

		int n = 110;
		int arr[] = new int[n+1];
		
		for(int i=1; i<=n; i++) {  //분해값이 들어있는 arr[]생성
			if(i<10) {
				arr[i] = (i + (i%10));
			}
			else if(i<100) {
				arr[i] = (i + (i/10+(i%10)));
			}
			else if(i<1000) {
				arr[i] = (i + ((i/100)+((i/10)%10)+(i%10)));
			}
		}
		
		for(int i=1; i<arr.length; i++) {
			System.out.print(arr[i]+" "); //출력으로 체크용
		}
		
		System.out.println();
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}System.out.println("최대분해값: "+max);
		
		int c[] = new int[max+1]; //120칸짜리 1~119까지넣을 배열c[]
		
		for(int i=1; i<c.length; i++) {
			c[i] = i;
			System.out.print(c[i]+" "); //c[]값 체크
		}
		
		int min = c[1]; //min에 1초기화
		for(int j=0; j<c.length; j++) {
			for(int i=0; i<arr.length; i++) {
				if(c[j] == arr[i]) { //만약 c[j]:c[115]=115랑 arr[i]:arr[98]=115가 같다면 
					min = i; //98을 내가 출력하고 싶은거니까 min에다 i(=98)을 할당
				}
			}
		}
		System.out.println("\n"+min);
	}
}