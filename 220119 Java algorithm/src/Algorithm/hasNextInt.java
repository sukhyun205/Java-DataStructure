package Algorithm;
//10951
import java.util.Scanner;
public class hasNextInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) { //hasNextInt()=true�϶�, �� sc�Է°��� �������϶��� ���
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		
		while(sc.hasNextLine()) { //hasNextLine(), �������� �Է¹޾� ���
			String a = sc.nextLine();
			System.out.println(a);
		}
	}
}



