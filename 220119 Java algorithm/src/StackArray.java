



class ArrayStack{
	
	private int top;
	private int size;
	private Object arr[];
	
	ArrayStack(int s){
		top = -1; //�迭 ������ top -1�ʱ�ȭ
		this.size = s;
		arr = new Object[this.size];
	}
	
	public void push(Object d) {
		
		if(size == arr.length) {
			resize(arr.length*2);
		}
		
		arr[++top] = d;
		System.out.println("���Ե� ������: "+d+" ����top = "+top);

	}
	
	public Object pop() {
		System.out.println("������ ������: "+arr[top]);
		return arr[top--];
	}
	
	public Object peek() {
		System.out.println("���� top�� ����Ű�� ������: "+arr[top]+" ����top = "+top);
		return arr[top];
	}
	
	public void print() {
		System.out.print("���� ArrayStack>> ");
		for(int i=0; i<=top; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println();
	}
	
	
	
	
	
	
	
	public void resize(int newSize) {
		Object tmp[] = new Object[newSize];
		for(int i=0; i<size; i++) {
			tmp[i]=arr[i];
		}
		arr = tmp;
	}
	
}


public class StackArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size=2;
		
		ArrayStack as = new ArrayStack(size);
		
		as.push(10);
		as.push(20);
		as.push(30);
		
		as.pop();
		as.print();
		as.peek();
		
		
		

	}

}
