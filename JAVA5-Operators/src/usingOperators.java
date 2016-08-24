/*
 * This program is part of my learning Java series
 * This one looks at operators
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/08/java-5-manipulating-variables-through.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Aug 2016
 */

public class usingOperators {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//STRING HANDLING
		System.out.println("STRING HANDLING");
		
		String str1 = "Hello ";
		String str2 = "World";
		String printStr = "just an empty space";
		
		//Take a look at print_str now
		System.out.println(printStr);
		
		//ADD together str1 and str2
		printStr = str1 + str2;
		
		//Take a look at print_str now
		System.out.println(printStr);	
		
		//INTEGER HANDLING
		System.out.println("INT HANDLING");		
		
		//Declare some INT numbers
		int intNum1 = 8;
		int intNum2 = 2;
		int intNum3 = 3;
		int intAnswer;
		
		//ADDITION
		intAnswer = intNum1 + intNum2;
		System.out.println("intNum1 + intNum2 = " + intAnswer);
		
		//Subtraction
		intAnswer = intNum1 - intNum3;
		System.out.println("intNum1 - intNum3 = " + intAnswer);
		
		//Multiplication
		intAnswer = intNum2 * intNum3;
		System.out.println("intNum2 * intNum3 = " + intAnswer);
		
		//Division 1
		intAnswer = intNum1 / intNum2;
		System.out.println("intNum1 / intNum2 = " + intAnswer);
		
		//Division 2
		intAnswer = intNum1 / intNum3;
		System.out.println("intNum1 / intNum3 = " + intAnswer);	
		
		//Remainder
		intAnswer = intNum1 % intNum3;
		System.out.println("intNum1 % intNum3 = " + intAnswer);	
		
		//DOUBLE HANDLING
		System.out.println("DOUBLE HANDLING");		
		
		//Declare some FLOAT numbers
		double doubleNum1 = 8.2;
		double doubleNum2 = 2.3;
		double doubleNum3 = 3;
		double doubleAnswer;
		
		//ADDITION
		doubleAnswer = doubleNum1 + doubleNum2;
		System.out.println("doubleNum1 + doubleNum2 = " + doubleAnswer);
		
		//Subtraction
		doubleAnswer = doubleNum1 - doubleNum3;
		System.out.println("doubleNum1 - doubleNum3 = " + doubleAnswer);
		
		//Multiplication
		doubleAnswer = doubleNum2 * intNum3;
		System.out.println("doubleNum2 * doubleNum3 = " + doubleAnswer);
		
		//Division 1
		doubleAnswer = doubleNum1 / doubleNum2;
		System.out.println("doubleNum1 / doubleNum2 = " + doubleAnswer);
		
		//Division 2
		doubleAnswer = doubleNum1 / doubleNum3;
		System.out.println("doubleNum1 / doubleNum3 = " + doubleAnswer);	

		//Mixed data
		System.out.println("MIXED DATA");	
		intAnswer = intNum1 / (int)doubleNum2;
		System.out.println("intNum1 / (int)doubleNum1 = " + intAnswer);
		
		doubleAnswer = (double) intNum1 / doubleNum2;
		System.out.println("(double) intNum1 / doubleNum1 = " + doubleAnswer);	
		
		//Processing rules.
		System.out.println("PROCESSING RULES");	
		intAnswer = 7 - 2 * 3;;
		System.out.println("7 - 2 * 3; = " + intAnswer);

		intAnswer = (7 - 2) * 3;;
		System.out.println("(7 - 2) * 3; = " + intAnswer);		
		
		//Assignment
		System.out.println("ASSIGNMENT OPERATOR");
		int counter=1;
		System.out.println("Counter starts at = " + counter);
		
		counter +=3;
		System.out.println("counter +=3 = " + counter);
		
		counter -=2;
		System.out.println("counter -=2 = " + counter);
		
		counter++;
		System.out.println("counter++ = " + counter);
		
		counter--;
		System.out.println("counter-- = " + counter);
		
				
	}
}
