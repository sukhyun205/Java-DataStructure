//����� �Ѱ��� 4344
//%%�ְ� ���� ���̷� �°� Ʋ���� ��???
package Algorithm;
import java.util.Scanner;

public class ������Ѱ���4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //���̽� ����
		
		for(int i=0; i<n; i++) {
			int student=sc.nextInt(); //�л��� �Է�
			int arr[] = new int[student]; //������ �ֱ� ���� �迭����
			int sum=0;
			int cnt=0;
			
			for(int j=0; j<student; j++) {
				arr[j] = sc.nextInt(); //�����Է�
				sum+=arr[j];
			}
			
			for(int k=0; k<student; k++) { //��պ��� ���� ������ �л������� �˱����� �迭�� ����
				if(arr[k]>sum/student) {   //��պ��� ���� �л��� �������
					cnt++;                 //cnt+1
				}
			}
			System.out.printf("%.3f%%\n",(float)cnt/student*100); //���������� ������ �Ҽ���3�ڸ����� ���
		}                                                         //%%�ְ� ���� ���̷� �°� Ʋ���� ��???
	}
}
