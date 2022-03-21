import java.util.Scanner;
import java.util.NoSuchElementException;


class ArrList {
	
	private Object arrlist[]; //Object≈∏¿‘?
	private int size;
	
	public ArrList() {
		arrlist = new Object[10];
		size = 0;
		
		for (int i=0; i<10; i++) {
			arrlist[i]=i;
			System.out.print(arrlist[i] + " ");
		}
		

	}
	
	//≈Ωªˆ
	public Object peek(int k) {
		if (size == 0) {
			throw new NoSuchElementException();
		} else {
			return arrlist[k];
		}
	}
	
	//ª¿‘
	public void insertLast(Object newItem) {
		if (size == arrlist.length) {
			resize(arrlist.length * 2);
		arrlist[size++] = newItem;
		
		}
	}
	
	
    //resize ∏ﬁº“µÂ
	private void resize(int newSize) {
		// TODO Auto-generated method stub
		Object[] t = new Object[newSize];
		for (int i=0; i<size; i++)
			t[i] = arrlist[i];
		arrlist = t;
		
	}
	
	
	
}



public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrList arr = new ArrList();
		
		arr.insertLast(100);
		
		sc.close();

	}

}
