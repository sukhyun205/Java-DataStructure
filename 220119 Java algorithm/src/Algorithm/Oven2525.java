package Algorithm;
//2525
import java.util.Scanner;
public class Oven2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt(); //���� ���� �ð�
		int min = sc.nextInt();  //���� ���� ��
		int need = sc.nextInt(); //�ʿ��� �ð�
		
		if(min+need>=60) { //���� ��+�ʿ�ð��� 60�� �̻��̶��,
			hour += (min+need)/60; //�ð��� ~�ð���ŭ �����ְ�,
			min = (min+need)%60;   //���� 60���Ϸ� ¥����,
			if(hour==24) {         //�ð��� 24�ð��̸�,
				hour=0;            //hour=0
			}
			else if(hour<24) {     //���� �ð��� 24�ð��̸��̸�,
				hour%=24;          //�״�� ��� ��)23�� -> 23��
			}
			else if(hour>24) {     //���� �ð��� 24�ð��� �ʰ��ϸ�,
				hour%=24;          //24�ð� ������ ���缭 ������
			}
			System.out.println(hour+" "+min);
		}
		else {                     
			min+=need;                        //min+need�ð��� 60�й̸��̶��
			System.out.println(hour+" "+min); //�״�� ���
		}
		sc.close();
	}
}
