import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    //swap two numbers easiest method
	    int a = 10;
	    int b= 20;
	    //now swap part
	    int temp=a;
	    a=b;
	    b=temp;
	    System.out.println("the a is "+ a +" and B is " + b);
	}
    
}
