

class DLL {
	
	private Node headerNode;
	private Node tailNode;
	
	int size;
	
	DLL(){
//		headerNode = headerNode.nextNode; //�� �׳� headerNode�� prevNode�� �ȸ����?
		size = 0;
	}
	
	public void addFirst(Object d) {
		Node newNode = new Node(d);
		
		if(headerNode != null) { //case1 ������ Node�� �ϳ��� ������ //�׳� headerNode�� �� �ּҰ��� �ƴ���? //�ֳĸ� headerNode�ȿ� ���� �ϳ��� ������ null�� �ƴϴϱ�
			newNode.nextNode = headerNode;
			headerNode.prevNode = newNode;
		}
		
		headerNode = newNode; //�� headerNode�� newNode�� �����ͷ� �ٲ���?
		
		if(headerNode.nextNode == null) { //case2 ���� Node�� �ϳ��� ������ //headerNode�� next�ּҰ��� null�̶�� ���� ���� ���� Node�� �ϳ������ٴ� ��!			
		    tailNode = headerNode;
		}
		size++; //��� ������ �ϳ��þ����� size++
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
			this.nextNode = null; //���� �ּҰ��� null �ʱ�ȭ
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
		
		System.out.print("���� size= "+list.size);

	}

}
