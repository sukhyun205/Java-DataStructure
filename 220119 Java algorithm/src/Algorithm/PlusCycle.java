package Algorithm;
//���ϱ����Ŭ1110��
//�ٽ��� ���ο� n�� ���ϴ� �˰����ۼ�, n�� �����ڸ�����%10�ؾ��Ѵٴ���
import java.util.Scanner;
public class PlusCycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //�־��� �Է°� ex)26
		int count = 0;        //����ŬȽ�������� count
		int copy = n;         //while�� ���Ḧ ���� n�� ���ϱ� ���� copy
		
		while(true) {
			n = ((n%10)*10) + (((n/10)+(n%10))%10); //���ο� n�� 10�ڸ��� + 1�ڸ��� ex)60+8=68, 80+4=84, 40+2=42, 20+6=26
			count++;                           //����ŬȽ��+1 �ѻ���ŬȽ��=4��
                                               //�ѻ���ŬȽ��=4��
			if(n==copy) {                      //while���� �������������� if��
				System.out.println(count);     //count���
				break;                         //����
			}
		}
	}
}
