//3중for문
package Algorithm;
import java.util.Scanner;

public class 문자열반복2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int n = sc.nextInt();
			String s = sc.next();
			String []arr = new String[n*s.length()];
			arr = s.split("");
			
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<n; k++) {
//					System.out.println("n: "+n+" arr.length: "+arr.length);
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
	}
}
