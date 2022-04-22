
//2019113394 권석현
//이중연결 리스트 구현하기 
//실습과제1

class DLL3{
	
	private Node header;
	private Node tail;
	int size=0;
	
	class Node{
		
		private Node prevNode;
		private Node nextNode;
		Object data;
		
		Node(Object d){
			this.data = d;
			this.prevNode = null;
			this.nextNode = null;
		}
	}
	
	
	Node getNode(int index) { //노드 탐색 메소드
		
		if(index < size/2) {
			Node get = header;
			for(int i=0; i<index; i++) {
				get = get.nextNode;
			}
			return get;
		}
		else {
			Node get = tail;
			for(int i=size-1; i>index; i--) {
				get = get.prevNode;
			}
			return get;
		}
		
	}
	
	public Object getData(int index) { //값 가져오기 메소드
		return getNode(index).data;
	}
	
	
	public void addFirst(Object d) { //맨앞 삽입 메소드
		Node newNode = new Node(d);
		newNode.nextNode = header;
		
		if(header != null) {
			header.prevNode = newNode;
		}
		
		header = newNode; //header가 newNode를 가르키는것까지
		size++;
		
		if(header.nextNode == null) { //header.nextNode가 null이라는것은 현재 데이터를가진노드가 하나도 없다는 뜻
			tail = header; //tail이 첫번째 newNode를 가르키도록 함
		}
	}
	
	public void addLast(Object d) { //맨끝 삽입 메소드
		Node newNode = new Node(d);
		
		if(size == 0) {
			addFirst(d);
		}
		
		else {
			tail.nextNode = newNode;
			newNode.prevNode = tail;
			tail = newNode;
			size++;
		}
	}
	
	public void add(int index, Object d) { //중간삽입 메소드
		
		if(index == 0) {
			addFirst(d);
		}
		
		else {
			Node tmp1 = getNode(index -1);
			Node tmp2 = getNode(index);
			
			Node newNode = new Node(d);
			
			tmp1.nextNode = newNode;
			newNode.nextNode = tmp2;
			
			tmp2.prevNode = newNode;

			newNode.prevNode = tmp1;
			size++;
			
			
		}
	}
	
	public Object removeFirst() { //맨앞 삭제 메소드
		Node tmp1 = header;
		
		header = tmp1.nextNode;
		
		Object returnData = tmp1.data;

		tmp1 = null;
		
		if(header != null) {
			header.prevNode = null;
		}
		
		size--;
		return returnData;
	}
	
	public void remove(int index) { //중간 삭제 메소드
		
		if(index == 0) {
			removeFirst();
		}
		
		else {
			Node tmp = getNode(index-1);
			
			tmp.nextNode = tmp.nextNode.nextNode;
			
			if(tmp.nextNode != null) {
				tmp.nextNode.prevNode = tmp;	
			}
			
			if(tmp.nextNode == null) {
				tail = tmp;
			}
			
			size--;
		}
	}
	
	public int indexOf(Object d) { //입력 데이터 d의 index 탐색 메소드
		Node tmp = header;
		
		int index = 0;
		
		if(tmp == null) {
			return -1;
		}
		
		if(tmp.data.equals(d)) {
			return index;
		}
		
		while(tmp.data != d) {
			tmp = tmp.nextNode;
			index++;
			if(tmp == null) {
				return -1;
			}
		}
		
		return index;
		
	}
	
	
	
	
	
	
}


public class DoublyLinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLL4 list = new DLL4();
		
		System.out.println("이중연결 리스트 구현 실습 과제1");
		
		list.addFirst("맨앞삽입");
		list.addFirst("맨앞삽입");
		list.addLast("끝삽입");
		list.addLast("끝삽입");
		list.add(1, "중간삽입");
		list.add(2, "가져올값");
		
		System.out.print("값가져오기: "+list.getData(2)+"\n");
		
		System.out.print("출력: ");
		for(int i=0; i<list.size; i++) {
			System.out.print(list.getData(i)+" ");
		}System.out.println();
		

		

	
		
		
		
	}

}
