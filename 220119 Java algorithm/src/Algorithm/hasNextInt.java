package Algorithm;
//10951
import java.util.Scanner;
public class hasNextInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) { //hasNextInt()=true일때, 즉 sc입력값이 정수값일때만 출력
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		
		while(sc.hasNextLine()) { //hasNextLine(), 문장으로 입력받아 출력
			String a = sc.nextLine();
			System.out.println(a);
		}
	}
}



