import java.util.Scanner;

public class CodeStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


	}

}

/* 1008 BufferedReader, double type
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println((double)a/b); //float는 4byte, double 타입은 8byte까지 표현가능하다.
		
	}
}

/* Used BufferedWriter
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("Hello World!");
		bw.flush();
		bw.close();
	}

}
*/

/* 10171
System.out.println("\\     /\\");
System.out.println(" )   ( ')");
System.out.println("(   /  )");
System.out.println(" \\(__)|");
*/
/* 1000
Scanner sc = new Scanner(System.in);

String A = sc.next();
String B = sc.nextLine(); //공백을 포함하는 문자열을 쓸때는 nextLine();을 사용		
System.out.println(A);
System.out.println(B);

sc.close();
*/