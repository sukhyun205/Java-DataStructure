import java.util.Scanner;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr_length = 0; //�迭�� ����(�� ����) 0 �ʱ�ȭ
		int size = 0; //�迭 �� �������� ���� 0 �ʱ�ȭ
		
		System.out.print("�迭�� ���̸� ������ �Է��Ͻÿ�>> ");
		arr_length = sc.nextInt();
		System.out.print("�迭�� size(������ ����)�� �Է��Ͻÿ�>> ");
		size = sc.nextInt();
		
		int []arr = new int[arr_length];
		
		System.out.print("�ְ����ϴ� ���� �����Ͱ��� ����� �Է��Ͻÿ�>> ");
		for (int i=0; i<size; i++) {
			arr[i] = sc.nextInt(); //�ݺ������� arr[i]���۷����� �Է��� �����͸� �־���
			System.out.print(arr[i] + " ");
		}
		
		
		sc.close();

	}

}