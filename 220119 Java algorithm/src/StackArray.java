
//2019113394 �Ǽ���
//�ǽ����� 1 �迭�� Ȱ���� ���� ����

class ArrayStack{
	
	private int top;
	private Object arr[];
	
	ArrayStack(){
		top = -1; //�迭 ������ top -1�ʱ�ȭ
		arr = new Object[1]; //ó�� �迭���� arr.length=1, size=top+1=0 //top�� ���� ���ϸ� +1 size���� +1
	}
	
	public boolean isEmpty() {
		return (top == -1); //top�� -1�϶�(������ ������� �� true return)

	}
	
	public int size() {
		return top+1;
	}
	
	public void push(Object d) {
		if(arr.length==size()) {
			resize(arr.length*2);
		}
		arr[++top]=d;
	}
	
	public Object pop() {
		if(size()<=arr.length/4) {
			resize(arr.length/2);
		}
		return arr[top--];
	}
	
	public Object peek() {
		System.out.println("top�� ����Ű�� ������: "+arr[top]+" top = "+top);
		return arr[top];
	}
	
	public void print() {
		System.out.print("���� ��Ȳ>> ");
		for(int i=0; i<=top; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println();
	}
	
	
	public void resize(int newSize) {
		Object tmp[] = new Object[newSize];
		for(int i=0; i<size(); i++) {
			tmp[i]=arr[i];
		}
		arr = tmp;
	}
	
}

	

public class StackArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�ǽ����� 1 �迭�� Ȱ���� ���� ����");
		
		ArrayStack stack = new ArrayStack();
		
		stack.push(10);
		stack.print();
		stack.push(20);
		stack.print();
		stack.push(30);
		stack.print();
		stack.pop();
		stack.print();
		stack.peek();
		
	}
	

}