package Algorithm;
//2525
import java.util.Scanner;
public class Oven2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt(); //오븐 시작 시간
		int min = sc.nextInt();  //오븐 시작 분
		int need = sc.nextInt(); //필요한 시간
		
		if(min+need>=60) { //만약 분+필요시간이 60분 이상이라면,
			hour += (min+need)/60; //시간에 ~시간만큼 더해주고,
			min = (min+need)%60;   //분을 60이하로 짜르고,
			if(hour==24) {         //시간이 24시간이면,
				hour=0;            //hour=0
			}
			else if(hour<24) {     //만약 시간이 24시간미만이면,
				hour%=24;          //그대로 사용 예)23시 -> 23시
			}
			else if(hour>24) {     //만약 시간이 24시간을 초과하면,
				hour%=24;          //24시간 단위로 맞춰서 값설정
			}
			System.out.println(hour+" "+min);
		}
		else {                     
			min+=need;                        //min+need시간이 60분미만이라면
			System.out.println(hour+" "+min); //그대로 출력
		}
		sc.close();
	}
}
