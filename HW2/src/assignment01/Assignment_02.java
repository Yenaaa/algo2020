package assignment01; //백준 1874

import java.util.Scanner;
import java.util.*;

public class Assignment_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack st = new Stack(); // 1~n까지 숫자를 오름차순으로 놓을 스택
		int top = -1;
		
		ArrayList array = new ArrayList(); // + - 넣을 리스트
		int m = 0;
		
		int n = sc.nextInt();
		int[] arr = new int[n]; // n개의 숫자를 담을 공간
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt(); // n개의 수를 입력된 순서대로 넣어
		
		for(int i = 1; i <=n; i++){  
			//1. 스택에 숫자를 넣는다. 리스트에 +를 넣는다.
			st.push(i);
			array.add('+');
			//2. 스택이 비어있지 않으면서  && 스택의 맨 위의 값이 
			while(!st.isEmpty() && (int)st.peek() == arr[m] ) {
				m++; // 다음 숫자로 넘어가고
				st.pop(); //스택에서 해당 수를 빼고
				array.add('-'); // 리스트에 -를 넣는다.
			}
		}
		
		//모든 수가 빠져나와 스택이 비어있으면 리스트를 출력
		if (st.isEmpty()) {
				System.out.println(array);
		}else { //스택이 비어있지 않으면 "NO"
				System.out.println("NO");
		}

	}

}
