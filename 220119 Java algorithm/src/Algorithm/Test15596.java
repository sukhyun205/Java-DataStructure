package Algorithm;
//15596
class Test {
	static long sum(int[] a) { //int대신 long타입을 쓰는 이유는 입력값이 10000000000000L과같은 큰 숫자를 저장할 수 있는 타입이기 때문.
		long sum = 0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		} return sum;
	}
}