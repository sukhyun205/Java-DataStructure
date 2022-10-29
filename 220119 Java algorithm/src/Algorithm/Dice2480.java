package Algorithm;
//2480주사위 세개
import java.util.Scanner;
public class Dice2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] arr = {a,b,c};
		
		if(a==b && b==c && a==c) {
			System.out.println(10000+(a*1000));
		}
		else if(a==b || a==c) {
			System.out.println(1000+(a*100));
		}
		else if(b==a || b==c) {
			System.out.println(1000+(b*100));
		}
		else if(c==a || c==b) {
			System.out.println(1000+(c*100));
		}
		else {
			int max = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>max) {
					max = arr[i];
				}
			} System.out.println(max*100);
		}
	}
}
