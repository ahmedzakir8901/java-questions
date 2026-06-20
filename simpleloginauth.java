//Login System
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String username="admin";
		String password="1212";
		
		
		System.out.println("enter username");
	    String inputusername= sc.nextLine();
		
	    System.out.println("enter password");
	    String inputpass= sc.nextLine();
	    
	    if(inputusername.equals(username) && inputpass.equals(password)){
	        System.out.println("login successful");
	    }else{
	        System.out.println("login declined");
	    }
	}
}
