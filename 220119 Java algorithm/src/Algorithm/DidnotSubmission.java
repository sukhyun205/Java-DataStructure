package Algorithm;
// 5597��
import java.util.Scanner;

public class DidnotSubmission {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[31]; //1������ 30������ index��ȣ�� �־�� �ϴϱ� length�� 31(0~30��)
		
		for(int i=1; i<=28; i++) {
			int successindex = sc.nextInt();
			arr[successindex] = 1; //������ �л���[�⼮��ȣ]���ٰ� ����Ϸ��� 1�� �Ҵ�
		}
		
		for(int i=1; i<arr.length; i++) { //1~30���� Ȯ��
			if(arr[i]!=1) {
				System.out.println(i); //�������� ���� [�⼮��ȣ]���
			}
		}
	}
}
