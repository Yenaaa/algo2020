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
		
		//변수 생성 N, a, b, 저장값 생성 min max hap
		int N, a, b;
		int min, max, hap;
		
		//N 입력받기
		N = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		// N개의 랜덤 숫자 입력받기
		int [] numbers = new int[N];
		
		System.out.println( "1에서"+  N +"까지의 숫자를 랜덤으로 입력하세요.");
		
		for (int i=0; i< N; i++) {
			numbers[i] = sc.nextInt();
		}
		
		//a-b 구간 설정
		
		//연산
		//1. 최소값
		min = getMinvalue(numbers);
				
		//2. 최대값
		max = getMaxvalue(numbers);
		
		//3. 합계
		hap = getHapvalue(numbers);
		
		
		//출력
		System.out.println(min+ " " + max+ " " + hap);
		
		sc.close();
	}

}
