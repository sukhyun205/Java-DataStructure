import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		
		System.out.println(a*(b.charAt(2)-'0')); //char '0'�� �ƽ�Ű �ڵ� 48�� �������μ� �츮�� ���ϴ� �������� ���� �� �ִ�.
		System.out.println(b.charAt(2)); //���ڰ� �ƴ� ���� char '5' -> �ƽ�Ű �ڵ� 53
		System.out.println((int)b.charAt(2)); //char '5' -> �ƽ�Ű �ڵ� 53
		System.out.println((int)'0'); //char '0' -> �ƽ�Ű �ڵ� 48
		System.out.println(((int)b.charAt(2))-(int)'0'); //53-48=5
		System.out.println(a*(b.charAt(2))); // int 5�� �ƴ� �ƽ�Ű �ڵ� '5'�� ���߱� ������ Ʋ����!!

		
		sc.close();
	}
}


