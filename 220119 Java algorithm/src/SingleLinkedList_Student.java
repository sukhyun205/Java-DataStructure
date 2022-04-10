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
		private Node nextNode; //다음 node를 가르킬 주소값을 가진 nextNode변수
		
		Node(){} //node를 만들때 매개변수안넣으려면 기본생성자 선언 필요
		
		Node(Object d){
			this.data = d;
			this.nextNode = null; //새로운 node를 만들때, 다음 node의 주소값을 가진 nextNode에는 null로 초기화.
		}
	}
	
	public void addFirst(Object d) { //header노드 바로 뒤에 데이터삽입. 새 데이터를 입력받았으니까, 새로운 node를 생성
		Node newNode = new Node(d); //newNode에 입력한 d를 전달했어야지!!!!

		newNode.nextNode = header.nextNode; //순서가 개중요하네 header(.nextNode)도 개중요하고
		header.nextNode = newNode;

		size++; //새로운 node하나 만들었으니까 node갯수 size++해줘야지!
	}
	
	public void add(int index, Object d) {
		
		if(index==0) {
			addFirst(d);
			return;
		}
		
		else {
			Node previous = getNode(index-1); //1 삽입할 index-1로 이전 노드 previous노드를 만든다
			Node next = previous.nextNode; //2 삽입하려는 index의 현재노드를 next노드에 복사한다.
			
			Node newNode = new Node(d); //3 만든 두 previous, next노드 사이에, 최종적으로 newNode를 만들어서 각각 pr,ne와 앞뒤 연결시켜, 중간삽입을 완료한다.
			previous.nextNode = newNode;
			newNode.nextNode = next;
			size++; //index에 새로 삽입할 d를 가진 newNode를 만들었으니, size++
			
		}
		
		
	}
	
	
	
	
	
	
	
	public Object getData(int index) { //탐색 메소드 //출력
		return getNode(index).data; 
	}
	
	public Node getNode(int index) { //탐색 메소드 //약간 arr[index]같은 느낌?
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
		

		
//		System.out.print("이름, 학번 입력>> ");
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
		System.out.println("현재 size>> "+list.size);
		
		
		
		int cnt=0;
		
		while(true) {
			System.out.print("이름 학번>> ");
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
