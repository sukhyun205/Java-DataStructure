import java.util.Random;

public class Chaining<K, V>{
	
	private int M = 13; //���̺� ũ��=13
	private Node[] arr = new Node[M]; //��ġ ���Ÿ���� arr�迭�̿���, arr[i]���� ���Ḯ��Ʈnode�� ������� �� ����
	
	public static class Node{ //class Node
		private Object key;
		private Object data;
		private Node nextNode;
		
		public Node(Object newkey, Object newdata, Node ref) {	//ref = reference(����)
			key = newkey;
			data = newdata;
			nextNode = ref;
		}
		public Object getData() {
			return data; //������orange return
		}
		public Object getKey() {
			return key; //key�� return
		}
		
	    public String toString()
	    {
	        if( nextNode != null )
	            return key + "->" + data + " | " + nextNode.toString();
	        
	        return key + "->" + data;
	    }

	}
	
	public int h(K key) {
		return (key.hashCode() & 0x7fffffff) % M; //h(key) �ؽ̸޼ҵ�h
	}
	
	
	
	private void add(K key, V data) { //key=37, data="apple"
		int index = h(key); //h(key)�� ������ index�� ����
		
		for(Node newNode=arr[index]; newNode!=null; newNode = newNode.nextNode) { //indexȰ���Ͽ� newNode����, newNode�� ���� ���Եɶ����� for��
			if(key.equals(newNode.key)) { //���� newNode�� key��(50:orange)�� ���� newNode�� key��(
				newNode.data = data;
				return;
			}
		}
		arr[index] = new Node(key, data, arr[index]); //key���� �ߺ������ʴ´ٸ�, ù��忡 key, data����
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

