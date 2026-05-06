import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your name");//iput from the user
	    String naam=sc.next();
	    String personaliezed =greet(naam);//naam save in personalized as an argument of greet()
	    System.out.println(personaliezed);//personiezed text printed
	}
    static String greet(String name){//string type method with argument "name"
        String greeting="hello " + name;//here hello printed with name eg"hello ahmed"
        return greeting;//this line return string greeting;
    }
}
//stay tuned for next
