package Algorithm;
//10807
import java.util.Scanner;

public class CountTarget {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				count++;
			}
		}
		System.out.println(count);
	}
}
