package BasicPro;

public class Evennumberswithsum {

	public static void main(String[] args) {

				
		   int[] arr = {34,5,7,8,10,12,6,11};
		   System.out.println("Even numbers are");
		   for (int i=0; i<arr.length; i= i+2)   
		   System.out.println(arr[i]);

		   int [] arr1 = new int [8];    
		   int sum = 0;  
		   for (int i = 0; i<arr1.length; i++) 
		   sum = sum + arr[i];  
		   System.out.println("Sum of all the numbers in array: " + sum);

	
		}
		}

	
