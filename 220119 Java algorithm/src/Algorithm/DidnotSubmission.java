package Algorithm;
// 5597번
import java.util.Scanner;

public class DidnotSubmission {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[31]; //1번부터 30번까지 index번호가 있어야 하니까 length는 31(0~30번)
		
		for(int i=1; i<=28; i++) {
			int successindex = sc.nextInt();
			arr[successindex] = 1; //제출한 학생들[출석번호]에다가 제출완료의 1을 할당
		}
		
		for(int i=1; i<arr.length; i++) { //1~30까지 확인
			if(arr[i]!=1) {
				System.out.println(i); //제출하지 않은 [출석번호]출력
			}
		}
	}
}
