// 8958λ²?
// arr[i].charAt(j)?΄?©?΄? split()? arr? char? ? κ·?
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
			int cnt=0;  //?¬κΈ? μ΄κΈ°??μΌμ€?Όμ§? ?€? quiz[]?λ©΄μ cntλ₯? ?Έμ§?
			int sum=0;  //sum? μ΄κΈ°?
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
