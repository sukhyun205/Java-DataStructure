package Algorithm;
//더하기사이클1110번
//핵심은 새로운 n을 구하는 알고리즘작성, n의 일의자리수를%10해야한다는점
import java.util.Scanner;
public class PlusCycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //주어진 입력값 ex)26
		int count = 0;        //사이클횟수측정의 count
		int copy = n;         //while문 종료를 위한 n과 비교하기 위한 copy
		
		while(true) {
			n = ((n%10)*10) + (((n/10)+(n%10))%10); //새로운 n의 10자릿수 + 1자릿수 ex)60+8=68, 80+4=84, 40+2=42, 20+6=26
			count++;                           //사이클횟수+1 총사이클횟수=4번
                                               //총사이클횟수=4번
			if(n==copy) {                      //while문을 빠져나가기위한 if문
				System.out.println(count);     //count출력
				break;                         //종료
			}
		}
	}
}
