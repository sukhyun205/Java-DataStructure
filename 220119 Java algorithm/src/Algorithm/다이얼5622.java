package Algorithm;
import java.util.Scanner;
//포인트는 j로 노가다보다 더 좋은 방법이 있을거라는거 -> 규칙을 더 찾아보자

public class 다이얼5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input_s = sc.next();
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//"ABC DEF GHI JKL MNO PQRS TUV WXYZ"

		String[] s = input_s.split("");  //s[] = {"U","N"...}
		int dial[] = new int[s.length];   //UNUCIC -> 868242를 넣을 배열arr[]생성
		String[] alpha = abc.split(""); //alpha[] {"A","B"...}
		
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<alpha.length; j++) {
//				System.out.println(s[i]+" "+alpha[j]);
				if(s[i].equals(alpha[j])) {
					if(j==0 || j==1 || j==2) {
						dial[i] = 2;
					}
					else if(j==3 || j==4 || j==5) {
						dial[i] = 3;
					}
					else if(j==6 || j==7 || j==8) {
						dial[i] = 4;
					}
					else if(j==9 || j==10 || j==11) {
						dial[i] = 5;
					}
					else if(j==12 || j==13 || j==14) {
						dial[i] = 6;
					}
					else if(j==15 || j==16 || j==17 || j==18) {
						dial[i] = 7;
					}
					else if(j==19 || j==20 || j==21) {
						dial[i] = 8;
					}
					else if(j==22 || j==23 || j==24 || j==25) {
						dial[i] = 9;
					}
				}
			}
		}
		
		int sum=0;
		for(int i=0; i<dial.length; i++) {
			sum+=dial[i];
			sum++;
		}
		System.out.println(sum);
	}
}
