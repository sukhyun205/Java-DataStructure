

class DCDLL{ //DequeCircleDoublyLinkedList
	
	private Node front;
	private Node rear;
	private int size = 0;
	
	DCDLL(){
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
		System.out.println("size = "+size);
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
		System.out.println("front���԰� = "+data);
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
		System.out.println("rear���԰� = "+data);
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
	
	
	
	public void print() { //�ռ� �ۼ��� getNode()�޼ҵ带 Ȱ���� print()�޼ҵ�
		System.out.print("���>> ");
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




public class DequeCDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DCDLL list = new DCDLL();
		
		System.out.println("�ǽ����� 1: �Է¹��� �� �������� ����ϱ�");
		
		list.addFront(10);
		list.addFront(20);
		list.addFront(30);
		
//		list.rmFront();
//		list.rmRear();
		
//		list.peekFront();
//		list.peekRear();
		
		list.size();
		list.print();
		

	}

}
