package project1;

import java.util.Arrays;

public class pro20 {

	public static void main(String[] args) {

		float[] floatArray = new float[100];
		
		//1~100까지 배열을 초기화 값은 :1~100
		
		//초기화
		for(int i =0;i<floatArray.length;i++) {
			floatArray[i] =(float)(i+1);
		}
		System.out.println(Arrays.toString(floatArray));
		
		//합
		float sum = 0.0f;
		
		for(int i = 0; i<floatArray.length;i++) {
			sum = sum + floatArray[i];
		}
		System.out.println(sum);
		
		//floatArray에 모든 요소에 0.5를 더하시오
		for(int i = 0; i<floatArray.length;i++) {
			floatArray[i] = floatArray[i] + 0.5f;
		}
		System.out.println(Arrays.toString(floatArray));
		for(int i = 0; i<floatArray.length;i++) {
			floatArray[i] = floatArray[i] - 0.5f;
		}
		System.out.println(Arrays.toString(floatArray));
		
		//floatArray 모든요소에 10을 곱해라
		for(int i = 0; i<floatArray.length;i++) {
			floatArray[i] = floatArray[i] *10.0f;
		}
		System.out.println(Arrays.toString(floatArray));
		for(int i = 0; i<floatArray.length;i++) {
			floatArray[i] = floatArray[i] /10.0f;
		}
		System.out.println(Arrays.toString(floatArray));
		sum = 0.0f;
		for(int i = 0; i<floatArray.length;i++) {
			sum=sum +floatArray[i];
		}
		System.out.println("합은:"+sum
				);
	}

}
