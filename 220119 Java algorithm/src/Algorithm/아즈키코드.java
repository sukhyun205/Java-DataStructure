package Algorithm;

import java.io.*;

public class 아즈키코드 {
    public static void main(String[] ar) throws IOException{
        // 선언문 - 변수의 자료형과 초기값을 선언할 때 사용하는 문장
        char x;
        
        // 입력문 - 입력형식에 맞게 프로그램을 구현할 때 사용하는 문장
        System.out.print("키보드를 통해 하나의 문자를 입력하세요 = ");
        x = (char)System.in.read();
        
        // 처리문 or 출력문 - 명령어나 제어문을 통해 프로그램의 흐름이나 순서를 제어하거나 출력
        System.out.println(); // 개행의 의미
        System.out.println(x + " = " + (int)x);
        System.out.printf("%c = %d\n", x, (int)x);
    }
}