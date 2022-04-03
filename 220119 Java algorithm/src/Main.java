import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		

		int mode=4;
		int arr_length=0; //배열의 길이(방 갯수) 0 초기화
		int size=0; //배열 내 데이터의 갯수 0 초기화
		
		System.out.print("배열의 길이를 정수로 입력하시오>> ");
		arr_length = sc.nextInt();
		System.out.print("배열의 size(데이터 갯수)를 입력하시오>> ");
		size = sc.nextInt();
		
		
		int []arr = new int[arr_length];
		
		System.out.print("넣고자하는 정수 데이터값을 띄어쓰기로 입력하시오>> ");
		for (int i=0; i<size; i++) { 
			arr[i] = sc.nextInt(); 
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("배열길이 체크 arr_length: "+arr.length);
		System.out.println("현재 데이터 갯수(size) = "+size+"개");
		System.out.println();
		
		
		System.out.println(" [menu] ");
		System.out.println(" 0: 현재 배열 출력");
		System.out.println(" 1: 값 가져오기");
		System.out.println(" 2: 삽입 (끝에 삽입)");
		System.out.println(" 3: 삽입 (중간에 삽입)");
		System.out.println(" 4: 삭제 (끝 데이터 삭제)");
		System.out.println(" 5: 삭제 (중간 데이터 삭제)");
		System.out.println(" 6: 현재 배열 출력");
		System.out.println();
		
		while(mode!=0) {
			System.out.print("명령어를 0~6에서 입력하시오(menu 7번)>> ");
			mode = sc.nextInt();
			
			switch(mode) {
			
			case 0:
				System.exit(0);
				break;
				
			case 1:
				System.out.print("몇번째 값을 가져오시겠습니까? ");
				int k = sc.nextInt();
				System.out.println(k +"번째값 출력결과: "+ arr[k-1]);
				System.out.println();
				System.out.println("배열길이 체크 arr_length: "+arr.length);
				System.out.println("현재 데이터 갯수(size) = " +size+"개");
				System.out.println("\n");
				break;
			case 2:
				System.out.print("삽입 (끝에 삽입)");
				System.out.print("삽입할 값 입력>> ");
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
					System.out.print("삽입값 포함 배열출력: ");
					
					for (int i=0; i<size; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();
					System.out.println("배열길이 체크 arr_length: "+arr.length);
					System.out.println("현재 데이터 갯수(size) = "+size+"개");
					System.out.println("\n");
					break;
				} 
				else {
					arr[size] = end_data;
					size++;
					System.out.println("배열길이 체크 arr_length: "+arr.length);
					System.out.println("현재 데이터 갯수(size) = "+size+"개");
					System.out.println();
					System.out.print("삽입값 포함 배열출력: ");
					
					for (int i=0; i<size; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println("\n");
					break;
					
				}
				

				
				
				
			case 3: //중간 삽입
				System.out.print("삽입 (중간에 삽입)");
				System.out.print("삽입할 위치(몇번째) 입력>> ");
				int index = sc.nextInt();
				System.out.print("삽입할 값 입력>> ");
				int data = sc.nextInt();
				
				if (size == arr.length) {
					int tmp[] = new int[arr.length*2]; //임시배열 생성, 배열크기2배확장
					for (int i=0; i<size; i++) {
						tmp[i] = arr[i]; //데이터길이가 기존의 2배인 임시배열tmp에 기존arr값을 임시저장
					} //와 arr변수에 tmp변수를 넣어서 배열길이가 2배로 만듦@@
					arr = tmp;
					System.out.println("arr.length = "+arr.length);
					
					for (int i=size; i>=index; i--) {
						arr[i] = arr[i-1]; //중간삽입을 위해 데이터 위치 이동
					}
					arr[index-1] = data;
				    size++;				
					System.out.println("배열길이 체크 arr_length: "+arr.length);
					System.out.println("현재 데이터 갯수(size) = "+size+"개");
					System.out.print("삽입값 포함 배열출력: ");
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
					System.out.println("배열길이 체크 arr_length: "+arr.length);
					System.out.println("현재 데이터 갯수(size) = "+size+"개");
					System.out.print("삽입값 포함 배열출력: ");
					for (int i=0; i<size; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println("\n");
					break;
					
				}
				
			case 4:
				System.out.println("끝 데이터 삭제완료");

				if(size<=arr.length/4) {
					int tmp3[] = new int[arr.length/2];
					for (int i=0; i<size; i++) {
						tmp3[i] = arr[i];
					}
					arr = tmp3;
					System.out.println("배열길이 체크 arr_length: "+arr.length);
					System.out.println("현재 데이터 갯수(size) = "+size+"개");
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
					System.out.println("배열길이 체크 arr_length: "+arr.length);
					System.out.println("현재 데이터 갯수(size) = "+size+"개");
					System.out.println("\n");
				}
				
				System.out.println("\n");
				break;

			
			case 5:
				System.out.println("삭제 (중간 데이터 삭제)");
				System.out.print("삭제할 위치(몇번째) 입력>> ");
				int rm_index = sc.nextInt();
				int count = 0;
				for(int i=rm_index-1; i<size-1; i++) {
					arr[i] = arr[i+1];
					count++;
				}
				size--;
				
				System.out.println("배열길이 체크 arr_length: "+arr.length);
				System.out.println("현재 데이터 갯수(size) = "+size+"개");
				System.out.println("데이터 이동횟수 = "+count+"회");
				System.out.print("삭제결과: ");
				for(int i=0; i<size; i++) {
					System.out.print(arr[i] + " ");
				}
				
				if(size<=arr.length/4) {
					int tmp3[] = new int[arr.length/2];
					for (int i=0; i<size; i++) {
						tmp3[i] = arr[i];
					}
					arr = tmp3;
					System.out.println("배열길이 체크 arr_length: "+arr.length);
					System.out.println("현재 데이터 갯수(size) = "+size+"개");
				}
				System.out.println("\n");
				break;
				
			case 6:
				for (int i=0; i<size; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println("배열길이 체크 arr_length: "+arr.length);
				System.out.println("현재 데이터 갯수(size) = "+size+"개");
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


