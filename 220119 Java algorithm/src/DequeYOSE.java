
class DCDLL2{ //DequeCircleDoublyLinkedList
	
	private Node front;
	private Node rear;
	private int size = 0;
	
	DCDLL2(){
		this.front = null;
		this.rear = null;
	}
	
	class Node{
		private Node nextNode;
		private Node prevNode;
		private int data;
		
		Node(int data){
			this.nextNode = null;
			this.nextNode = null;
			this.data = data;
		}
	}
	
	public boolean isEmpty() { //��ũ�� ����ִ��� üũ�ϴ� isEmpty()�޼ҵ�
		return (front == null); //front ��尡 ����ִٸ� true ����
	}
	
	public int size() { //�׸񰹼� üũ size()�޼ҵ�
		return size;
		
	}
	
	public void addFront(int data) { //front���� �����ϴ� addFront(d)�޼ҵ�
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}
		
		front.prevNode = newNode;
		newNode.nextNode = front;
		front = newNode; //front ��� ����
		front.prevNode = rear; //����
		rear.nextNode = front; //����
		
		size++;
	}
	
	public void addRear(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}
		
		rear.nextNode = newNode;
		newNode.prevNode = rear;
		rear = newNode; //rear ��� ����
		front.prevNode = rear; //����
		rear.nextNode = front; //����
		
		size++;
	}
	
	
	public int rmFront() { //front���� �����ϴ� rmFront()�޼ҵ�
		
		if(isEmpty()) {
			System.out.println("deque�� �������");
			return 0;
		}
		
		int returnData = front.data; //������ ����� �����͸� ���� ��������
		
		if(front.nextNode == null) {
			front = null;
			rear = null;
			size--;
		} else {
			front = front.nextNode;
			front.prevNode = rear; //����
			rear.nextNode = front; //����
			size--;
		}
		
		return returnData; //������ ����� ������ ����
	}
	
	public int rmRear() { //rear���� �����ϴ� rmRear()�޼ҵ�
		
		if(isEmpty()) {
			System.out.println("deque�� �������");
			return 0;
		}
		
		int returnData = rear.data; //������ ����� �����͸� ���� ��������
		
		if(rear.prevNode == null) {
			front = null;
			rear = null;
			size--;
		} else {
			rear = rear.prevNode;
			rear.nextNode = front; //����
			front.prevNode = rear; //����
			size--;
		}
		
		return returnData; //������ ����� ������ ����
	}
	
	
	
	
	public void peekFront() { //front�� ����Ű�� �� �����ϴ� peekFront()�޼ҵ�
		System.out.println("Front�� ����Ű�� �� = "+front.data);
	}
	
	public void peekRear() { //rear�� ����Ű�� �� �����ϴ� peekRear()�޼ҵ�
		System.out.println("Rear�� ����Ű�� �� = "+rear.data);
	}
	
	public int returnFront() {
		return front.data;
	}
	
	
	
	public void print() { //�ռ� �ۼ��� getNode()�޼ҵ带 Ȱ���� print()�޼ҵ�
		System.out.print("������>> ");
		for(int i=0; i<size; i++) {
			System.out.print(getData(i)+ " ");
		}
	}
	
	public Node getNode(int index) { 
		
		if(index < size/2) {
			Node get = front;
			for(int i=0; i<index; i++) {
				get = get.nextNode;
			}
			return get;
		}
		else {
			Node get = rear;
			for(int i=size-1; i>index; i--) {
				get = get.prevNode;
			}
			return get;
		}
		
	}
	
	public int getData(int index) {
		return getNode(index).data;
	}
	
}



public class DequeYOSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�ǽ����� 2: �似Ǫ�� ����");
		
		DCDLL2 list = new DCDLL2(); //n���� ���� ���� list����
		DCDLL2 AddedList = new DCDLL2(); // list���� rmFront()�� �����͸� �ű� AddedList����
		
		System.out.println("��ü ����� n=10, ���� k=7�̶�� ����");
		
		for(int i=5; i>0; i--) { //front�κ��� ����
			list.addFront(i);
		}
		for(int i=6; i<11; i++) { //Rear�κ��� ����
			list.addRear(i);
		}
		
		
		while(list.size() > 0) {
			for(int i=0; i<6; i++) { //k-1�� 6�� �ݺ��ؼ� Front�� ����Ű�� �ִ°���, Rear�� ����
				list.addRear(list.rmFront());
			}
			
			AddedList.addRear(list.rmFront()); //Front�� ����Ű�� ���� AddedList�� ����
		}
		
		AddedList.print();
    }

}

