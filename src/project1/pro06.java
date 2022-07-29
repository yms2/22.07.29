package project1;

public class pro06 {

	public static void main(String[] args) {

		int i;
		int sum = 0;
		i=0;
		for(;;) {
			sum = sum +i;
			i++;
			if(i>=1_000_000) {
				break;
			}
		}
		System.out.println("0~1,000,000까지의 합은:" +sum);
		
		//while do~while
		
		i = 0;
		sum = 0;
		
		while(true) {
			sum = sum +i;
			i++;
			if(i>=1_000_000) {
				break;
			}
		}
		System.out.println("0~1,000,000까지의 합은:" +sum);
	
	i=0;
	sum=0;
	do {
		sum = sum +i;
		i++;
		if(i>=1_000_000) {
			break;
		}
	}while(i<=1_000_000);
	System.out.println("0~1,000,000까지의 합은:" +sum);
	
		
	}

}
