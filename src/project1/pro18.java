package project1;

public class pro18 {

	public static void main(String[] args) {
		
		int[] student1 = new int[3];
		int[] student2 = new int[3];
		student1[0] = 90;//국어
		student1[1] = 80;//수학
		student1[2] = 70;//영어
		
		student2[0] = 90;//국어
		student2[1] = 80;//수학
		student2[2] = 60;//영어
		
		int grade1 = 0;
		for(int i =0;i<student1.length;i++) {
			grade1 = grade1 + student1[i];
		}
		int grade2=0;
		for(int i=0; i<student2.length;i++) {
			grade2 = grade2 +student2[i];
		}
		System.out.println("student1의 평균:"+(grade1/student1.length));
		System.out.println("student2의 평균:"+(grade2/student2.length));
		
		//student1의 영어점수를 출력하세요
		
		System.out.println("영어점수:"+student1[2]);
		//student2의 국어점수를 출력하세요
		System.out.println("국어점수:"+student2[1]);
		
		//국어점수의 평균
		System.out.println("국어점수평균:"+((student1[0]+student2[0])/2));
		//영어점수의 평균
		System.out.println("영어점수평균:"+((student1[2]+student2[2])/2));

		//수학점수의 평균
		System.out.println("수학점수평균:"+((student1[1]+student2[1])/2));
		
	}

}
