import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String student[]=new String[5];
		for(int i=0;i<5;i++){
		    student[i]=sc.nextLine();
		}
		System.out.print("names of students are: " );
		for(int i=0;i<student.length;i++){
		    System.out.print(student[i]+"  ");
		     if (i==4){
		        System.out.print(";");
		    }
		}
	}
}
