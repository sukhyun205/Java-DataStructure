import java.util.Scanner;

class SLL3 { //���Ͽ��Ḯ��Ʈ
	
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
	
	//���� �޼ҵ�
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
	
	
	//search Ž�� �޼ҵ� = index��ġ ����� �����͸� ��ȯ�ϴ� getData(int index)�޼ҵ�� ����
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
	
	//delete ���� �޼ҵ� = index��ġ ��带 �����ϴ� remove(int index)�޼ҵ�� ����
	public Object removeFirst() { //ù��° �����͸� �����ϴ� removefirst()�޼ҵ� //�� object type������ �𸣰���
		Node firstNode = getNode(0); // 1.getNode �޼ҵ�� header.nextNode(=node[0])�� ���� firstNode����
		header.nextNode = firstNode.nextNode; //2. header����� nextNode�ּҰ��� firstNode�� �����Ѽ�, ��������� node[1]�� ����Ű�� �Ѵ�.
		size--;
		return firstNode.data;
	}
	
	public Object remove(int index) { //�߰����� remove(int index)�޼ҵ�
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException("index�� ���� size���� Ŀ�� �����߻�");
		}
		
		else if(index == 0) {
			removeFirst(); //return�� ������ϳ�?
		}
		
		Node previousNode = getNode(index-1); //1.�����Ϸ��� ������� previousNode�� getNode(index-1)�� ����
		Node removeNode = previousNode.nextNode; //2.�����Ϸ��� removeNode�� previousNode.nextNode�� ����
		Node nextNode = removeNode.nextNode; //3.removeNode.nextNode�� nextNode ����
		
		previousNode.nextNode = nextNode; //4. previousNode.nextNode�ּҰ��� nextNode�� �־ removeNode�� ����!!!
		size--; //5.Node�� �ϳ� �پ����� size--;
		return removeNode.data;
		
	}
	

}


public class SingleLinkedList_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		SLL3 list = new SLL3();
		
		/* ���Ȯ��
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.add(1, 10);
		list.removeFirst();
		list.remove(1);

		
		for(int i=0; i<list.size; i++) {
			System.out.print(list.getData(i)+ " ");
		}
		System.out.println();
		System.out.println("���� size>> "+list.size);
		*/
		
		
		
		
		
		//@@@@@������� �����Դϴ�
		//�л��� �Է� �� ��� ����
		//���⼭ �ߺ��Ǵ� �����й��� �����ϰ� ������, ��� �ߺ��� �����͸� ���ؼ� �����ؾ����� �𸣰ھ ����� ����� �;� �����帳�ϴ�.@@@@@
		//����1. for������ target�����͸� ������ �����ϰ� .equals()�� �Ἥ ���Ͽ� �����ϴ½����� ��������? Ȥ�� for�� �̿��� ����� �� �ٶ�������?
		//����2. �ؿ� �Է� �� ��±������� ������ �߰� �޼ҵ��� �������� ©�� ������ �ް�ͽ��ϴ�. if, else, else if��
		
		//�Է� �� ���(���� �߰��޼ҵ� ������ ���迡�� ��ް��ֽ��ϴ�..)
		int count=0;
		while(true) {
			System.out.print("�̸� �й�>> ");
			Object input = sc.nextLine();

			if(input.equals("print")) {
				for(int i=0; i<count; i++) {
					System.out.print(list.getData(i)+" ");
				} break;
			}
			
			else {
				list.addFirst(input); //headerNode���� ù��°�� ��带 �����ϴ� addFirst(Object input)�޼ҵ�
				count++;

			}
		}
		
		//�õ��غ��͵�..
//		while(true) {
//			System.out.print("�̸� �й�>> ");
//			Object input = sc.nextLine();
//			if(input.equals("print")) {
//				for(int i=0; i<cnt; i++) {
//					
//					Object target = list.getData(i);
//					if(list.getData(i).equals(target)) {
//						list.remove(i);
//						cnt--;
//					}
//				} break;
//			}
//			else {
//				list.addFirst(input);
//				cnt++;
//			}
//		}

		sc.close();
		

	}

}
