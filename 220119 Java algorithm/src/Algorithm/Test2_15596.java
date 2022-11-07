//배열을 쓰는이유. 관련있는 값들을 배열이라는 하나의 변수에 담을 수 있어, 
//코드의 가독성이 높아지고, 변수의 수를 줄여주고, 연산에 편리, 보통 코드의 가독성 때문이구나.
package Algorithm;
import java.util.Scanner;

public class Test2_15596 {
	static int sum(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		} return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		
		for(int i=0; i<n; i++) {
			int input = sc.nextInt(); //변수를 일일이 생성하지말고, 이렇게 배열로 쓰는걸 습관들여라. 왜? 
			a[i] = input;
		}
		System.out.println(sum(a));
	}
}
