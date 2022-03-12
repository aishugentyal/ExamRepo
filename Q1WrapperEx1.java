/*
 1.	 Write a class WrapperExample
a. Write a main method  ----  accept a new password from user
						     pass that password to a verify(pwd)  , this method returns a boolean
							If password is valid then returned value is true  , else false
						     check if password is valid , if yes then say congratulations your password is set
							Else ask the user to reenter ---Loop for 5 times in case of invalid pwd

b. Write a method     boolean  verify(String p )  ( use charAt, length API of String class  , use Character.isDigit, isLetter,isUpperCase,isLowerCase,……..   )
					Return true only if password satisfies the following condition , else return false
					1. The password length must be between 8 and 20
					2. The password must begin with a letter 
					3. The password must have at least one capital character
					4. The password must have at least one digit 
					5. The password must have at least one small character
					6. The password must have at least one special char ====>>>       _   -  #  $

 */

package q1wrapper;

import java.util.Scanner;

public class Q1WrapperEx1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean isValid;
		int count=0;
		System.out.println("Enter a password having length between 8-20,\nmust begin with a letter,\nhave at least one capital character,\none digit,\none small character\nand one special char( _ - # $)");
		do {
			System.out.println("\n\nPassword Attempt "+(count+1)+": ");
			String str=sc.next();
			isValid=verify(str);
			if(isValid==true) {
				System.out.println("Congratulations your password is set !!!");
			}
			else {
				System.out.println("*********Please enter valid password*********");
				count++;
			}
		}while(count!=5 && isValid==false);
		if(count==5) {
			System.out.println("You have crossed maximum attempt limit. Try again in 2022");
		}

	}
	public static boolean verify(String pwd){
		int i;
		boolean isLetter=false;
		boolean isCapital=false;
		boolean isSmall=false;
		boolean isDigit=false;
		boolean isSymbol=false;
		if(pwd.length()<8 || pwd.length()>20) {
			return false;
		}
		if(!Character.isLetter(pwd.charAt(0))) {
			return false;
		}
		for(i=0;i<pwd.length();i++) {
			if(Character.isDigit(pwd.charAt(i)))
				isDigit=true;
			if(Character.isUpperCase(pwd.charAt(i)))
				isCapital=true;
			if(Character.isLowerCase(pwd.charAt(i)))
				isSmall=true;
			if(pwd.charAt(i)=='-'||pwd.charAt(i)=='_'||pwd.charAt(i)=='$'||pwd.charAt(i)=='#')
				isSymbol=true;
			}
		if(isDigit==false||isCapital==false||isSmall==false||isSymbol==false)
			return false;
		
		return true;
	}

}
