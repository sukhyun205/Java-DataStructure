
//2019113394 �Ǽ���
//���߿��� ����Ʈ �����ϱ� 
//�ǽ�����1

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
	
	
	Node getNode(int index) { //��� Ž�� �޼ҵ�
		
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
	
	public Object getData(int index) { //�� �������� �޼ҵ�
		return getNode(index).data;
	}
	
	
	public void addFirst(Object d) { //�Ǿ� ���� �޼ҵ�
		Node newNode = new Node(d);
		newNode.nextNode = header;
		
		if(header != null) {
			header.prevNode = newNode;
		}
		
		header = newNode; //header�� newNode�� ����Ű�°ͱ���
		size++;
		
		if(header.nextNode == null) { //header.nextNode�� null�̶�°��� ���� �����͸�������尡 �ϳ��� ���ٴ� ��
			tail = header; //tail�� ù��° newNode�� ����Ű���� ��
		}
	}
	
	public void addLast(Object d) { //�ǳ� ���� �޼ҵ�
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
	
	public void add(int index, Object d) { //�߰����� �޼ҵ�
		
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
	
	public Object removeFirst() { //�Ǿ� ���� �޼ҵ�
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
	
	public void remove(int index) { //�߰� ���� �޼ҵ�
		
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
	
	public int indexOf(Object d) { //�Է� ������ d�� index Ž�� �޼ҵ�
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
		
		System.out.println("���߿��� ����Ʈ ���� �ǽ� ����1");
		
		list.addFirst("�Ǿջ���");
		list.addFirst("�Ǿջ���");
		list.addLast("������");
		list.addLast("������");
		list.add(1, "�߰�����");
		list.add(2, "�����ð�");
		
		System.out.print("����������: "+list.getData(2)+"\n");
		
		System.out.print("���: ");
		for(int i=0; i<list.size; i++) {
			System.out.print(list.getData(i)+" ");
		}System.out.println();
		

		

	
		
		
		
	}

}
