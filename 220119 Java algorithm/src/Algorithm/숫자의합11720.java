package Algorithm;

import java.util.Scanner;

public class ��������11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String n = sc.next();                //1. �Է��� String���� �ް� //���� nextLine()�̶� ���̰� �ֳ� 
		int sum = 0;
		
		String s[] = n.split("");            //���� split���� �ɰ��� �� arr[]�� �������ֳ�
		int arr[] = new int[num];
		
		for(int i=0; i<s.length; i++) {
			arr[i] = Integer.parseInt(s[i]); //2. Integer.parseInt(���ڿ�)�� ���� ������ ����
			sum+=arr[i];                     //3. ������ intŸ�� ������ sum�� ��
		}
		System.out.print(sum);
	}
}
