package Algorithm;
import java.util.Scanner;
//1316
//포인트는 특정문자 앞뒤만 중복체크하는게 아니라 (초반삽질)
//boolean[] 배열을 만들어서, 해당 알파벳의 중복유무를 체크하는 것이 중요
//또 String s = "abc"에서, s.charAt(index = 0)으로 'a'리턴 응용도 중요
//(int) s.charAt(0) = 97

public class 그룹단어체커1316 {
	static Scanner sc = new Scanner(System.in);
	
	static int n = sc.nextInt();               //n개수 입력

	static boolean check(String s) {
		boolean b[] = new boolean[26];          //알파벳 중복체크용 알파벳수의 b[]생성
		int prev = 0;                           //now값과 비교하기 위한 prev값
	      
		for(int i=0; i<s.length(); i++) {
			int now = s.charAt(i);              //now = abba에서 'a'값의 아스키코드: 97
					
			if(prev != now) {                   //만약 prev 이전글자와 now 현재글자가 같지 않고,
				if(b[(int)now - 'a'] == false) {//s의 i번째 글자, 'a'가 처음 나왔다면,
					b[(int)now - 'a'] = true;   //'a'문자 확인처리
					prev = now;                 //다음 확인을 위해, prev에 now값 할당
				}
				else {                          //근데 만약에 다음에 나오는게 또 'a'라면, 즉 b[97 - 97]은 이미 true라면,
					return false;               //check()의 결과, s에 중복글자가 있어서 그룹단어가 '아니라는'거지
				}
			}
			else {                              //만약 prev 이전글자와 now 현재글자가 같다면,
				continue;                       //지금i번째 작업을 무시하고, 다음 i+1작업으로 계속해라.
			}      
		}
		return true;                            //이상이 없다면 true: 그룹단어입니다
	}

	public static void main(String[] args) {
		
		int cnt = 0; //그룹단어 개수 체크용
		for(int i=0; i<n; i++) {
			String s = sc.next();               //String 입력
			if(check(s) == true) { //중복이 없다면
				cnt++;            //그룹단어 개수+1
			}
		}
		System.out.println(cnt);  //그룹단어 개수 출력
	}
}
