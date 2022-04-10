import java.util.Scanner;

class SLL3 {
	
	private Node header;
	public int size;
	
	SLL3(){
		header = new Node();
		size = 0;
	}
	
	class Node{
		
		private Object data;
		private Node nextNode; //���� node�� ����ų �ּҰ��� ���� nextNode����
		
		Node(){} //node�� ���鶧 �Ű������ȳ������� �⺻������ ���� �ʿ�
		
		Node(Object d){
			this.data = d;
			this.nextNode = null; //���ο� node�� ���鶧, ���� node�� �ּҰ��� ���� nextNode���� null�� �ʱ�ȭ.
		}
	}
	
	public void addFirst(Object d) { //header��� �ٷ� �ڿ� �����ͻ���. �� �����͸� �Է¹޾����ϱ�, ���ο� node�� ����
		Node newNode = new Node(d); //newNode�� �Է��� d�� �����߾����!!!!

		newNode.nextNode = header.nextNode; //������ ���߿��ϳ� header(.nextNode)�� ���߿��ϰ�
		header.nextNode = newNode;

		size++; //���ο� node�ϳ� ��������ϱ� node���� size++�������!
	}
	
	public void add(int index, Object d) {
		
		if(index==0) {
			addFirst(d);
			return;
		}
		
		else {
			Node previous = getNode(index-1); //1 ������ index-1�� ���� ��� previous��带 �����
			Node next = previous.nextNode; //2 �����Ϸ��� index�� �����带 next��忡 �����Ѵ�.
			
			Node newNode = new Node(d); //3 ���� �� previous, next��� ���̿�, ���������� newNode�� ���� ���� pr,ne�� �յ� �������, �߰������� �Ϸ��Ѵ�.
			previous.nextNode = newNode;
			newNode.nextNode = next;
			size++; //index�� ���� ������ d�� ���� newNode�� ���������, size++
			
		}
		
		
	}
	
	
	
	
	
	
	
	public Object getData(int index) { //Ž�� �޼ҵ� //���
		return getNode(index).data; 
	}
	
	public Node getNode(int index) { //Ž�� �޼ҵ� //�ణ arr[index]���� ����?
		Node getNode = header.nextNode;
		
		for(int i=0; i<index; i++) {
			getNode = getNode.nextNode; 
		}
		return getNode;
		
	}
	

	
	

	
}


public class SingleLinkedList_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		SLL3 list = new SLL3();
		

		
//		System.out.print("�̸�, �й� �Է�>> ");
//		Object input = sc.nextLine();
//		list.addFirst(input);
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.add(1, 10);
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.add(1, 10);
		
		for(int i=0; i<list.size; i++) {
			System.out.print(list.getData(i)+ " ");
		}
		System.out.println();
		System.out.println("���� size>> "+list.size);
		
		
		
		int cnt=0;
		
		while(true) {
			System.out.print("�̸� �й�>> ");
			Object input = sc.nextLine();
			if(input.equals("print")) {
				for(int i=0; i<cnt; i++) {
					System.out.print(list.getData(i)+" ");
				} break;
			}
			else {
				list.addFirst(input);
				cnt++;
			}


		}

		sc.close();
		

	}

}
