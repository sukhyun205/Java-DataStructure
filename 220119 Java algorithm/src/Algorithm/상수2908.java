//����Ʈ�� ���ڿ��� ��¤��, �״�� Integer.parseInt(String)�� ���ؼ� ������ �����־��ٴ� ��
package Algorithm;
import java.util.Scanner;

public class ���2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input_s1 = sc.next();
		String input_s2 = sc.next();
		sc.close();
		
		String s1[] = input_s1.split(""); //734
		String s2[] = input_s2.split("");
		
		int n1 = Integer.parseInt(s1[2]+s1[1]+s1[0]);
		int n2 = Integer.parseInt(s2[2]+s2[1]+s2[0]);
		
//		System.out.println(n1+" "+n2);
		
		if(n1>n2) {
			System.out.println(n1);
		}
		else {
			System.out.println(n2);
		}
	}
}