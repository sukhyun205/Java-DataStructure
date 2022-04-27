import java.util.Scanner;

class ArrayStack2{
	
	private int top;
	private Object arr[];
	
	ArrayStack2(){
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
		System.out.println("top이 가르키는 값 = "+arr[top]);
		return arr[top];

	}
	
	public void print() {
		System.out.print("출력>> ");
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


public class StackArray_pn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayStack2 as = new ArrayStack2();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("연산자 피연산자 입력하시오>> ");
			Object input = sc.nextLine();
			
			as.push(input);
			
			if(as.isEmpty()) {
				break;
			}
			

			as.pop();
			as.print();
			as.peek();
		}
		
		
		

	}

}
