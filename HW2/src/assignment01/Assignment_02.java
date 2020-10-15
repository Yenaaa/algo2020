package assignment01; //���� 1874

import java.util.Scanner;
import java.util.*;

public class Assignment_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack st = new Stack(); // 1~n���� ���ڸ� ������������ ���� ����
		int top = -1;
		
		ArrayList array = new ArrayList(); // + - ���� ����Ʈ
		int m = 0;
		
		int n = sc.nextInt();
		int[] arr = new int[n]; // n���� ���ڸ� ���� ����
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt(); // n���� ���� �Էµ� ������� �־�
		
		for(int i = 1; i <=n; i++){  
			//1. ���ÿ� ���ڸ� �ִ´�. ����Ʈ�� +�� �ִ´�.
			st.push(i);
			array.add('+');
			//2. ������ ������� �����鼭  && ������ �� ���� ���� 
			while(!st.isEmpty() && (int)st.peek() == arr[m] ) {
				m++; // ���� ���ڷ� �Ѿ��
				st.pop(); //���ÿ��� �ش� ���� ����
				array.add('-'); // ����Ʈ�� -�� �ִ´�.
			}
		}
		
		//��� ���� �������� ������ ��������� ����Ʈ�� ���
		if (st.isEmpty()) {
				System.out.println(array);
		}else { //������ ������� ������ "NO"
				System.out.println("NO");
		}

	}

}
