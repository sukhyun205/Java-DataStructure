import java.util.Scanner;

class Poly {
	int arr[];
	
	Poly (){
		
	}
	
	Poly(String input_data){
		input_data = input_data.replace("x^", " ");
		input_data = input_data.replace("+", " ");
		
//		if(data.equals("x^")) {
//			data = " ";
//		}
//		if(data.equals("+")) {
//			data = " ";
//		}
		
		input_data = input_data.trim();

		System.out.println("data>> "+input_data);
		String temp[] = input_data.split(" ");
		int max = Integer.parseInt(temp[1]);
		System.out.println("max>> "+max);

		
		arr = new int[max+1]; //최고차항+1 갯수만큼 생성

		for(int i=0; i<temp.length-1; i+=2) {
			arr[Integer.parseInt(temp[i+1])] = Integer.parseInt(temp[i]);

		}
		System.out.print("arr>> ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void print() {
		boolean fP = true;
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i]!=0 && fP) {
				System.out.print(arr[i] + "x^" + i);
				fP = false;
			}
			else if(arr[i]>0) {
				System.out.print("+" + arr[i] + "x^" + i);
			}

		}System.out.println();
	}
	
	
	public Poly add(Poly a, Poly b) {
		Poly result = new Poly(); //더한 값 result 오브젝트 생성
		
		int max = a.arr.length-1; //max = 최고차항 계수
		
		System.out.println();
		System.out.println("max>>>> "+max);
		System.out.print("b.arr.length>>>>>>> "+b.arr.length);
		System.out.println();
		
		if (max < b.arr.length-1) { //b의 최고차항이 a의 최고차항보다 클때
			max = b.arr.length-1;
			result.arr = new int[max+1]; //Poly 클래스의 오브젝트인 result는 Poly의 생성자인 arr[]을 쓸수있다.
			
			for(int i=b.arr.length-1; i>=a.arr.length; i--) { //a보다 큰 b의 차수를 result배열에 입력
				result.arr[i] = b.arr[i];
			}
			
			for(int i=b.arr.length-2; i>=0; i--) { //나머지 계수를 더함
				result.arr[i] = a.arr[i] + b.arr[i];
			}
		}
		
		else if (max == b.arr.length-1) {			//a, b의 최고차항이 같을때
			result.arr = new int[max+1];
			
			for(int i=0; i<max+1; i++) { //나머지 계수를 더함
				result.arr[i] = a.arr[i] + b.arr[i];
			}			
		}
		
		else { //a가 b보다 고차항일때
			result.arr = new int[max+1];
			
			for(int i=a.arr.length-1; i>=b.arr.length; i--) {
				result.arr[i] = a.arr[i];
			}
			
			for(int i=a.arr.length-2; i>=0; i--) {
				result.arr[i] = a.arr[i] + b.arr[i];
			}
		}
		
		return result;
		
	}
	
	
}



public class PolyArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A(x) 다항식을 입력하시오>> ");
		String inputA = sc.nextLine();
		System.out.print("B(x) 다항식을 입력하시오>> ");
		String inputB = sc.nextLine();
		
		Poly a = new Poly(inputA);
		Poly b = new Poly(inputB);
		Poly result = a.add(a, b);

		
		System.out.print("A(x) = "); //4x^3+3x^2+5x^1 "x^1"이렇게 입력해야함
		a.print();
		System.out.print("B(x) = ");
		b.print();
		
		System.out.print("C(x) = ");
		result.print();
		
		sc.close();
		
		

	}

}
