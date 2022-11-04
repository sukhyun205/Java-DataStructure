// 1546¹ø
// Æò±ÕÁ¶ÀÛ¹®Á¦
package Algorithm;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float arr[] = new float[n];
		
		for(int i=0; i<arr.length; i++) {
			int score = sc.nextInt();
			arr[i] = score;
//			System.out.print(arr[i]+" ");
		}
		
		float max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
//		System.out.println("¸Æ½º: "+max);
		
		float sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = (arr[i]/max)*100;
//			System.out.print(arr[i]+" ");
			sum+=arr[i];
		}
		System.out.println(sum/n);
	}
}
