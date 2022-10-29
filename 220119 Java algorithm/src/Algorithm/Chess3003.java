package Algorithm;
import java.util.Scanner;
class Chess{
	int king = 1;
	int queen = 1;
	int Rook = 2;
	int bishop = 2;
	int knight = 2;
	int pawn = 8;
	
	Chess(	int king,
	int queen,
	int Rook,
	int bishop,
	int knight,
	int pawn){
		this.king = this.king - king;
		this.queen = this.queen - queen;
		this.Rook-=Rook;
		this.bishop-=bishop;
		this.knight-=knight;
		this.pawn-=pawn;
		int[] arr = {this.king,this.queen,this.Rook,this.bishop,this.knight,this.pawn};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
//	public void SetCorrectly() {
//		System.out.print(this.king+" ");
//		System.out.print(this.queen+" ");
//		System.out.print(this.Rook+" ");
//		System.out.print(this.bishop+" ");
//		System.out.print(this.knight+" ");
//		System.out.println(this.pawn);
//	}
	
}

public class Chess3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int king=sc.nextInt();
		int queen=sc.nextInt();
		int Rook=sc.nextInt();
		int bishop=sc.nextInt();
		int knight=sc.nextInt();
		int pawn=sc.nextInt();
		
		Chess c = new Chess(king,queen,Rook,bishop,knight,pawn);
//		c.SetCorrectly();

		sc.close();

	}

}
