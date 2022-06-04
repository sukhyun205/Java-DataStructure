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
	
	public int hash(Object random) { //hash함수
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
			int hashed = C.hash(n); //h값의 최대값은 테이블 크기 13보다 작다!! 오케이!!!
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
		
		//hashed값 꺼내고, d해시함수 하나 더 만들고, length도 달아서 비교하는 메소드 만들고, 충돌하면 length가 적은곳에 저장
		//충돌시 해당체인 데이터출력, 충돌하지않으면 그대로 체인에 저장
		

		
		

	}

}
