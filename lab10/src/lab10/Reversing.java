package lab10;
/**
 * 
 * @author Kevin
 *
 */
//*********************************************************************
//ArrayReverse.java
//
//
//Program that prompts the user for an integer, enter that many values,
//stores values in an array, prints the reverse order of array.
//*********************************************************************
import java.util.Scanner;

public class Reversing {

	public static void main(String[] args) {
		int size;
		int reverse;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of your array: ");
		size = scan.nextInt();
		
		int[] newArray = new int[size];
		//input array of ints
		for(int i = 0; i< newArray.length; i++){
			System.out.print("Enter number " + i+": ");
			newArray[i] = scan.nextInt();
		}
		//print original array
		printArray(newArray);

		//reverse elements in array
		for(int j = 0; j<(newArray.length/2); j++){
			reverse = newArray[j];
			newArray[j] = newArray[newArray.length-1-j];
			newArray[newArray.length-1-j] = reverse;
		}
		//print reversed array
		printArray(newArray);
		}

		//printing an int array
		public static void printArray(int[] a){
			for(int i =0; i<a.length;i++)
				System.out.print(a[i]+"\t");
				System.out.println();
		}
} 