package Algorithm;
//15596
class Test {
	static long sum(int[] a) { //int��� longŸ���� ���� ������ �Է°��� 10000000000000L������ ū ���ڸ� ������ �� �ִ� Ÿ���̱� ����.
		long sum = 0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		} return sum;
	}
}