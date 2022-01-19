import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		
		System.out.println(a*(b.charAt(2)-'0')); //char '0'의 아스키 코드 48을 빼줌으로서 우리가 원하는 정수값을 얻을 수 있다.
		System.out.println(b.charAt(2)); //숫자가 아닌 문자 char '5' -> 아스키 코드 53
		System.out.println((int)b.charAt(2)); //char '5' -> 아스키 코드 53
		System.out.println((int)'0'); //char '0' -> 아스키 코드 48
		System.out.println(((int)b.charAt(2))-(int)'0'); //53-48=5
		System.out.println(a*(b.charAt(2))); // int 5가 아닌 아스키 코드 '5'를 곱했기 때문에 틀린값!!

		
		sc.close();
	}
}


