package Algorithm;
import java.util.Scanner;

public class �ܾ����1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a_input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";   //���ĺ� �迭ũ�⸦ ���� String abc
		int f[] = new int[a_input.length()];             //�� frequency[] �迭     //���ĺ� �󵵼��� ����ϱ� ���� intŸ�� alpha[]�迭����
		String s_input = sc.next();
		String s[] = s_input.toUpperCase().split("");    //�Է°� �迭����
		String a[] = a_input.split("");
		
		for(int i=0; i<s.length; i++) {                  //����for������ s[], a[]�迭 ���ؼ� f[]�󵵹迭 ī��Ʈ�� +1
			for(int j=0; j<a.length; j++) {
				if(s[i].equals(a[j])) {                  //'M'='M'�̸� +1
					f[j]++;
				}
			}
		}
		
		//�󵵼� �ߺ��� Ȯ�θ� ����, max�󵵼� ���
		int max = f[0];
		for(int i=0; i<f.length; i++) {
//			System.out.print(((char)('A'+i))+":"+f[i]+" ");
			if(max<f[i]) {
				max = f[i];
			}
		}
		
		//�� ���� �ߺ��������� ?��� �ƴϸ� �������
		int cnt=0; //�ߺ����� �ִ��� ���θ� �Ǵ��ϱ� ���� cnt������
		char result = ' ';
		for(int i=0; i<f.length; i++) {
			if(f[i]==max) {
				cnt++;
			}
		}
//		System.out.println("\n"+max+" "+cnt);
		
		for(int i=0; i<f.length; i++) {
			if(f[i]==max) {
				result = (char)('A'+i); //result=�󵵼� max���� �ش��ϴ� ���ĺ�
				if(cnt>1) {
					result = '?';
				}
			}
		}
	
		System.out.println(result); //������
	}
}
