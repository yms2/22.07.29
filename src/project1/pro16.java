package project1;

import java.util.Scanner;

public class pro16 {

	public static void main(String[] args) {

		//최대값을 구하는 것.
		int[] intArray = new int[5];
		int sum = 0;
		Scanner in = new Scanner(System.in);
		//5개의 정수 입력
		for(int i =0; i<intArray.length;i++) {
			System.out.println("정수를 입력하세요");
			intArray[i] = Integer.parseInt(in.nextLine());
		}
		//크기비교
		int max =0;
		for(int i =0; i<intArray.length;i++) {
			if(max<intArray[i]) {
				max = intArray[i];
			}
		}
		System.out.println("가장 큰수는:"+max);
		
	}

}
