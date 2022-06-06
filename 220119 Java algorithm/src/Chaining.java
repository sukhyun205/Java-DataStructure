import java.util.Random;
import java.util.Scanner;

public class Chaining<K, V>{
	
	private int M = 13; //테이블 크기=13
	private Node[] arr = new Node[M]; //그치 노드타입의 arr배열이여야, arr[i]에다 연결리스트node를 집어넣을 수 있지
	
	private int Hsize;
	private int Dsize;
	
	public static class Node{ //class Node
		private Object key;
		private Object data;
		private Node nextNode;
		
		public Node(Object newkey, Object newdata, Node ref) {	//ref = reference(참조)
			key = newkey;
			data = newdata;
			nextNode = ref;
		}
		public Object getData() {
			return data; //데이터orange return
		}
		public Object getKey() {
			return key; //key값 return
		}
		
	    public String toString()
	    {
	        if( nextNode != null )
	            return key + "->" + data + " | " + nextNode.toString();
	        
	        return key + "->" + data;
	    }

	}
	
	public void Hsize() {
		System.out.println("h(key)갯수: "+Hsize);
	}
	
	public void Dsize() {
		System.out.println("d(key)갯수: "+Dsize);
	}
	
	public void SumSize() {
		System.out.println("전체갯수: "+(int)(Hsize+Dsize));
	}
	
	public int h(K key) {
		return (key.hashCode() & 0x7fffffff) % M; //h(key) 해싱메소드h
	}
	
	
	
	
	private void add(K key, V data) { //key=37, data="apple"
		int initial = h(key); //h(key)를 돌려서 index값 생성
		int i = initial;
		
		for(Node newNode=arr[i]; newNode!=null; newNode = newNode.nextNode) { //index활용하여 newNode생성, newNode에 값이 삽입될때까지 for문
			if(key.equals(newNode.key)) { //만약 newNode의 key값(50:orange)이 이전 newNode의 key값(
				
				int d = (7-(int)key%7);
				for(Node DNode=arr[d]; DNode!=null; DNode=DNode.nextNode) {
					if(key.equals(DNode.key)) {
						DNode.data=data;
						Dsize++;
						return;
					}
					arr[d] = new Node(key, data, arr[d]);
					Dsize++;
					return;
				}
				
//				newNode.data = data;
//				Hsize++;
//				return;
			}
		}
		arr[i] = new Node(key, data, arr[i]); //key값이 중복되지않는다면, 첫노드에 key, data삽입
		Hsize++;
	}
	
	
	private void UserAdd(K key, V data) { //key=37, data="apple"
		int initial = h(key); //h(key)를 돌려서 index값 생성
		int i = initial;
		
		for(Node newNode=arr[i]; newNode!=null; newNode = newNode.nextNode) { //index활용하여 newNode생성, newNode에 값이 삽입될때까지 for문
			if(key.equals(newNode.key)) { //만약 newNode의 key값(50:orange)이 이전 newNode의 key값(
				System.out.println("충돌발생!!"+"\n"+"데이터출력: ");
				print();
				int d = (7-(int)key%7);
				for(Node DNode=arr[d]; DNode!=null; DNode=DNode.nextNode) {
					if(key.equals(DNode.key)) {
						DNode.data=data;
						Dsize++;
						
						return;
					}
					arr[d] = new Node(key, data, arr[d]);
					Dsize++;
					return;
				}
				
//				newNode.data = data;
//				Hsize++;
//				return;
			}
		}
		arr[i] = new Node(key, data, arr[i]); //key값이 중복되지않는다면, 첫노드에 key, data삽입
		Hsize++;
	}
	
    void print()
    {
        for( int i = 0; i < arr.length; ++i )
            System.out.println(arr[i] == null? null: arr[i].toString());
        System.out.println("--------------------------------------------------------------------");
    }
    

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chaining<Integer, String> hash = new Chaining<Integer, String>();
		
		Random random = new Random();
		
		int n = 0;
		
		System.out.print("1~19사이의 난수 20개 출력>> ");
		for(int i=0; i<20; i++) {
			n = random.nextInt(19)+1;
			System.out.print(n+" ");
			hash.add(n, "data"); //해쉬 함수로 2방향 체이닝에 저장
		}System.out.println("\n"+"체이닝에 저장완료.");
		

//		hash.add(37,"apple");
//		hash.add(50, "watermelon");
//		System.out.println(hash.arr[11].data);
//		System.out.println(hash.arr[11].nextNode.data);
		hash.Hsize();
		hash.Dsize();
		hash.SumSize();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n"+"*충돌시 데이터가 출력되며, 충돌되지 않을 시 전체size가 출력됩니다. 여러번 출력해서 확인부탁드립니다.");
		System.out.print("숫자를 입력하시오>> ");
		int input = sc.nextInt();
		hash.UserAdd(input, "user");
		
		hash.Hsize();
		hash.Dsize();
		hash.SumSize();
		

		
		


	}
}

