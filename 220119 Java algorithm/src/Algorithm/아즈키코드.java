package Algorithm;

import java.io.*;

public class ����Ű�ڵ� {
    public static void main(String[] ar) throws IOException{
        // ���� - ������ �ڷ����� �ʱⰪ�� ������ �� ����ϴ� ����
        char x;
        
        // �Է¹� - �Է����Ŀ� �°� ���α׷��� ������ �� ����ϴ� ����
        System.out.print("Ű���带 ���� �ϳ��� ���ڸ� �Է��ϼ��� = ");
        x = (char)System.in.read();
        
        // ó���� or ��¹� - ��ɾ ����� ���� ���α׷��� �帧�̳� ������ �����ϰų� ���
        System.out.println(); // ������ �ǹ�
        System.out.println(x + " = " + (int)x);
        System.out.printf("%c = %d\n", x, (int)x);
    }
}