import java.util.Scanner;

class Poly {
	int arr[];
	
	Poly (){
		
	}
	
	Poly(String data){
		data = data.replace("x^", " ");
		data = data.replace("+", " ");
		
//		if(data.equals("x^")) {
//			data = " ";
//		}
//		if(data.equals("+")) {
//			data = " ";
//		}
		data = data.trim();
		System.out.println("data>> "+data);
		String temp[] = data.split(" ");
		int max = Integer.parseInt(temp[1]);
		System.out.println("max>> "+max);
		
		arr = new int[max+1]; //최고차항+1 갯수만큼 생성
		
		for(int i=0; i<temp.length-1; i+=2) {
			arr[Integer.parseInt(temp[i+1])] = Integer.parseInt(temp[i]);
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
		}
	}
	
	
}



public class PolyArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String polyA = input.split(" ")[0];
		
		Poly a = new Poly(polyA);
		
		System.out.print("A(x) = ");
		a.print();
		
		sc.close();
		
		

	}

}
