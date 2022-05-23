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
				return middle; //탐색 성공 index middle값 return
			}
			else if(arr[middle] < key) {
				low = middle+1;
			}
			else if(arr[middle] > key) {
				high = middle-1;
			}
		}
		return -1; //탐색 실패
	}
	
	
	
	public void quicksort(int[] arr, int L, int R) {
		if(L<R) {
			int newPivot = partition(arr, L, R); //partition(arr, L, R)의 return값 L 또는 R로 새로운 기준점(newPivot) 결정
			quicksort(arr, L, newPivot-1); //newPivot기준 왼쪽 부분집합 퀵정렬
			quicksort(arr, newPivot+1, R); //newPivot기준 오른쪽 부분집합 퀵정렬
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
					return L;
				}
			}
		}
		
		if(R != pivot) { //위의 L의 검사는 끝났지만 R의 검사가 끝나지 않은 경우
			int temp = arr[R];
			arr[R] = arr[pivot];
			arr[pivot] = temp; //arr[pivot]과 arr[R] swap
		}
		return R; //기준점을 R로 바꾸기 위해 return R
	}
	

	
	
	
	
	public void result() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n"+"1~100 사이의 key를 입력하시오>> ");
		int key = sc.nextInt();
		if(binary_search(key, 0, 20-2)==-1) {
			System.out.print("탐색결과>> 탐색실패");
		}else {
			System.out.print("탐색결과>> 탐색성공 index = "+binary_search(key, 0, 20-2));
		}
		sc.close();
	}
	
}


public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sequential2 arr = new Sequential2();
		
		arr.input();
		
		System.out.print("size 20 배열 생성>> ");
		for(int i=0; i<20; i++) {
			System.out.print(arr.arr[i]+" ");
		}
		System.out.println();
		
		System.out.print("퀵정렬>> ");
		
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