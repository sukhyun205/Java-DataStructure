


import java.util.Scanner;

class QS {
	
	Scanner sc = new Scanner(System.in);
	
	int []arr = new int[8];
	
	public void input() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	
	public int partition(int[] arr, int L, int R) {
		int pivot = (L + R)/2; //�迭 �߰����� pivot���� ����
		
		while(L < R) { //pivot���� ���� ���� L, ū ���� R
			while(L<=R && arr[L]<=arr[pivot]) { 
				++L;
			}
			while(L<=R && arr[R]>arr[pivot]) {
				--R;
			}
			
			if(L<=R) { //L�� R�� �ٸ����� ����Ű�ų�, Ȥ�� ������ swap
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp; //arr[L]�� arr[R] swap
				
				if(R==pivot) { //���� L�� pivot�� swap�� ��쿡��, �������� L�� �ٲٱ����� return L
					print();
					System.out.println();
					return L;
				}
			}
			
		}
		
		if(R != pivot) { //���� L�� �˻�� �������� R�� �˻簡 ������ ���� ���
			int temp = arr[R];
			arr[R] = arr[pivot];
			arr[pivot] = temp; //arr[pivot]�� arr[R] swap
		}
		print();
		System.out.println();
		return R; //�������� R�� �ٲٱ� ���� return R
	}
	
	public void quicksort(int[] arr, int L, int R) {
		
		if(L<R) {
			int newPivot = partition(arr, L, R); //partition(arr, L, R)�� return�� L �Ǵ� R�� ���ο� ������(newPivot) ����
			quicksort(arr, L, newPivot-1); //newPivot���� ���� �κ����� ������
			quicksort(arr, newPivot+1, R); //newPivot���� ������ �κ����� ������
		}
	}
	
	public void print() {
		System.out.print("[ ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}
}




public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���� 69 10 30 2 16 8 31 22");
		System.out.print("10���� ���� �ٸ� ���ڸ� �����̽��� �����Ͽ� �Է��Ͻÿ�>> ");
		
		QS qs = new QS();
		
		qs.input();

		qs.quicksort(qs.arr, 0, qs.arr.length-1);
		
		System.out.print("����>> ");
		qs.print();
	}
}
