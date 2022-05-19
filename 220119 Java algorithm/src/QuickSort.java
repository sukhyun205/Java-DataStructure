


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
		int pivot = (L + R)/2; //배열 중간값을 pivot으로 지정
		
		while(L < R) { //pivot보다 작은 값은 L, 큰 값은 R
			while(L<=R && arr[L]<=arr[pivot]) { 
				++L;
			}
			while(L<=R && arr[R]>arr[pivot]) {
				--R;
			}
			
			if(L<=R) { //L과 R이 다른값을 가르키거나, 혹은 같을때 swap
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp; //arr[L]과 arr[R] swap
				
				if(R==pivot) { //만약 L과 pivot을 swap한 경우에는, 기준점을 L로 바꾸기위해 return L
					print();
					System.out.println();
					return L;
				}
			}
			
		}
		
		if(R != pivot) { //위의 L의 검사는 끝났지만 R의 검사가 끝나지 않은 경우
			int temp = arr[R];
			arr[R] = arr[pivot];
			arr[pivot] = temp; //arr[pivot]과 arr[R] swap
		}
		print();
		System.out.println();
		return R; //기준점을 R로 바꾸기 위해 return R
	}
	
	public void quicksort(int[] arr, int L, int R) {
		
		if(L<R) {
			int newPivot = partition(arr, L, R); //partition(arr, L, R)의 return값 L 또는 R로 새로운 기준점(newPivot) 결정
			quicksort(arr, L, newPivot-1); //newPivot기준 왼쪽 부분집합 퀵정렬
			quicksort(arr, newPivot+1, R); //newPivot기준 오른쪽 부분집합 퀵정렬
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
		
		System.out.println("예시 69 10 30 2 16 8 31 22");
		System.out.print("10개의 서로 다른 숫자를 스페이스로 구분하여 입력하시오>> ");
		
		QS qs = new QS();
		
		qs.input();

		qs.quicksort(qs.arr, 0, qs.arr.length-1);
		
		System.out.print("최종>> ");
		qs.print();
	}
}
