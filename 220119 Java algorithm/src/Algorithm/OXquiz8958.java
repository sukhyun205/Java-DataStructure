// 8958�?
// arr[i].charAt(j)?��?��?��?�� split()?�� arr?�� char?�� ?���?
package Algorithm;
import java.util.Scanner;

public class OXquiz8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String []quiz = new String[n];
		
		for(int i=0; i<n; i++) {
			quiz[i] = sc.next();
		}
		
		for(int i=0; i<n; i++) {
			String []answer = quiz[i].split("");
			int cnt=0;  //?���? 초기?��?��켜줘?���? ?��?�� quiz[]?��면서 cnt�? ?���?
			int sum=0;  //sum?�� 초기?��
			for(int j=0; j<answer.length; j++) {
				if(quiz[i].charAt(j)=='O') {
					cnt++;
				}else {
					cnt=0;
				}sum+=cnt;
			}System.out.println(sum);
		}
	}
}
