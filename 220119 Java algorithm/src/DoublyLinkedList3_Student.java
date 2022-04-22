
//2019113394 권석현
//이중연결 리스트 구현하기
//실습 과제2 학생부

import java.util.Scanner;

class DLL4{
	
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
	
	
	Node getNode(int index) { 
		
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
	
	public Object getData(int index) {
		return getNode(index).data;
	}
	
	
	public void addFirst(Object d) {
		Node newNode = new Node(d);
		newNode.nextNode = header;
		
		if(header != null) {
			header.prevNode = newNode;
		}
		
		header = newNode;
		size++;
		
		if(header.nextNode == null) { 
			tail = header; 
		}
	}
	
	public void addLast(Object d) { 
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
	
	public void add(int index, Object d) {
		
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
	
	public Object removeFirst() {
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
	
	public void remove(int index) {
		
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
	
	public int indexOf(Object d) {
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


public class DoublyLinkedList3_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLL3 list = new DLL3();
		
		System.out.println("이중연결 리스트 구현 실습 과제2");
		
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		
		while(true) {
			System.out.print("이름과 학번(3자리)을 띄어쓰기로 입력하시오>> ");
			Object input = sc.nextLine();
			
			if(input.equals("print")) {
				for(int i=count-1; i>=0; i--) {
					System.out.print(list.getData(i)+" ");
				}
				break;
			}
			
			else {
				int check = list.indexOf(input);
				if(check == -1) {
					list.addFirst(input);
					count++;
				}
				else {
					System.out.println("중복되는 데이터가 있습니다.");
					list.remove(check);
					count--;
				}
				
			}
			
			
		}
		
		
		
	}

}
