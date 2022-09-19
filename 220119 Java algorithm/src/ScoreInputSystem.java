
import java.util.Scanner;

public class ScoreInputSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("성적처리 프로그램");
		
		String grade = "";
		int score = 0;
//		String scoreA[] = {"A+","A","B+","B","C+","C","D+","D","F"};
		
		for(int i=0; i<10; i++) {
			
			System.out.print("이름을 입력하시오>> ");
			String name = sc.next();
			
			System.out.print("점수를 입력하시오>> ");
			score = sc.nextInt();
			
			if(score>100 || score<0) {
				System.out.println("올바른 점수를 입력해주세요");
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
			
			System.out.println("이름: "+name+" 성적: "+grade);

		}
		sc.close();
		
		


	}
	

}

