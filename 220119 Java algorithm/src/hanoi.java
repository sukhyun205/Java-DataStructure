
//2019113394 �Ǽ���
//[�Ϲ� ����] 07 ��� �� ���� 1 �й� ����
//�ϳ���ž ����

import java.util.Scanner;

class HanoiTower{
	
	
	public void move(int from, int middle, int to, int n) {
		
		if(n==0) {
			return;
		}
		else {
			move(from, to, middle, n-1); //n-1������ from���� ��� middle�� �̵�
			System.out.printf(n+"������"+ " = " + "("+from+")���� ->"+ "(" + to+")�� �̵�"); //n������ from���� to�� �̵�
			System.out.println();
			move(middle, from, to, n-1); //n-1������ middle���� ���������� to�� �̵�
		}
		
	}
}



public class hanoi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����: from=1, middle=2, to=3");
		System.out.print("���ǰ����Է�>> ");
		int n = sc.nextInt(); //������ ���� n�Է�
		
		HanoiTower HT = new HanoiTower();
		
		HT.move(1,2,3,n); //������ �ű�� move�޼ҵ� ���� �� ������
		
		sc.close();
		
		
		


	}

}
