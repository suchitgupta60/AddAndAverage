import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class AddAndAverage {

	public static void main(String args[])
	{
		Scanner scan = null;
		ArrayList<Integer> numbers;
		numbers = new ArrayList<Integer>();
		try{
			scan = new Scanner (new File ("FileA.txt"));
		}
		catch(IOException e){
			System.out.println(e.getMessage());
			System.exit(0);
		}
		while(scan.hasNextInt()){
			int nums = scan.nextInt();
			numbers.add(nums);
			//System.out.println(nums);
		}
		int sum = 0;
		int average = 0;
		for (int i = 1; i <= numbers.size(); i++){
			sum += i;
			average = sum / numbers.size();

		}

		System.out.println("sum is " + sum);
		System.out.println("average is " + average);
		scan.close();

	}


}
