//3052 �������� ���ϱ�
//boolean�迭 �̿�
package Algorithm;
import java.util.Scanner;

public class RestInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean arr[] = new boolean[42]; //0~42���� ���������� ��ŭ boolean�迭����
		int count=0;
		
		for(int i=0; i<10; i++) {        //10����ŭ n���� ��
			int n = sc.nextInt();        //����
			arr[n%42] = true;            //boolean�迭�� �ش�index�� ���� true�� ����
		}
		
		for(int i=0; i<arr.length; i++) {//boolean���� true�� �˻�
			if(arr[i]==true) {           //���� true���
				count++;                 //cnt++
			}
		}
		System.out.println(count);
	}
}
