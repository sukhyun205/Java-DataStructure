//평균은 넘겠지 4344
//%%있고 없고 차이로 맞고 틀리다 왜???
package Algorithm;
import java.util.Scanner;

public class 평균은넘겠지4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //케이스 개수
		
		for(int i=0; i<n; i++) {
			int student=sc.nextInt(); //학생수 입력
			int arr[] = new int[student]; //점수를 넣기 위한 배열생성
			int sum=0;
			int cnt=0;
			
			for(int j=0; j<student; j++) {
				arr[j] = sc.nextInt(); //성적입력
				sum+=arr[j];
			}
			
			for(int k=0; k<student; k++) { //평균보다 높은 성적의 학생비율을 알기위해 배열에 접근
				if(arr[k]>sum/student) {   //평균보다 높은 학생이 있을경우
					cnt++;                 //cnt+1
				}
			}
			System.out.printf("%.3f%%\n",(float)cnt/student*100); //최종적으로 비율을 소수점3자리까지 출력
		}                                                         //%%있고 없고 차이로 맞고 틀리다 왜???
	}
}
