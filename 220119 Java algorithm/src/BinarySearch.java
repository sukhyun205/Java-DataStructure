import java.util.Scanner;

class Sequential2{
	
	int arr[] = new int[20];
	
	public int[] input() {
		for(int i=0; i<20; i++) {
			arr[i]=(int)(Math.random()*100)+1;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
			}return arr;
	}
	

	public int binary_search(int key, int low, int high){
		int middle;
		
		while(low <= high) {
			middle = (low + high)/2;
			
			if(arr[middle] == key) {
				return middle; //Ž�� ���� index middle�� return
			}
			else if(arr[middle] < key) {
				low = middle+1;
			}
			else if(arr[middle] > key) {
				high = middle-1;
			}
		}
		return -1; //Ž�� ����
	}
	
	
	
	public void quicksort(int[] arr, int L, int R) {
		if(L<R) {
			int newPivot = partition(arr, L, R); //partition(arr, L, R)�� return�� L �Ǵ� R�� ���ο� ������(newPivot) ����
			quicksort(arr, L, newPivot-1); //newPivot���� ���� �κ����� ������
			quicksort(arr, newPivot+1, R); //newPivot���� ������ �κ����� ������
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
					return L;
				}
			}
		}
		
		if(R != pivot) { //���� L�� �˻�� �������� R�� �˻簡 ������ ���� ���
			int temp = arr[R];
			arr[R] = arr[pivot];
			arr[pivot] = temp; //arr[pivot]�� arr[R] swap
		}
		return R; //�������� R�� �ٲٱ� ���� return R
	}
	

	
	
	
	
	public void result() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n"+"1~100 ������ key�� �Է��Ͻÿ�>> ");
		int key = sc.nextInt();
		if(binary_search(key, 0, 20-2)==-1) {
			System.out.print("Ž�����>> Ž������");
		}else {
			System.out.print("Ž�����>> Ž������ index = "+binary_search(key, 0, 20-2));
		}
		sc.close();
	}
	
}


public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sequential2 arr = new Sequential2();
		
		arr.input();
		
		System.out.print("size 20 �迭 ����>> ");
		for(int i=0; i<20; i++) {
			System.out.print(arr.arr[i]+" ");
		}
		System.out.println();
		
		System.out.print("������>> ");
		
//		int [] arr2 = {23,2,3,34,43,54,65,76,87,97};
		arr.quicksort(arr.arr, 0, arr.arr.length-1);
//		arr.quicksort(arr2, 0, arr2.length-1);
		
		System.out.print("[ ");
		for(int i=0; i<20; i++) {
			System.out.print(arr.arr[i]+" ");
		}
		System.out.print("]");
		
		arr.result();



		

	}

}