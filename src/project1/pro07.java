package project1;

public class pro07 {

	public static void main(String[] args) {
		
		int i0, i1, i2, i3;
		i0 = 4;
		i1 = 55;
		i2 = 32;
		i3 = 28;


		int sum = i0 +i1+ i2+ i3;
		
		int[] i = new int [4];
		i[0]= 4;
		i[1]=55;
		i[2]=32;
		i[3]=28;
		
		int n;
		sum =0;
		for(n=0;n<10;n++) {
			sum = sum+i[n];
		}
		System.out.println(sum);
		int[] a = {4,55,32,28};
		sum = 0;
		for(n=0; n<5;n++) {
			sum = sum+a[n];
		}
		System.out.println(sum);
	}

}
