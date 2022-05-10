
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
	
	public boolean isEmpty() { //데크가 비어있는지 체크하는 isEmpty()메소드
		return (front == null); //front 노드가 비어있다면 true 리턴
	}
	
	public int size() { //항목갯수 체크 size()메소드
		return size;
		
	}
	
	public void addFront(int data) { //front에서 삽입하는 addFront(d)메소드
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}
		
		front.prevNode = newNode;
		newNode.nextNode = front;
		front = newNode; //front 노드 변경
		front.prevNode = rear; //원형
		rear.nextNode = front; //원형
		
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
		rear = newNode; //rear 노드 변경
		front.prevNode = rear; //원형
		rear.nextNode = front; //원형
		
		size++;
	}
	
	
	public int rmFront() { //front에서 삭제하는 rmFront()메소드
		
		if(isEmpty()) {
			System.out.println("deque가 비어있음");
			return 0;
		}
		
		int returnData = front.data; //삭제할 노드의 데이터를 담을 변수생성
		
		if(front.nextNode == null) {
			front = null;
			rear = null;
			size--;
		} else {
			front = front.nextNode;
			front.prevNode = rear; //원형
			rear.nextNode = front; //원형
			size--;
		}
		
		return returnData; //삭제할 노드의 데이터 리턴
	}
	
	public int rmRear() { //rear에서 삭제하는 rmRear()메소드
		
		if(isEmpty()) {
			System.out.println("deque가 비어있음");
			return 0;
		}
		
		int returnData = rear.data; //삭제할 노드의 데이터를 담을 변수생성
		
		if(rear.prevNode == null) {
			front = null;
			rear = null;
			size--;
		} else {
			rear = rear.prevNode;
			rear.nextNode = front; //원형
			front.prevNode = rear; //원형
			size--;
		}
		
		return returnData; //삭제할 노드의 데이터 리턴
	}
	
	
	
	
	public void peekFront() { //front가 가르키는 값 리턴하는 peekFront()메소드
		System.out.println("Front가 가르키는 값 = "+front.data);
	}
	
	public void peekRear() { //rear가 가르키는 값 리턴하는 peekRear()메소드
		System.out.println("Rear가 가르키는 값 = "+rear.data);
	}
	
	public int returnFront() {
		return front.data;
	}
	
	
	
	public void print() { //앞서 작성한 getNode()메소드를 활용한 print()메소드
		System.out.print("결과출력>> ");
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
		
		System.out.println("실습과제 2: 요세푸스 문제");
		
		DCDLL2 list = new DCDLL2(); //n개의 값을 넣을 list생성
		DCDLL2 AddedList = new DCDLL2(); // list에서 rmFront()한 데이터를 옮길 AddedList생성
		
		System.out.println("전체 사람수 n=10, 순서 k=7이라고 가정");
		
		for(int i=5; i>0; i--) { //front로부터 삽입
			list.addFront(i);
		}
		for(int i=6; i<11; i++) { //Rear로부터 삽입
			list.addRear(i);
		}
		
		
		while(list.size() > 0) {
			for(int i=0; i<6; i++) { //k-1인 6번 반복해서 Front가 가르키고 있는값을, Rear에 삽입
				list.addRear(list.rmFront());
			}
			
			AddedList.addRear(list.rmFront()); //Front가 가르키는 값을 AddedList에 삽입
		}
		
		AddedList.print();
    }

}

