package termpro01;

import java.util.Scanner;

import javax.print.attribute.standard.NumberUpSupported;

public class termpro01 {
	
	private static int getMinvalue(int[] numbers) {
		int min;
		
		min = numbers[0];
		
		for(int i = 1; i <numbers.length; i++) {
			min = numbers[i] > min ? numbers[i] : min;
		}
		return min;
	}
	
	private static int getMaxvalue(int[] numbers) {
		int max;
		int a, b;
		
		max = numbers[0];
		
		for(int i = 1; i <numbers.length; i++) {
			max = numbers[i] < max ? numbers[i] : max;
		}
		return max;
	}
	
	private static int getHapvalue(int[] numbers) {
		int hap;
		
		hap = numbers[0];
		
		for(int i = 1; i <numbers.length; i++) {
			hap = numbers[i] + hap;
		}
		return hap;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//���� ���� N, a, b, ���尪 ���� min max hap
		int N, a, b;
		int min, max, hap;
		
		//N �Է¹ޱ�
		N = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		// N���� ���� ���� �Է¹ޱ�
		int [] numbers = new int[N];
		
		System.out.println( "1����"+  N +"������ ���ڸ� �������� �Է��ϼ���.");
		
		for (int i=0; i< N; i++) {
			numbers[i] = sc.nextInt();
		}
		
		//a-b ���� ����
		
		//����
		//1. �ּҰ�
		min = getMinvalue(numbers);
				
		//2. �ִ밪
		max = getMaxvalue(numbers);
		
		//3. �հ�
		hap = getHapvalue(numbers);
		
		
		//���
		System.out.println(min+ " " + max+ " " + hap);
		
		sc.close();
	}

}
