



class ArrayStack{
	
	private int top;
	private int size;
	private Object arr[];
	
	ArrayStack(int s){
		top = -1; //배열 생성시 top -1초기화
		this.size = s;
		arr = new Object[this.size];
	}
	
	public void push(Object d) {
		
		if(size == arr.length) {
			resize(arr.length*2);
		}
		
		arr[++top] = d;
		System.out.println("삽입된 데이터: "+d+" 현재top = "+top);

	}
	
	public Object pop() {
		System.out.println("삭제된 데이터: "+arr[top]);
		return arr[top--];
	}
	
	public Object peek() {
		System.out.println("현재 top이 가르키는 데이터: "+arr[top]+" 현재top = "+top);
		return arr[top];
	}
	
	public void print() {
		System.out.print("현재 ArrayStack>> ");
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
