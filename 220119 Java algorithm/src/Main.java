import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		

		int mode=4;
		int arr_length=0; //�迭�� ����(�� ����) 0 �ʱ�ȭ
		int size=0; //�迭 �� �������� ���� 0 �ʱ�ȭ
		
		System.out.print("�迭�� ���̸� ������ �Է��Ͻÿ�>> ");
		arr_length = sc.nextInt();
		System.out.print("�迭�� size(������ ����)�� �Է��Ͻÿ�>> ");
		size = sc.nextInt();
		
		
		int []arr = new int[arr_length];
		
		System.out.print("�ְ����ϴ� ���� �����Ͱ��� ����� �Է��Ͻÿ�>> ");
		for (int i=0; i<size; i++) { 
			arr[i] = sc.nextInt(); 
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("�迭���� üũ arr_length: "+arr.length);
		System.out.println("���� ������ ����(size) = "+size+"��");
		System.out.println();
		
		
		System.out.println(" [menu] ");
		System.out.println(" 0: ���� �迭 ���");
		System.out.println(" 1: �� ��������");
		System.out.println(" 2: ���� (���� ����)");
		System.out.println(" 3: ���� (�߰��� ����)");
		System.out.println(" 4: ���� (�� ������ ����)");
		System.out.println(" 5: ���� (�߰� ������ ����)");
		System.out.println(" 6: ���� �迭 ���");
		System.out.println();
		
		while(mode!=0) {
			System.out.print("��ɾ 0~6���� �Է��Ͻÿ�(menu 7��)>> ");
			mode = sc.nextInt();
			
			switch(mode) {
			
			case 0:
				System.exit(0);
				break;
				
			case 1:
				System.out.print("���° ���� �������ðڽ��ϱ�? ");
				int k = sc.nextInt();
				System.out.println(k +"��°�� ��°��: "+ arr[k-1]);
				System.out.println();
				System.out.println("�迭���� üũ arr_length: "+arr.length);
				System.out.println("���� ������ ����(size) = " +size+"��");
				System.out.println("\n");
				break;
			case 2:
				System.out.print("���� (���� ����)");
				System.out.print("������ �� �Է�>> ");
				int end_data = sc.nextInt();
				
				if (size == arr.length) {
					int tmp2[] = new int[arr.length*2];
					for (int i=0; i<size; i++) {
						tmp2[i] = arr[i];
					}
					arr = tmp2;
					
					arr[size] = end_data;
					size++;
					
					System.out.println();
					System.out.print("���԰� ���� �迭���: ");
					
					for (int i=0; i<size; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();
					System.out.println("�迭���� üũ arr_length: "+arr.length);
					System.out.println("���� ������ ����(size) = "+size+"��");
					System.out.println("\n");
					break;
				} 
				else {
					arr[size] = end_data;
					size++;
					System.out.println("�迭���� üũ arr_length: "+arr.length);
					System.out.println("���� ������ ����(size) = "+size+"��");
					System.out.println();
					System.out.print("���԰� ���� �迭���: ");
					
					for (int i=0; i<size; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println("\n");
					break;
					
				}
				

				
				
				
			case 3: //�߰� ����
				System.out.print("���� (�߰��� ����)");
				System.out.print("������ ��ġ(���°) �Է�>> ");
				int index = sc.nextInt();
				System.out.print("������ �� �Է�>> ");
				int data = sc.nextInt();
				
				if (size == arr.length) {
					int tmp[] = new int[arr.length*2]; //�ӽù迭 ����, �迭ũ��2��Ȯ��
					for (int i=0; i<size; i++) {
						tmp[i] = arr[i]; //�����ͱ��̰� ������ 2���� �ӽù迭tmp�� ����arr���� �ӽ�����
					} //�� arr������ tmp������ �־ �迭���̰� 2��� ����@@
					arr = tmp;
					System.out.println("arr.length = "+arr.length);
					
					for (int i=size; i>=index; i--) {
						arr[i] = arr[i-1]; //�߰������� ���� ������ ��ġ �̵�
					}
					arr[index-1] = data;
				    size++;				
					System.out.println("�迭���� üũ arr_length: "+arr.length);
					System.out.println("���� ������ ����(size) = "+size+"��");
					System.out.print("���԰� ���� �迭���: ");
					for (int i=0; i<size; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println("\n");
					break;
				} else {
					for (int i=size; i>=index; i--) {
						arr[i] = arr[i-1];
					}
					arr[index-1] = data;
				    size++;				
					System.out.println("�迭���� üũ arr_length: "+arr.length);
					System.out.println("���� ������ ����(size) = "+size+"��");
					System.out.print("���԰� ���� �迭���: ");
					for (int i=0; i<size; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println("\n");
					break;
					
				}
				
			case 4:
				System.out.println("�� ������ �����Ϸ�");

				if(size<=arr.length/4) {
					int tmp3[] = new int[arr.length/2];
					for (int i=0; i<size; i++) {
						tmp3[i] = arr[i];
					}
					arr = tmp3;
					System.out.println("�迭���� üũ arr_length: "+arr.length);
					System.out.println("���� ������ ����(size) = "+size+"��");
				}
				else {
					for(int i=size-1; i<size-1; i++) {
						arr[i] = arr[i+1];
					}
					size--;
					for(int i=0; i<size; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();
					System.out.println("�迭���� üũ arr_length: "+arr.length);
					System.out.println("���� ������ ����(size) = "+size+"��");
					System.out.println("\n");
				}
				
				System.out.println("\n");
				break;

			
			case 5:
				System.out.println("���� (�߰� ������ ����)");
				System.out.print("������ ��ġ(���°) �Է�>> ");
				int rm_index = sc.nextInt();
				int count = 0;
				for(int i=rm_index-1; i<size-1; i++) {
					arr[i] = arr[i+1];
					count++;
				}
				size--;
				
				System.out.println("�迭���� üũ arr_length: "+arr.length);
				System.out.println("���� ������ ����(size) = "+size+"��");
				System.out.println("������ �̵�Ƚ�� = "+count+"ȸ");
				System.out.print("�������: ");
				for(int i=0; i<size; i++) {
					System.out.print(arr[i] + " ");
				}
				
				if(size<=arr.length/4) {
					int tmp3[] = new int[arr.length/2];
					for (int i=0; i<size; i++) {
						tmp3[i] = arr[i];
					}
					arr = tmp3;
					System.out.println("�迭���� üũ arr_length: "+arr.length);
					System.out.println("���� ������ ����(size) = "+size+"��");
				}
				System.out.println("\n");
				break;
				
			case 6:
				for (int i=0; i<size; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println("�迭���� üũ arr_length: "+arr.length);
				System.out.println("���� ������ ����(size) = "+size+"��");
				System.out.println("\n");
				
				break;
				
			case 7:
				menu();
				
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


