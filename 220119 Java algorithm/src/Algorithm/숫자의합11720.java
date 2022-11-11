package Algorithm;

import java.util.Scanner;

public class 숫자의합11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String n = sc.next();                //1. 입력은 String으로 받고 //아항 nextLine()이랑 차이가 있네 
		int sum = 0;
		
		String s[] = n.split("");            //아하 split으로 쪼갠걸 걍 arr[]에 넣을수있네
		int arr[] = new int[num];
		
		for(int i=0; i<s.length; i++) {
			arr[i] = Integer.parseInt(s[i]); //2. Integer.parseInt(문자열)을 통해 정수로 변경
			sum+=arr[i];                     //3. 변경한 int타입 값들을 sum에 합
		}
		System.out.print(sum);
	}
}
