import java.util.Scanner;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr_length = 0; //배열의 길이(방 갯수) 0 초기화
		int size = 0; //배열 내 데이터의 갯수 0 초기화
		
		System.out.print("배열의 길이를 정수로 입력하시오>> ");
		arr_length = sc.nextInt();
		System.out.print("배열의 size(데이터 갯수)를 입력하시오>> ");
		size = sc.nextInt();
		
		int []arr = new int[arr_length];
		
		System.out.print("넣고자하는 정수 데이터값을 띄어쓰기로 입력하시오>> ");
		for (int i=0; i<size; i++) {
			arr[i] = sc.nextInt(); //반복문으로 arr[i]레퍼런스에 입력한 데이터를 넣어줌
			System.out.print(arr[i] + " ");
		}
		
		
		sc.close();

	}

}