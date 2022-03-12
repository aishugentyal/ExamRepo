/*Accept one command line argument that is an option 1  or 2 or 3
	If the option is 1  show  table of 2 upto 100
	If the option is 2 show a poem
	If the option is 3 show a message to the user
	If the option is not given or it is other than 1,2,3---- show incorrect option
*/
package q1wrapper;

public class Q5Switchcase {
		public static void main(String[] args) {
			int choice=Integer.parseInt(args[0]);
			switch(choice) {
			case 1:
				int j;
				System.out.println("Multiplication of 2 is :");
				for(j=1;j<=100;j++) {
					
					System.out.print((2*j)+" ");
				}
				break;
			case 2:
				System.out.println("John John Yes papa eating sugar no papa telling lies no papa.....");
				break;
			case 3:
				System.out.println("Hello Java");
				break;
			default:System.out.println("Incorrect choice, Please choose options between 1 to 3.");
				break;
			}
		}
}
