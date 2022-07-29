package project1;

public class pro09 {

	public static void main(String[] args) {
		
		int[] score;
		
		score = new int[] {83,90,86};
		int sum1 = 0;
		for(int i =0;i<3;i++) {
			sum1 = sum1+score[i];
		}
		System.out.println("종합:"+sum1);
		
		score  =new int[] {80,90,60};
		int sum2 = 0;
		//합을 계산
		for(int i = 0;i<3;i++) {
		sum2 = sum2 +score[i];
		}
		System.out.println("총합 :"+sum2);
		
		//sum1평균 sum2평균을 구하시오

		double avg1 = (double)sum1/3;
		System.out.println("sum1의 평균:"+(double)(sum1/3));
		double avg2 = (double)sum2/3;
		System.out.println("sum2의 평균:"+avg2);
		
	}

}
