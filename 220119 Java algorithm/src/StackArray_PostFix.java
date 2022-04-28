
//2019113394 권석현
//실습과제 2 후위표기법 -> 중위표기법 변환
//실습과제 3 후위표기법 계산

import java.util.Arrays; //연산자 operator가 있는 배열을 List로 바꾸기 위해 Arrays클래스 호출

class ArrayStack_String{
	
	private int top;
	private String arr[];
	
	ArrayStack_String(){
		top = -1; 
		arr = new String[1]; 
	}
	
	public boolean isEmpty() {
		return (top == -1); 

	}
	
	public int size() {
		return top+1;
	}
	
	public void push(String d) {
		if(arr.length==size()) {
			resize(arr.length*2);
		}
		arr[++top]=d;
	}
	
	public String pop() {
		if(size()<=arr.length/4) {
			resize(arr.length/2);
		}
		return arr[top--];
	}
	
	public String peek() {
		return arr[top];

	}
	
	public void print() {
		System.out.print("스택>> ");
		for(int i=0; i<=top; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println();
	}
	
	
	public void resize(int newSize) {
		String tmp[] = new String[newSize];
		for(int i=0; i<size(); i++) {
			tmp[i]=arr[i];
		}
		arr = tmp;
	}
	
}


class ArrayStack_Int{
	
	private int top;
	private int arr[];
	
	ArrayStack_Int(){
		top = -1; 
		arr = new int[1]; 
	}
	
	public boolean isEmpty() {
		return (top == -1); 

	}
	
	public int size() {
		return top+1;
	}
	
	public void push(int d) {
		if(arr.length==size()) {
			resize(arr.length*2);
		}
		arr[++top]=d;
	}
	
	public int pop() {
		if(size()<=arr.length/4) {
			resize(arr.length/2);
		}
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];

	}
	
	public void print() {
		System.out.print("스택 현황>> ");
		for(int i=0; i<=top; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println();
	}
	
	
	public void resize(int newSize) {
		int tmp[] = new int[newSize];
		for(int i=0; i<size(); i++) {
			tmp[i]=arr[i];
		}
		arr = tmp;
	}
	
}

public class StackArray_PostFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		System.out.println("실습과제 2 후위표기법 -> 중위표기법 변환");
		System.out.println("결과: "+Infix_Postfix("A+B*(C+D-E)/(F+G)"));
		System.out.println();
		
		System.out.println("실습과제 3 후위표기법 계산");
		System.out.println("결과: "+getInfixResult("832+1-/"));
		
	}
	
    public static String Infix_Postfix(String input) {
    	
		ArrayStack_String stackString = new ArrayStack_String();
    	
        String result = "";

        String[] operator = {"(", ")", "+", "-", "*", "/"};
        
        for (char c : input.toCharArray()) { //입력받은 문자열을 한글자씩 나누어, c에 차례대로 넣어준다.
            if (Arrays.asList(operator).contains(c + "")) { //operator가 들어있는 list에 char c가 있다면 return true

                if (c == ')') {
                    while (!stackString.isEmpty() && stackString.peek().charAt(0) != '(') {
                        result += stackString.pop().charAt(0);
                    }
                    stackString.pop();
                    stackString.print(); //

                } else {

                    while (!stackString.isEmpty() && CompareOperation(c, stackString.peek().charAt(0))) {
                        result += stackString.pop();
                    }
                    stackString.push(c + "");
                    stackString.print(); //
                    
                }
            } else {
                result += c;
            }
        }

        while (!stackString.isEmpty()) {
            result += stackString.pop();
        }
        return result;
    }
    
    public static boolean CompareOperation(char operator1, char operator2) { //연산자 우선순위판단 메소드
        switch (operator1) {
            case '+':
                if (operator2 == '+' || operator2 == '-' || operator2 == '*' || operator2 == '/') {
                    return true;
                }
            case '-':
                if (operator2 == '-' || operator2 == '+' || operator2 == '*' || operator2 == '/') {
                    return true;
                }
            case '*':
                if (operator2 == '*' || operator2 == '/') {
                    return true;
                }
            case '/':
                if (operator2 == '*' || operator2 == '/') {
                    return true;
                }
        }
        return false;
    }
    
    public static int getInfixResult(String input) { //후위표기법 계산 메소드
        int result = 0;
        String[] operator = {"+", "-", "*", "/"};
        
		ArrayStack_Int stackInt = new ArrayStack_Int();

        for (char c : input.toCharArray()) {
            if (Arrays.asList(operator).contains(c + "")) {
                int second = stackInt.pop();
                int first = stackInt.pop();

                switch (c) {
                    case '+':
                    	stackInt.push(first + second);
                    	stackInt.print(); //
                        break;
                    case '-':
                    	stackInt.push(first - second);
                    	stackInt.print(); //
                        break;
                    case '*':
                    	stackInt.push(first * second);
                    	stackInt.print(); //
                        break;
                    case '/':
                    	stackInt.push(first / second);
                    	stackInt.print(); //
                        break;
                }
            } else {
            	stackInt.push(Integer.parseInt(c + ""));
            	stackInt.print(); //
            }
        }

        result = stackInt.pop();
        return result;
    }

}
