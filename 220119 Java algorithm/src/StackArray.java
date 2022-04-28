
//2019113394 권석현
//실습과제 1 배열을 활용한 스택 구현

class ArrayStack{
	
	private int top;
	private Object arr[];
	
	ArrayStack(){
		top = -1; //배열 생성시 top -1초기화
		arr = new Object[1]; //처음 배열길이 arr.length=1, size=top+1=0 //top의 값이 변하면 +1 size값도 +1
	}
	
	public boolean isEmpty() {
		return (top == -1); //top이 -1일때(스택이 비어있을 때 true return)

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
		System.out.println("top이 가르키는 데이터: "+arr[top]+" top = "+top);
		return arr[top];
	}
	
	public void print() {
		System.out.print("스택 현황>> ");
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
		
		System.out.println("실습과제 1 배열을 활용한 스택 구현");
		
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