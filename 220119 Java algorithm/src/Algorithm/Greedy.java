//11047 ��������
package Algorithm;
import java.util.Scanner;

public class Greedy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //�������� ����
		int K = sc.nextInt(); //�������� ���� ���� = 16
		int arr[] = new int[N]; //��������������ŭ �迭����
		int count=0;  //���� ���������� ����� ��������
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();  //1, 5, 10, 50.. ���������Է�
//			System.out.print(arr[i]+" ");
		}
//		System.out.println();
		
		for(int i=N-1; i>=0; i--) {
			if(arr[i]<=K) {
				count += (K/arr[i]); //count�� ���� 4�� �߰�
				K = K%arr[i]; //���հ���K���� �������� ����
//				System.out.println(K+" "+count);
			}
		}
		System.out.println(count);
	}
}
