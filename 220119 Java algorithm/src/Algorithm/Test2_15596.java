//�迭�� ��������. �����ִ� ������ �迭�̶�� �ϳ��� ������ ���� �� �־�, 
//�ڵ��� �������� ��������, ������ ���� �ٿ��ְ�, ���꿡 ��, ���� �ڵ��� ������ �����̱���.
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
			int input = sc.nextInt(); //������ ������ ������������, �̷��� �迭�� ���°� �����鿩��. ��? 
			a[i] = input;
		}
		System.out.println(sum(a));
	}
}
