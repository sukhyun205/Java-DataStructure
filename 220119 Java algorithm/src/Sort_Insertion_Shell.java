

import java.lang.Comparable;
import java.util.Scanner;

class Sort{	
	public void Insertion(Comparable[] arr) {	
		for(int i=1; i<arr.length; i++) {
			for(int j=i; j>0; j--) {
				if(isless(arr[j], arr[j-1])) {
					swap(arr, j, j-1);
				}else {
					break;
				}
			}
		}
	}
	
	public void Shell(Comparable[] arr) {
		int h=4; //간격=4
		
		while(h>=1) {
			for(int i=h; i<arr.length; i++) {
				for(int j=i; j>=h && isless(arr[j], arr[j-h]); j-=h) {
					swap(arr, j, j-h);
				}
			}h/=3;
		}

	}
	
	public boolean isless(Comparable u, Comparable v) {
		return(u.compareTo(v) < 0);
	}
	
	public void swap(Comparable[] arr, int i, int j) {
		Comparable temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	
}


public class Sort_Insertion_Shell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("예시: 69 10 30 2 16 8 31 22");
		Comparable[] arr1 = new Comparable[8];
		System.out.print("삽입정렬 입력>> ");
		for(int i=0; i<8; i++) {
			arr1[i] = sc.nextInt();
		}
		
		Comparable[] arr2 = new Comparable[8];
		System.out.print("쉘정렬 입력>> ");
		for(int i=0; i<8; i++) {
			arr2[i] = sc.nextInt();
		}
		
		Sort sort = new Sort();
		
		long start = System.nanoTime();
		sort.Insertion(arr1);
		long end = System.nanoTime();
		double result = ((double) (end - start)) / 1000000000;
		System.out.println("삽입정렬 수행시간: " + (result) + " ns");
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		
		long start2 = System.nanoTime();
		sort.Shell(arr2);
		long end2 = System.nanoTime();
		double result2 = ((double) (end2 - start2)) / 1000000000;
		System.out.println();
		System.out.println("쉘정렬 수행시간: " + (result2) + " ns");
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println();
		System.out.print("결과: 쉘정렬의 수행시간이 삽입정렬보다 "+(((result)-(result2))/(result2))*100+"% 빨랐다.");
		
	}

}
