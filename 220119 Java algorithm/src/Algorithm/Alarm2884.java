package Algorithm;
//����2884
import java.util.Scanner;
public class Alarm2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();

		if(min<45) {
			min=60-(45-min);
			hour--;
			if(hour<0) { //hour�� 0������ �ǹ�����, hour�� 1�϶�, hour�� 0�� �ƴ� 23�� �Ǿ����!
				hour=23;
			}
			System.out.println(hour+" "+min);
			return;
		}
			min-=45;
			System.out.println(hour+" "+min);			
	}
}
