//이래서 뭐가 잘못됐는지 모르겠을때, 남한테 보여주거나, 리프레쉬하고 다시 봐야하는 거구나.........
//30분동안 i를 n으로 잘못쓴 상태로 보고있었다...
//문제점: 12를 입력하면, 백의자리숫자가 없기때문에 얘도 cnt된다. 012이런식으로 하지않는이상 그건 힘드네
//와!!!! i의 범위를 조정하니 정답!! 처음으로 실버문제 정답검색안하고 성공!!!!
package Algorithm;

import java.util.Scanner;

public class 한수1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = {0,1,2,3,4,5,6,7,8,9};
		int cnt = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i<100) { //i가 100미만
					if(((i/10)%10)-arr[j]==i%10) { //십의 자리
//						System.out.println(i+" 십의자리");
//						System.out.println(arr[j]);
						cnt++;
					}
					else if(((i/10)%10)+arr[j]==i%10) { //십의 자리
//						System.out.println(i+" 십의자리");
//						System.out.println(arr[j]);
						cnt++;
					}
				}
				
				if(i>99) { //i가 100이상
					if((i/100)-arr[j]==(i/10)%10 && ((i/10)%10)-arr[j]==i%10) {
//						System.out.println(i+" 백의자리");
//						System.out.println(arr[j]);
//						System.out.println((i/100)-arr[j]+" "+(i/10)%10);
//						System.out.println((i/10)%10+" "+arr[j]+" "+i%10);
						cnt++;
					}
					else if((i/100)+arr[j]==(i/10)%10 && ((i/10)%10)+arr[j]==i%10) {
//						System.out.println(i+" 백의자리");
//						System.out.println(arr[j]);
						cnt++;
					}
				}
			}
		}
		System.out.println(+cnt);
	}
}
