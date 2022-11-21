package Algorithm;
import java.util.Scanner;
//브루트포스의 포인트는 조건 내 가능한 모든 경우의 수를 검사한다는 것

public class 블랙잭2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //카드개수
		int M = sc.nextInt(); //블랙잭값
		int sum = 0; //M과 비교할 sum
		int max = 0;
		int arr[] = new int[n]; //배열
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}sc.close();
		
		//x개의 카드를 뽑는 모든 경우의 수를 구하기 위해 x번 for문 실행
		for(int i=0; i<n; i++) {
			for(int j=1; j<n; j++) {
				for(int k=2; k<n; k++) {
					if(arr[i] != arr[j] && arr[j] != arr[k] && arr[i] != arr[k]) { //그렇지 중복허용 안하려면 3개값이 다 다르면 되지
						if(arr[i]+arr[j]+arr[k] <= M) {                      //3개 카드값 합이 <= M
							sum = arr[i]+arr[j]+arr[k];                      //sum에 3개 카드값합 넣고
							if(max<sum) {                                    //max가 M에 한없이 가깝도록 M이하, max이상 값을 sum에 할당
								max = sum;
							}
						}System.out.println("i:"+i+" j:"+j+" k:"+k+" sum:"+sum+" max:"+max); //체크용
					}
				}
			}
		}
		System.out.println(max); //M에 가장 가까운 max값 출력
	}
}
