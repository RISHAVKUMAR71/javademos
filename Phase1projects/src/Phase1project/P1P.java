package Phase1project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1P {

	public static void main(String[] args) {
		/* System.out.println("Hello World!"); */
		System.out.println("\n**************************************************************\n");
		System.out.println("\tWelcome to virtual key repository \n");
		// System.out.println("\t");
		System.out.println("\t                         Developed by- Rishav Kumar \n");
		System.out.println("****************************************************************");

		optionsSelection1();

	}

	private static void optionsSelection1() {
	        String[] arr1 = {"1. Retrieving the file names in an ascending order",
	                "2. Business-level operations:",
	                "3. Close the application"
	        };
	        int[] arr2 = {1,2,3};
	        int  slen = arr2.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr1[i]);
	            // display the all the Strings mentioned in the String array
	        }
	        ArrayList<Integer> arrlist = new ArrayList<Integer>();
	        ArrayList<Integer> expenses = new ArrayList<Integer>();

	
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc = new Scanner(System.in);
	        int  options =  sc.nextInt();
	        for(int j=1;j<=slen;j++){
	            if(options==j){
	                switch (options){
	                    case 1:
	                        System.out.println("Retrieving the file names in an ascending order \n");
	                        System.out.println(expenses+"\n");
	                        optionsSelection1();
	                        break;
	                    case 2:
	                         String[] arr3 = {
	             	                "1 Option to add a user specified file to the application",
	             	                "2 Option to delete a user specified file from the application",
	             	                "3 Option to search a user specified file from the application",
	             	                "4 Navigation option to close the current execution context and return to the main context"
	             	                
	             	        };
	                    	 int[] arr4 = {1,2,3,4};
	             	        int  slen1 = arr4.length;
	             	        for(int i=0; i<slen1;i++){
	             	            System.out.println(arr3[i]);
	             	            // display the all the Strings mentioned in the String array
	             	        }
	                        System.out.println("Enter the value to perform operation: \n");
	                        Scanner sc2 = new Scanner(System.in);
	            	        int  options2 =  sc2.nextInt();
	            	        for(int k=1;k<=slen1;k++){
	            	            if(options2==k){
	            	                switch (options2){
	            	                    case 1:
	            	                        System.out.println("Option to add a user specified file to the application \n");
	            	                        
	            	           	          break;
	            	                    case 2:
	            	                    	System.out.println("Option to delete a user specified file from the application \n");
	            	                    	break;
	            	                    case 3:
	            	                    	System.out.println("Option to search a user specified file from the application \n");
	            	                    	break;
	            	                    case 4:
	            	                    	System.out.println("Navigation option to close the current execution context and return to the main context \n");
	            	                    	break;
	            	                    default:
	       	                             System.out.println("You have made an invalid choice!");
	       	                         break;
	             	        }
	            	            }
	            	        }
	                    	
	                        optionsSelection1();
	                    		                    	
	            	                break;	                    
	                    case 3:
	                        closeApp();                    	
	                         break;
	                         
	                    default:
	                             System.out.println("You have made an invalid choice!");
	                         break;        
	
	                }
	            	        }
	             	        }
	}

	private static void closeApp() {
		{
	        System.out.println("Close the application... \nThank you!");}			
	}
}
