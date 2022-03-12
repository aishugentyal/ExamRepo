package q1wrapper;

public class Q4AdditionCla {
	public static void main(String [] args) {
		int i,sum=0;
		for(i=0;i<args.length;i++) {
			System.out.println(args[i]);
			sum=sum+Integer.parseInt(args[i]);
		}
		
		System.out.println("Sum of Nmber's is: "+sum);
	}
}
