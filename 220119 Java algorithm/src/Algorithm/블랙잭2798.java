package Algorithm;
import java.util.Scanner;
//���Ʈ������ ����Ʈ�� ���� �� ������ ��� ����� ���� �˻��Ѵٴ� ��

public class ����2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //ī�尳��
		int M = sc.nextInt(); //���谪
		int sum = 0; //M�� ���� sum
		int max = 0;
		int arr[] = new int[n]; //�迭
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}sc.close();
		
		//x���� ī�带 �̴� ��� ����� ���� ���ϱ� ���� x�� for�� ����
		for(int i=0; i<n; i++) {
			for(int j=1; j<n; j++) {
				for(int k=2; k<n; k++) {
					if(arr[i] != arr[j] && arr[j] != arr[k] && arr[i] != arr[k]) { //�׷��� �ߺ���� ���Ϸ��� 3������ �� �ٸ��� ����
						if(arr[i]+arr[j]+arr[k] <= M) {                      //3�� ī�尪 ���� <= M
							sum = arr[i]+arr[j]+arr[k];                      //sum�� 3�� ī�尪�� �ְ�
							if(max<sum) {                                    //max�� M�� �Ѿ��� �������� M����, max�̻� ���� sum�� �Ҵ�
								max = sum;
							}
						}System.out.println("i:"+i+" j:"+j+" k:"+k+" sum:"+sum+" max:"+max); //üũ��
					}
				}
			}
		}
		System.out.println(max); //M�� ���� ����� max�� ���
	}
}
