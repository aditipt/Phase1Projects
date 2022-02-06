package pack1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Program Started");
		Scanner sc1 = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int value = 0;
		
		do {
			System.out.println("-------Arithmatic Calculator-------");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplcation");
			System.out.println("4. Division");
			System.out.println("Enter the operation : ");
			value = sc1.nextInt();
			
			
		    switch(value){
			
		     case 1 : System.out.println("------Addition-----");
		              System.out.println("Enter 1st no. :" );
				      num1 = sc1.nextInt();
				      System.out.println("Enter 2nd no. :");
				      num2 = sc1.nextInt();
		              num3 = num1 + num2;
		              System.out.println(num1 + " + " + num2 + " = " + num3);
		              break;
		  
		     case 2 : System.out.println("-----Substraction-----");
		              System.out.println("Enter 1st no. :" );
				      num1 = sc1.nextInt();
				      System.out.println("Enter 2nd no. :");
				      num2 = sc1.nextInt();
                      num3 = num1 - num2;
                      System.out.println(num1 + " - " + num2 + " = " + num3);
                      break; 
                  
		     case 3 : System.out.println("-----Multiplication-----");
		              System.out.println("Enter 1st no. :" );
				      num1 = sc1.nextInt();
				      System.out.println("Enter 2nd no. :");
				      num2 = sc1.nextInt();
                      num3 = num1 * num2;
                      System.out.println(num1 + " * " + num2 + " = " + num3);
                      break;
			     
		     case 4 : System.out.println("-----Division-----");
		              System.out.println("Enter 1st no. :" );
				      num1 = sc1.nextInt();
				      System.out.println("Enter 2nd no. :");
				      num2 = sc1.nextInt();
                      num3 = num1 / num2;
                      System.out.println(num1 + " / " + num2 + " = " + num3);
                      break;
                
             default : System.out.println("Please Enter Correct operation !!!!! ");
			           break;
            
		 }
		   
	  }while(value!=0);
		
		 sc1.close();
	     System.out.println("Program Ended");
	

	}
	

}
