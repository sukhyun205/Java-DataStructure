import java.util.InputMismatchException;
import java.util.Scanner;

//확대 축소기능을 메소드 없이 구현을 했는데, 메소드로 구현해야됨
//메소드로 구현하기 위해서, 꼭 위에 class선언을 따로 해야하는지?
//main메소드 안에 확대축소기능 메소드를 구현할 수는 없는지?


class Function {
	
	public void resize(int newSize, int size, int arr[]) { //resize1: 배열크기2배확장
		int tmp[] = new int[newSize]; //임시배열 생성, 배열크기2배확장
		for (int i=0; i<size; i++) {
			tmp[i] = arr[i]; //데이터길이가 기존의 2배인 임시배열tmp에 기존arr값을 임시저장
		} //와 arr변수에 tmp변수를 넣어서 배열길이가 2배로 만듦@@
		arr = tmp;
		System.out.println(">> "+arr.length);
		
	}
}


public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		

		int mode=4;
		int arr_length = 0; //배열의 길이(방 갯수) 0 초기화
		int size=0; //배열 내 데이터의 갯수 0 초기화
		
		System.out.print("배열의 길이를 정수로 입력하시오>> ");
		arr_length = sc.nextInt();
		System.out.print("배열의 size(데이터 갯수)를 입력하시오>> ");
		size = sc.nextInt();
		
		Function fun = new Function();
		
		int []arr = new int[arr_length];
		

		
		System.out.print("넣고자하는 정수 데이터값을 띄어쓰기로 입력하시오>> ");
		while (true) {
			try {
				for (int i=0; i<size; i++) { 
					arr[i] = sc.nextInt(); 
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				System.out.println("현재 데이터 갯수(size) = "+size+"개");
				System.out.println();
				break;
			} 
			catch(InputMismatchException ime) {
				sc = new Scanner(System.in);  
				System.out.print("error! 문자가 아닌 숫자를 입력해주세요>> ");
			}
		}
		
		System.out.println(" [menu] ");
		System.out.println(" 0: exit");
		System.out.println(" 1: 값 가져오기");
		System.out.println(" 2: 삽입 (끝에 삽입)");
		System.out.println(" 3: 삽입 (중간에 삽입)");
		
		while(mode!=0) {
			System.out.print("명령어를 0~3에서 입력하시오>> ");
			mode = sc.nextInt();
			switch(mode) {
			
			case 0:
				System.exit(0);
				break;
				
			case 1:
				System.out.print("몇번째 값을 가져오시겠습니까? ");
				int k = sc.nextInt();
				System.out.println(k +"번째값 출력결과: "+ arr[k-1]);
				System.out.println("반드시 배열 사이즈 체크 arr_length: "+arr_length);
				System.out.println("반드시 배열의 데이터 개수 체크 size: "+size);
				System.out.println();
				break;
			case 2:
				System.out.print("삽입 (끝에 삽입)");

				break;
				
				
				
			case 3:
				System.out.print("삽입할 위치(몇번째) 입력>> ");
				int index = sc.nextInt();
				System.out.print("삽입할 값 입력>> ");
				int data = sc.nextInt();
				
				if (size == arr.length) {
					fun.resize(2*arr.length,size,arr);
					for (int i=size; i>=index; i--) {
						arr[i] = arr[i-1];
					}
					arr[index-1] = data;
				    size++;				
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
					System.out.println("현재 데이터 갯수(size) = "+size+"개");
					System.out.print("삽입값 포함 배열출력: ");
					for (int i=0; i<size; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println("\n");
					break;
					
				}
				
				
				
				
				
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
