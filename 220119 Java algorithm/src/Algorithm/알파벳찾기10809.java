package Algorithm;
import java.util.Scanner;

public class ���ĺ�ã��10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String ex = "abcdefghijklmnopqrstuvwxyz";
		
		String s1[] = input.split("");
		String s2[] = ex.split(""); //����26¥�� a b c.. �� �迭 ����
		
		int c[] = new int[s2.length]; //���ϱ����� -1�� compare[]����
		
		for(int i=0; i<c.length; i++) {
			c[i]=-1;
		}
		
		for(int i=0; i<s1.length; i++) {
			for(int j=0; j<s2.length; j++) {
				if(c[j]==-1) {
					if(s1[i].equals(s2[j])) {        //���ڿ� ������ �� .equals()����
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
