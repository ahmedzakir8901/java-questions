import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] numbers={1,2,3,4,56,78};
		int max=numbers[0];
		for(int num : numbers){
		   if(num>max){
		      max=num;
		   } 
		}
		System.out.println("greatest number is: " +max );
	}
}
