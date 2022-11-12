package Algorithm;
import java.util.Scanner;

public class 단어공부1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a_input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";   //알파벳 배열크기를 위한 String abc
		int f[] = new int[a_input.length()];             //빈도 frequency[] 배열     //알파벳 빈도수를 기록하기 위한 int타입 alpha[]배열생성
		String s_input = sc.next();
		String s[] = s_input.toUpperCase().split("");    //입력값 배열생성
		String a[] = a_input.split("");
		
		for(int i=0; i<s.length; i++) {                  //이중for문으로 s[], a[]배열 비교해서 f[]빈도배열 카운트에 +1
			for(int j=0; j<a.length; j++) {
				if(s[i].equals(a[j])) {                  //'M'='M'이면 +1
					f[j]++;
				}
			}
		}
		
		//빈도수 중복값 확인를 위한, max빈도수 계산
		int max = f[0];
		for(int i=0; i<f.length; i++) {
//			System.out.print(((char)('A'+i))+":"+f[i]+" ");
			if(max<f[i]) {
				max = f[i];
			}
		}
		
		//자 이제 중복값있으면 ?출력 아니면 문자출력
		int cnt=0; //중복값이 있는지 여부를 판단하기 위한 cnt값생성
		char result = ' ';
		for(int i=0; i<f.length; i++) {
			if(f[i]==max) {
				cnt++;
			}
		}
//		System.out.println("\n"+max+" "+cnt);
		
		for(int i=0; i<f.length; i++) {
			if(f[i]==max) {
				result = (char)('A'+i); //result=빈도수 max값에 해당하는 알파벳
				if(cnt>1) {
					result = '?';
				}
			}
		}
	
		System.out.println(result); //결과출력
	}
}
