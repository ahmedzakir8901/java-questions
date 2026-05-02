public class Main
{
	public static void main(String[] args) {
		int n=455563;
		int count=0;
		while(n>0){
		    int rem=n%10;
		    if(rem==5){
		        count++;
		    }
		    n=n/10;
		}
		System.out.println(count);
	}
}//this help you to find how many times "5" present in int n=455563;
