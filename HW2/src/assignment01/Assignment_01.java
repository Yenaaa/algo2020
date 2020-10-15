package assignment01; //���� 9012 ��ȣ

import java.util.Scanner;

public class Assignment_01 {
	public static boolean isValid(String pp) {
		char[] stack = new char[1024];
		int top = -1;

		for(int i = 0;i<pp.length();i++) {
			char ch = pp.charAt(i);
			
			if(ch == '(' ) {
				stack[++top] = ch;
			}

			else if(ch == ')') {	
				if(top == -1 || stack[top] != '(') return false;
				top--;
			}
		}
		return top == -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // �׽�Ʈ ������ ����
		sc.nextLine();
		
		for(int i = 0; i < T; i++) {
			String pp = sc.nextLine();
			
			if(isValid(pp)) System.out.println("YES");
			else System.out.println("NO"); //������ ���͸� ����� ����������� ���ɴϴ�.
		}
		sc.close(); 
	}
}