package Algorithm;
import java.util.Scanner;

public class 알파벳찾기10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String ex = "abcdefghijklmnopqrstuvwxyz";
		
		String s1[] = input.split("");
		String s2[] = ex.split(""); //길이26짜리 a b c.. 들어간 배열 생성
		
		int c[] = new int[s2.length]; //비교하기위한 -1들어간 compare[]생성
		
		for(int i=0; i<c.length; i++) {
			c[i]=-1;
		}
		
		for(int i=0; i<s1.length; i++) {
			for(int j=0; j<s2.length; j++) {
				if(c[j]==-1) {
					if(s1[i].equals(s2[j])) {        //문자열 끼리는 꼭 .equals()쓰기
						c[j] = i;
					}
				}

			}
		}
		
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}
}
