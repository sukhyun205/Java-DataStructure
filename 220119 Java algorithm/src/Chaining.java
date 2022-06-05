import java.util.Random;

public class Chaining<K, V>{
	
	private int M = 13; //테이블 크기=13
	private Node[] arr = new Node[M]; //그치 노드타입의 arr배열이여야, arr[i]에다 연결리스트node를 집어넣을 수 있지
	
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
	
	public int h(K key) {
		return (key.hashCode() & 0x7fffffff) % M; //h(key) 해싱메소드h
	}
	
	
	
	private void add(K key, V data) { //key=37, data="apple"
		int index = h(key); //h(key)를 돌려서 index값 생성
		
		for(Node newNode=arr[index]; newNode!=null; newNode = newNode.nextNode) { //index활용하여 newNode생성, newNode에 값이 삽입될때까지 for문
			if(key.equals(newNode.key)) { //만약 newNode의 key값(50:orange)이 이전 newNode의 key값(
				newNode.data = data;
				return;
			}
		}
		arr[index] = new Node(key, data, arr[index]); //key값이 중복되지않는다면, 첫노드에 key, data삽입
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
		
		for(int i=0; i<20; i++) {
			n = random.nextInt(19)+1;
			System.out.print(n+" ");
			hash.add(n, "data");
		}
		
		System.out.println();
		

//		hash.add(37,"apple");
//		hash.add(50, "watermelon");
//		System.out.println(hash.arr[11].data);
//		System.out.println(hash.arr[11].nextNode.data);
		hash.print();

	}
	
	
}

