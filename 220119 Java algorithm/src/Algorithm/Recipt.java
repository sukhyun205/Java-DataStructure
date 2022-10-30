package Algorithm;
//25304
import java.util.Scanner;
public class Recipt {
	static Scanner sc = new Scanner(System.in);
	static void sum(int p, int p_n, int r, int n) {
		int sum=0;
		for(int i=0; i<n; i++) {
			p = sc.nextInt();
			p_n = sc.nextInt();
			sum+=(p*p_n);
		}
		if(sum==r) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
	public static void main(String[] args) {
		int receipt = sc.nextInt();
		int n = sc.nextInt();
		int p = 0;
		int p_n = 0;
		
		sum(p, p_n, receipt, n);
	}
}
