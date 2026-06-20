import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter year to check");
		int year=sc.nextInt();
		
	
		//else if 
		if(year % 400== 0 ){
		    System.out.println("leap year");
		}else if(year % 100 == 0 ){
		    System.out.println("Not leap year");
		}else if(year % 4 ==0 )
		    System.out.println("leap year");
		    else{
		    System.out.println(" Not leap year");    
		    }
	}
}
