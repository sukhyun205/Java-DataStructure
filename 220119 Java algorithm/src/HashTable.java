import java.util.Random;

class Chaining{
	
	int length = 13;
	Node[] arr = new Node[length];
	
	class Node{
		Object key;
		Object data;
		Node nextNode;
		
		Node(Object random, Object newdata) {
			key = random;
			data = newdata;
		}
		
		public Object getkey() {
			return key;
		}
	}
	
	public int hash(Object random) { //hash�Լ�
		return (random.hashCode() & 0x7fffffff) % length;
	}
	
	public void put(Object key, int data) {
		int input = hash(key);
		for(Node newNode = arr[input]; newNode != null; newNode=newNode.nextNode) {
			if(key.equals(newNode.key)) {
				newNode.data = data;
				return;
			}
		}
		arr[input] = new Node(key, data);
	}
	
}

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chaining C = new Chaining();
		
		Random random = new Random();
		
		for(int i=0; i<20; i++) {
//			System.out.println((int) (Math.random()*20));
			int n = random.nextInt(19)+1;
			System.out.print(n+" ");
			int hashed = C.hash(n); //h���� �ִ밪�� ���̺� ũ�� 13���� �۴�!! ������!!!
			System.out.print("h"+C.hash(n)+" "); 
		}
		
		C.put(hashed, 25);
		C.put(hashed, 37);
		C.put(hashed, 18);
		C.put(hashed, 55);
		C.put(hashed, 22);
		C.put(hashed, 35);
		C.put(hashed, 50);
		C.put(hashed, 63);
		
		//hashed�� ������, d�ؽ��Լ� �ϳ� �� �����, length�� �޾Ƽ� ���ϴ� �޼ҵ� �����, �浹�ϸ� length�� �������� ����
		//�浹�� �ش�ü�� ���������, �浹���������� �״�� ü�ο� ����
		

		
		

	}

}
