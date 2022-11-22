package Algorithm;
import java.util.Scanner;

//N�� �Է¹�����, 1~n��ŭ�� ���ذ��� �� arr[n]�� ����� ���Ҵ�,
//arr[] �� �ִ밪 max��ŭ, ���ϱ� ���� c[max]�� ����� ���Ҵ�
//�Ŀ� c[j]���� arr[i]���� 2��for������ ���ؼ�, 
//���� ��ġ�ϴ� ������ i�� �߿���, ���� ���� ���� min���� �ؼ� ����Ϸ��ߴµ�

//�߻�����: 110 �Է½� ������ 98,107�߿��� 98�̾��µ�, 119�� �����ڿ� �ش��ϴ� 109�� ��µ�
//����߻�����: �ᱹ �ڸ�����ŭ ���ذ��� �������ϴµ�, 100000000�� ���� ū ������ �������� -> while�� ����ʿ�

public class ������2231�ڸ��������ذ��ʿ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();

		int n = 110;
		int arr[] = new int[n+1];
		
		for(int i=1; i<=n; i++) {  //���ذ��� ����ִ� arr[]����
			if(i<10) {
				arr[i] = (i + (i%10));
			}
			else if(i<100) {
				arr[i] = (i + (i/10+(i%10)));
			}
			else if(i<1000) {
				arr[i] = (i + ((i/100)+((i/10)%10)+(i%10)));
			}
		}
		
		for(int i=1; i<arr.length; i++) {
			System.out.print(arr[i]+" "); //������� üũ��
		}
		
		System.out.println();
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}System.out.println("�ִ���ذ�: "+max);
		
		int c[] = new int[max+1]; //120ĭ¥�� 1~119�������� �迭c[]
		
		for(int i=1; i<c.length; i++) {
			c[i] = i;
			System.out.print(c[i]+" "); //c[]�� üũ
		}
		
		int min = c[1]; //min�� 1�ʱ�ȭ
		for(int j=0; j<c.length; j++) {
			for(int i=0; i<arr.length; i++) {
				if(c[j] == arr[i]) { //���� c[j]:c[115]=115�� arr[i]:arr[98]=115�� ���ٸ� 
					min = i; //98�� ���� ����ϰ� �����Ŵϱ� min���� i(=98)�� �Ҵ�
				}
			}
		}
		System.out.println("\n"+min);
	}
}