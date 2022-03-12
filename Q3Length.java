/*
 Accept a few strings from command line
		Show the length of each string and show each string in uppercase .
 */
package q1wrapper;

public class Q3Length {

	public static void main(String[] args) {
		String str="";
		int i;
		for(i=0;i<args.length;i++)
		{
			str=str+args[i].toUpperCase();	
		}
		System.out.println(" "+str);
		int len=str.length();
		System.out.println(len);
	}

}
