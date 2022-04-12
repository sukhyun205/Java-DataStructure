

class DLL {
	
	private Node headerNode;
	private Node tailNode;
	
	int size;
	
	DLL(){
//		headerNode = headerNode.nextNode; //아 그냥 headerNode랑 prevNode를 안만드네?
		size = 0;
	}
	
	public void addFirst(Object d) {
		Node newNode = new Node(d);
		
		if(headerNode != null) { //case1 기존에 Node가 하나라도 있을때 //그냥 headerNode네 왜 주소값이 아니지? //왜냐면 headerNode안에 값이 하나라도 있으면 null이 아니니까
			newNode.nextNode = headerNode;
			headerNode.prevNode = newNode;
		}
		
		headerNode = newNode; //왜 headerNode를 newNode의 데이터로 바꾸지?
		
		if(headerNode.nextNode == null) { //case2 기존 Node가 하나도 없을때 //headerNode의 next주소값이 null이라는 말은 현재 기존 Node가 하나도없다는 뜻!			
		    tailNode = headerNode;
		}
		size++; //노드 갯수가 하나늘었으니 size++
	}
	
	
	public Object getData(int index) {
		return getNode(index).data;
	}
	
	public Node getNode(int index) {
		if(index<size/2) {
			Node node = headerNode;
			for(int i=0; i<index; i++) {
				node = node.nextNode;
			}
			return node;
		}
		else {
			Node node = tailNode;
			for(int i=size-1; i>index; i--) {
				node = node.prevNode;
			}
			return node;
		}
		
	}
	
	
	class Node{
		
		private Object data;
		private Node nextNode;
		private Node prevNode;
		
		Node(Object d){
			this.data = d;
			this.nextNode = null; //양쪽 주소값은 null 초기화
			this.prevNode = null;
		}
		
		
	}
	
	
}


public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLL list = new DLL();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		
		for(int i=0; i<3; i++) {
			System.out.print(list.getData(i)+" ");
		}
		System.out.println();
		
		System.out.print("현재 size= "+list.size);

	}

}
