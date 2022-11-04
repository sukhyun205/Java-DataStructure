// 8958ë²?
// arr[i].charAt(j)?´?š©?•´?„œ split()?œ arr?˜ char?— ? ‘ê·?
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
			int cnt=0;  //?—¬ê¸? ì´ˆê¸°?™”?‹œì¼œì¤˜?•¼ì§? ?‹¤?‹œ quiz[]?Œë©´ì„œ cntë¥? ?„¸ì§?
			int sum=0;  //sum?„ ì´ˆê¸°?™”
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
