package project1;

public class pro11 {

	public static void main(String[] args) {

		int[] arr1 = new int[3];
		for(int i = 0; i<3; i++) {
			System.out.println(i+"번째 값은;"+arr1[i]);
		}
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		System.out.println();
		for(int i = 0;i<3;i++) {
			System.out.println(i+"번째 값은:"+arr1[i]);
		}
		System.out.println();
		double[] arr2 = new double[3];
		for(int i = 0;i<3;i++) {
			System.out.println("arr2의"+i+"번째 값은:"+arr2[i]);
		}
		System.out.println();
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3;  i++) {
			System.out.println("arr2의" +i+ "번째 값은:"+arr2[i]);
		}
		System.out.println();
		String[] arr3 = new String[3];
		for(int i = 0;i<3;i++) {
			System.out.println("arr3의"+i+"번쨰 값은:"+arr3[i]);
		}
		arr3[0] ="1월";
		arr3[1] ="2월";
		arr3[2]= "3월";
		System.out.println();
		for(int i = 0; i<3; i++) {
			System.out.println("arr3의"+i+"번째 값은:"+arr3[i]);
		}
	}

}
