package Algorithm;

public class SelfNumber4673 {
	static int d(int n) {
		int sum = n; //sum = 1234
		while(n!=0) {
			sum += n%10; //sum = 1234+4+3+2+1 = 1244
			n = n/10; //n = 123,12,1,0 -> n�� 0�̵Ǹ� while�� ����
		}
		return sum; //���������� n(=1234)�� �̿��� �����ѹ� 1244 ����
	}
	
	public static void main(String[] args) {
		boolean arr[] = new boolean[10000];
		
		for(int i=1; i<=10000; i++) {
			if(d(i)<10000) { //10000�̻��� �����ѹ��� �ʿ����
				arr[d(i)] = true; //�����ѹ��� �ش��ϴ� ���� arr���� ��������� true�� ����
			}
		}
		
		for(int i=1; i<arr.length; i++) {
			if(!arr[i]) { //���� arr[i]�� false���
				System.out.print(i+" "); //���
			}
		}
	}
}
