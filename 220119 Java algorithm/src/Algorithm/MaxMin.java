package Algorithm;
//2562
import java.util.Scanner;

public class MaxMin {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
//		int max=0; //이렇게 하면 틀리다고 뜨네..?
//		int min=arr[0];
		int max=arr[0];
		int min=arr[0];
		
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.print(min+" "+max);
	}
}
