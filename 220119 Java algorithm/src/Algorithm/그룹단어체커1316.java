package Algorithm;
import java.util.Scanner;
//1316
//����Ʈ�� Ư������ �յڸ� �ߺ�üũ�ϴ°� �ƴ϶� (�ʹݻ���)
//boolean[] �迭�� ����, �ش� ���ĺ��� �ߺ������� üũ�ϴ� ���� �߿�
//�� String s = "abc"����, s.charAt(index = 0)���� 'a'���� ���뵵 �߿�
//(int) s.charAt(0) = 97

public class �׷�ܾ�üĿ1316 {
	static Scanner sc = new Scanner(System.in);
	
	static int n = sc.nextInt();               //n���� �Է�

	static boolean check(String s) {
		boolean b[] = new boolean[26];          //���ĺ� �ߺ�üũ�� ���ĺ����� b[]����
		int prev = 0;                           //now���� ���ϱ� ���� prev��
	      
		for(int i=0; i<s.length(); i++) {
			int now = s.charAt(i);              //now = abba���� 'a'���� �ƽ�Ű�ڵ�: 97
					
			if(prev != now) {                   //���� prev �������ڿ� now ������ڰ� ���� �ʰ�,
				if(b[(int)now - 'a'] == false) {//s�� i��° ����, 'a'�� ó�� ���Դٸ�,
					b[(int)now - 'a'] = true;   //'a'���� Ȯ��ó��
					prev = now;                 //���� Ȯ���� ����, prev�� now�� �Ҵ�
				}
				else {                          //�ٵ� ���࿡ ������ �����°� �� 'a'���, �� b[97 - 97]�� �̹� true���,
					return false;               //check()�� ���, s�� �ߺ����ڰ� �־ �׷�ܾ '�ƴ϶��'����
				}
			}
			else {                              //���� prev �������ڿ� now ������ڰ� ���ٸ�,
				continue;                       //����i��° �۾��� �����ϰ�, ���� i+1�۾����� ����ض�.
			}      
		}
		return true;                            //�̻��� ���ٸ� true: �׷�ܾ��Դϴ�
	}

	public static void main(String[] args) {
		
		int cnt = 0; //�׷�ܾ� ���� üũ��
		for(int i=0; i<n; i++) {
			String s = sc.next();               //String �Է�
			if(check(s) == true) { //�ߺ��� ���ٸ�
				cnt++;            //�׷�ܾ� ����+1
			}
		}
		System.out.println(cnt);  //�׷�ܾ� ���� ���
	}
}
