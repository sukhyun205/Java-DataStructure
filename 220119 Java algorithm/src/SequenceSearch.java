import java.util.Scanner;

class Sequential{
	
	int num = (int)(Math.random()*100);
	int arr[] = new int[num];
	
	public int sequence_search(int key, int low, int high) {
		
		int i;
		arr[high+1] = key;
		

		
		for(i=low; arr[i]!=key; i++) {};
		
		if(i==(high+1)) {
			return -1; //탐색실패
		}
		else {
			return i; //탐색성공
		}
		
	}
	
	public void print() {
		for(int i=0; i<num; i++) {
			arr[i]=(int)((Math.random()*100)+1);
			System.out.print(arr[i]+" ");
		}
	}
	
	public void result() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100 사이의 key를 입력하시오>> ");
		int key = sc.nextInt();
		if(sequence_search(key, 0, num-2)==-1) {
			System.out.print("탐색결과>> 탐색실패");
		}else {
			System.out.println("탐색결과>> 탐색성공 index = "+sequence_search(key, 0, num-2));
		}
		
	}
	
}


public class SequenceSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sequential arr = new Sequential();
		
		System.out.print("랜덤크기 배열 생성>> ");
		arr.print();
		System.out.println();
		
		arr.result();



		

	}

}
