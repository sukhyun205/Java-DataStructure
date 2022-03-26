import java.util.InputMismatchException;
import java.util.Scanner;




public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		

		int mode=4;
		int arr_length = 0; //�迭�� ����(�� ����) 0 �ʱ�ȭ
		int size=0; //�迭 �� �������� ���� 0 �ʱ�ȭ
		
		System.out.print("�迭�� ���̸� ������ �Է��Ͻÿ�>> ");
		arr_length = sc.nextInt();
		System.out.print("�迭�� size(������ ����)�� �Է��Ͻÿ�>> ");
		size = sc.nextInt();
		
		int []arr = new int[arr_length];
		
		System.out.print("�ְ����ϴ� ���� �����Ͱ��� ����� �Է��Ͻÿ�>> ");
		while (true) {
			try {
				for (int i=0; i<size; i++) { 
					arr[i] = sc.nextInt(); 
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				System.out.println("���� ������ ����(size) = "+size+"��");
				System.out.println();
				break;
			} 
			catch(InputMismatchException ime) {
				sc = new Scanner(System.in);  
				System.out.print("error! ���ڰ� �ƴ� ���ڸ� �Է����ּ���>> ");
			}
		}
		
		System.out.println(" [menu] ");
		System.out.println(" 0: exit");
		System.out.println(" 1: �� ��������");
		System.out.println(" 2: ���� (���� ����)");
		System.out.println(" 3: ���� (�߰��� ����)");
		
		while(mode!=0) {
			System.out.print("��ɾ 0~3���� �Է��Ͻÿ�>> ");
			mode = sc.nextInt();
			switch(mode) {
			
			case 0:
				System.exit(0);
				break;
				
			case 1:
				System.out.print("���° ���� �������ðڽ��ϱ�? ");
				int k = sc.nextInt();
				System.out.println(k +"��°�� ��°��: "+ arr[k-1]);
				System.out.println("�ݵ�� �迭 ������ üũ arr_length: "+arr_length);
				System.out.println("�ݵ�� �迭�� ������ ���� üũ size: "+size);
				System.out.println();
				break;
			case 2:
				System.out.print("���� (���� ����)");

				break;
				
				
				
			case 3:
				System.out.print("������ ��ġ(���°) �Է�>> ");
				int index = sc.nextInt();
				System.out.print("������ �� �Է�>> ");
				int data = sc.nextInt();
				
				if (size>=arr_length) {    //��ü �迭ũ�⸦ 2��� Ȯ��
					arr_length*=2;
					System.out.println("arr_length= "+arr_length);
				} 

				for(int i=size; i>=index; i--) {
						arr[i] = arr[i-1];  //��ü �迭ũ��(arr_length)�� �÷���µ��� �ұ��ϰ� ���⼭ error�� �ߴ� ������ �����ϱ��????
				}
				arr[index-1] = data;

				size++;
				System.out.println("���� ������ ����(size) = "+size+"��");

				
				//���Ե� �� ���� ��ü�迭 ���
				System.out.print("���԰� ���� �迭���: ");
				for (int i=0; i<size; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println("\n");
				break;

				
				
				
			case 4:
				menu();
				break;
			}
			
			
		}
		
		
		sc.close();

	}
	
	static void menu() {
		System.out.println(" [menu] ]");
		System.out.println(" 0: exit");
		System.out.println(" 1: input (King Info.)");
		System.out.println(" 2: show (King List)");
		System.out.println(" 3: menu");
	}

}
