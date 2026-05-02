import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//take the input from the user until user press "x or X";
	int ans=0;
	while(true){
	    //input operators
	    System.out.println("enter the operator");
	    char op=sc.next().trim().charAt(0);
	    if(op =='+' || op =='-' || op =='*' || op =='/' || op =='%'){
	        //input two num;
	        System.out.println("enter two numbers");
	        int num1=sc.nextInt();
	        int num2=sc.nextInt();
	        
	        if(op=='+'){
	            ans=num1+num2;
	        }
	        if(op=='-'){
	            ans=num1-num2;
	        }
	        if(op=='*'){
	            ans=num1*num2;
	        }
	        
	        if(op=='/'){
	            if(num2!=0){
	                ans=num1/num2;
	            }
	        }
	        if(op=='%'){
	            ans=num1%num2;
	        }
	    }else if(op=='x' || op=='X'){
	            break;
	        }else{
	            System.out.println("invalid operator");
	        }
	        System.out.println(ans);
	}
	}
}
