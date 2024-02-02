package ASSIGNMENT_9;

import java.util.Scanner;

public class NUMBER_NAMES {
	

		public static void main(String[] args) {
			
			System.out.println("Enter the number");
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			int t = n;
			String result="";
			while(n!=0)
			{
				int rem = n%10;
				n=n/10;
				
				switch(rem)
				{
					case 0: 
						result="Zero "+result;
						break;
					case 1:
						result="One "+result;
						break;
					case 2:
						result="Two "+result;;
						break;
					case 3:
						result="Three "+result;;
						break;
					case 4: 
						result="Four"+result;;
						break;
					case 5:
						result="Five "+result;;
						break;
					case 6:
						result= "Six " + result;
						break;
					case 7:
						result="Seven "+result;
						break;
					case 8:
						result="Eight "+result;
						break;
					case 9:
						result="Nine "+result;
						break;
						
				}
				
			
			}
			System.out.println(result);
			
			
			
		}

	}
