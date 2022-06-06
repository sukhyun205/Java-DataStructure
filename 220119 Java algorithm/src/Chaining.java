import java.util.Random;
import java.util.Scanner;

public class Chaining<K, V>{
	
	private int M = 13; //���̺� ũ��=13
	private Node[] arr = new Node[M]; //��ġ ���Ÿ���� arr�迭�̿���, arr[i]���� ���Ḯ��Ʈnode�� ������� �� ����
	
	private int Hsize;
	private int Dsize;
	
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
	
	public void Hsize() {
		System.out.println("h(key)����: "+Hsize);
	}
	
	public void Dsize() {
		System.out.println("d(key)����: "+Dsize);
	}
	
	public void SumSize() {
		System.out.println("��ü����: "+(int)(Hsize+Dsize));
	}
	
	public int h(K key) {
		return (key.hashCode() & 0x7fffffff) % M; //h(key) �ؽ̸޼ҵ�h
	}
	
	
	
	
	private void add(K key, V data) { //key=37, data="apple"
		int initial = h(key); //h(key)�� ������ index�� ����
		int i = initial;
		
		for(Node newNode=arr[i]; newNode!=null; newNode = newNode.nextNode) { //indexȰ���Ͽ� newNode����, newNode�� ���� ���Եɶ����� for��
			if(key.equals(newNode.key)) { //���� newNode�� key��(50:orange)�� ���� newNode�� key��(
				
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
		arr[i] = new Node(key, data, arr[i]); //key���� �ߺ������ʴ´ٸ�, ù��忡 key, data����
		Hsize++;
	}
	
	
	private void UserAdd(K key, V data) { //key=37, data="apple"
		int initial = h(key); //h(key)�� ������ index�� ����
		int i = initial;
		
		for(Node newNode=arr[i]; newNode!=null; newNode = newNode.nextNode) { //indexȰ���Ͽ� newNode����, newNode�� ���� ���Եɶ����� for��
			if(key.equals(newNode.key)) { //���� newNode�� key��(50:orange)�� ���� newNode�� key��(
				System.out.println("�浹�߻�!!"+"\n"+"���������: ");
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
		arr[i] = new Node(key, data, arr[i]); //key���� �ߺ������ʴ´ٸ�, ù��忡 key, data����
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
		
		System.out.print("1~19������ ���� 20�� ���>> ");
		for(int i=0; i<20; i++) {
			n = random.nextInt(19)+1;
			System.out.print(n+" ");
			hash.add(n, "data"); //�ؽ� �Լ��� 2���� ü�̴׿� ����
		}System.out.println("\n"+"ü�̴׿� ����Ϸ�.");
		

//		hash.add(37,"apple");
//		hash.add(50, "watermelon");
//		System.out.println(hash.arr[11].data);
//		System.out.println(hash.arr[11].nextNode.data);
		hash.Hsize();
		hash.Dsize();
		hash.SumSize();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n"+"*�浹�� �����Ͱ� ��µǸ�, �浹���� ���� �� ��üsize�� ��µ˴ϴ�. ������ ����ؼ� Ȯ�κ�Ź�帳�ϴ�.");
		System.out.print("���ڸ� �Է��Ͻÿ�>> ");
		int input = sc.nextInt();
		hash.UserAdd(input, "user");
		
		hash.Hsize();
		hash.Dsize();
		hash.SumSize();
		

		
		


	}
}

