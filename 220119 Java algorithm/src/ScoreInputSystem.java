
import java.util.Scanner;

public class ScoreInputSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("����ó�� ���α׷�");
		
		String grade = "";
		int score = 0;
//		String scoreA[] = {"A+","A","B+","B","C+","C","D+","D","F"};
		
		for(int i=0; i<10; i++) {
			
			System.out.print("�̸��� �Է��Ͻÿ�>> ");
			String name = sc.next();
			
			System.out.print("������ �Է��Ͻÿ�>> ");
			score = sc.nextInt();
			
			if(score>100 || score<0) {
				System.out.println("�ùٸ� ������ �Է����ּ���");
				return;
			}
			
			if(score>=95 && score<=100) {
				grade = "A+";
			} else if(score>=90) {
				grade = "A";
			} else if(score>=85) {
				grade = "B+";
			} else if(score>=80) {
				grade = "B";
			} else if(score>=75) {
				grade = "C+";
			} else if(score>=70) {
				grade = "C";
			} else if(score>=65) {
				grade = "D+";
			} else if(score>=60) {
				grade = "D";
			} else if(score<60 && score>=0) {
				grade = "F";
			}
			
			System.out.println("�̸�: "+name+" ����: "+grade);

		}
		sc.close();
		
		


	}
	

}

