package Algorithm;

public class SelfNumber4673 {
	static int d(int n) {
		int sum = n; //sum = 1234
		while(n!=0) {
			sum += n%10; //sum = 1234+4+3+2+1 = 1244
			n = n/10; //n = 123,12,1,0 -> n이 0이되면 while문 종료
		}
		return sum; //최종적으로 n(=1234)을 이용한 셀프넘버 1244 생성
	}
	
	public static void main(String[] args) {
		boolean arr[] = new boolean[10000];
		
		for(int i=1; i<=10000; i++) {
			if(d(i)<10000) { //10000이상의 셀프넘버는 필요없다
				arr[d(i)] = true; //셀프넘버에 해당하는 수는 arr에서 지우기위해 true로 설정
			}
		}
		
		for(int i=1; i<arr.length; i++) {
			if(!arr[i]) { //만약 arr[i]가 false라면
				System.out.print(i+" "); //출력
			}
		}
	}
}
