//�̷��� ���� �߸��ƴ��� �𸣰�����, ������ �����ְų�, ���������ϰ� �ٽ� �����ϴ� �ű���.........
//30�е��� i�� n���� �߸��� ���·� �����־���...
//������: 12�� �Է��ϸ�, �����ڸ����ڰ� ���⶧���� �굵 cnt�ȴ�. 012�̷������� �����ʴ��̻� �װ� �����
//��!!!! i�� ������ �����ϴ� ����!! ó������ �ǹ����� ����˻����ϰ� ����!!!!
package Algorithm;

import java.util.Scanner;

public class �Ѽ�1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = {0,1,2,3,4,5,6,7,8,9};
		int cnt = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i<100) { //i�� 100�̸�
					if(((i/10)%10)-arr[j]==i%10) { //���� �ڸ�
//						System.out.println(i+" �����ڸ�");
//						System.out.println(arr[j]);
						cnt++;
					}
					else if(((i/10)%10)+arr[j]==i%10) { //���� �ڸ�
//						System.out.println(i+" �����ڸ�");
//						System.out.println(arr[j]);
						cnt++;
					}
				}
				
				if(i>99) { //i�� 100�̻�
					if((i/100)-arr[j]==(i/10)%10 && ((i/10)%10)-arr[j]==i%10) {
//						System.out.println(i+" �����ڸ�");
//						System.out.println(arr[j]);
//						System.out.println((i/100)-arr[j]+" "+(i/10)%10);
//						System.out.println((i/10)%10+" "+arr[j]+" "+i%10);
						cnt++;
					}
					else if((i/100)+arr[j]==(i/10)%10 && ((i/10)%10)+arr[j]==i%10) {
//						System.out.println(i+" �����ڸ�");
//						System.out.println(arr[j]);
						cnt++;
					}
				}
			}
		}
		System.out.println(+cnt);
	}
}
