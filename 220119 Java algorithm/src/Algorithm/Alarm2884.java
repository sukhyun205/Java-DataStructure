package Algorithm;
//백준2884
import java.util.Scanner;
public class Alarm2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();

		if(min<45) {
			min=60-(45-min);
			hour--;
			if(hour<0) { //hour가 0포함이 되버리면, hour가 1일때, hour가 0이 아닌 23이 되어버림!
				hour=23;
			}
			System.out.println(hour+" "+min);
			return;
		}
			min-=45;
			System.out.println(hour+" "+min);			
	}
}
