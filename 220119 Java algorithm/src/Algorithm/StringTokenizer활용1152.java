package Algorithm;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerÈ°¿ë1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();

		StringTokenizer st = new StringTokenizer(S," ");
		
		while(st.hasMoreTokens()) {
			String tk_next = st.nextToken();
			System.out.print(tk_next);
		}

		System.out.println(st.countTokens()); 
	}
}
