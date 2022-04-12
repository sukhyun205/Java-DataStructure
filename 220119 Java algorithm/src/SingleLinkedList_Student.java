import java.util.Scanner;

class SLL3 { //단일연결리스트
	
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
	
	//삽입 메소드
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
	
	
	//search 탐색 메소드 = index위치 노드의 데이터를 반환하는 getData(int index)메소드로 구현
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
	
	//delete 삭제 메소드 = index위치 노드를 삭제하는 remove(int index)메소드로 구현
	public Object removeFirst() { //첫번째 데이터를 삭제하는 removefirst()메소드 //왜 object type인지는 모르겠음
		Node firstNode = getNode(0); // 1.getNode 메소드로 header.nextNode(=node[0])을 가진 firstNode생성
		header.nextNode = firstNode.nextNode; //2. header노드의 nextNode주소값을 firstNode로 가르켜서, 결과적으로 node[1]을 가르키게 한다.
		size--;
		return firstNode.data;
	}
	
	public Object remove(int index) { //중간삭제 remove(int index)메소드
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException("index가 실제 size보다 커서 에러발생");
		}
		
		else if(index == 0) {
			removeFirst(); //return을 해줘야하나?
		}
		
		Node previousNode = getNode(index-1); //1.삭제하려는 이전노드 previousNode를 getNode(index-1)로 생성
		Node removeNode = previousNode.nextNode; //2.삭제하려는 removeNode를 previousNode.nextNode로 생성
		Node nextNode = removeNode.nextNode; //3.removeNode.nextNode로 nextNode 생성
		
		previousNode.nextNode = nextNode; //4. previousNode.nextNode주소값에 nextNode를 넣어서 removeNode를 삭제!!!
		size--; //5.Node가 하나 줄었으니 size--;
		return removeNode.data;
		
	}
	

}


public class SingleLinkedList_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		SLL3 list = new SLL3();
		
		/* 출력확인
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
		System.out.println("현재 size>> "+list.size);
		*/
		
		
		
		
		
		//@@@@@여기부터 질문입니다
		//학생부 입력 및 출력 과제
		//여기서 중복되는 동일학번를 삭제하고 싶은데, 어떻게 중복된 데이터를 비교해서 삭제해야할지 모르겠어서 방법을 여쭙고 싶어 질문드립니다.@@@@@
		//질문1. for문으로 target데이터를 일일이 지정하고 .equals()를 써서 비교하여 제거하는식으로 가능한지? 혹은 for문 이외의 방법이 더 바람직한지?
		//질문2. 밑에 입력 및 출력구조에서 삭제와 추가 메소드의 논리구조를 짤때 조언을 받고싶습니다. if, else, else if등
		
		//입력 및 출력(삭제 추가메소드 논리구조 설계에서 헤메고있습니다..)
		int count=0;
		while(true) {
			System.out.print("이름 학번>> ");
			Object input = sc.nextLine();

			if(input.equals("print")) {
				for(int i=0; i<count; i++) {
					System.out.print(list.getData(i)+" ");
				} break;
			}
			
			else {
				list.addFirst(input); //headerNode다음 첫번째에 노드를 삽입하는 addFirst(Object input)메소드
				count++;

			}
		}
		
		//시도해본것들..
//		while(true) {
//			System.out.print("이름 학번>> ");
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
